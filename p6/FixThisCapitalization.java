package p6;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FixThisCapitalization {
    public static void main(String[] args) {
        int attemptsLeft = 3;
        System.out.println("P6 - 06/30/24 - Anthony Brillantes");

        Scanner scanner = new Scanner(System.in);

        while (attemptsLeft > 0) {
            // Prompt user for file name
            System.out.println("Enter file name to be checked for capitalization:");
            String inputFile = scanner.nextLine();

            try {
                // Open file for reading
                FileInputStream input = new FileInputStream(inputFile);
              
                String outputFile = "Corrected_" + inputFile; //name output file
            
                // Open file for writing
                PrintWriter output = new PrintWriter(outputFile);

                // Read and process each line
                Scanner fileScanner = new Scanner(input);
                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    String capitalizedLine = capitalizeFirstWord(line);
                    writeLineToNew(capitalizedLine, output);
                }

                // Close resources
                fileScanner.close();
                output.close();

                // Print completion statement
                System.out.println("File processed and saved as " + outputFile);
                break; // Exit the loop if successful

            } catch (FileNotFoundException e) {
                attemptsLeft--;
                System.out.println("File not found. Number of attempts left: " + attemptsLeft);
                if (attemptsLeft == 0) {
                    System.exit(0);
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static String capitalizeFirstWord(String line) {
        if (line == null || line.isEmpty()) { // empty line
            return line;
        }
        char[] chars = line.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isAlphabetic(chars[i])) { // Capitalize the first alphabetic character found in the word
                chars[i] = Character.toUpperCase(chars[i]);
                break;
            }
        }
        return new String(chars); //return chars array as string
    }

    public static void writeLineToNew(String capitalizedLine, PrintWriter output){
        String regex = "\\b\\w*\\d+\\w*\\b"; 
        Pattern pattern = Pattern.compile(regex);
        try { 

            Matcher matcher = pattern.matcher(capitalizedLine);
            
            // Check for words containing numbers and throw exception if found
            if (matcher.find()) {
                throw new NumbersDoNotBelongInText(matcher.group());
            }
            output.write(capitalizedLine + "\n");
        } catch (NumbersDoNotBelongInText e) {
            System.out.println(e.getMessage());
            // Write the line with the word with number removed
            String cleanedLine = removeWordWithNumber(capitalizedLine, e.getErrorCause()); 
            output.write(cleanedLine + "\n");
        }
    }
        // Method to remove the problematic word from the line
        public static String removeWordWithNumber(String line, String errorCause) {
             // Remove the problematic word from the line
            return line.replaceAll("\\b" + Pattern.quote(errorCause) + "\\b", "");
        }
}

