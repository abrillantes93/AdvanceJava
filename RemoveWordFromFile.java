import java.io.*;
import java.util.*;

public class RemoveWordFromFile {

    public static void main(String[] args) {
        // Ensure correct number of arguments
        if (args.length != 3) {
            System.out.println("Usage: java RemoveWordFromFile <inputFilePath> <outputFilePath> <wordToRemove>");
            return;
        }

        String inputFilePath = args[0];
        String outputFilePath = args[1];
        String wordToRemove = args[2];

        try {
            // Read input file
            File inputFile = new File(inputFilePath);
            Scanner scanner = new Scanner(inputFile);
            StringBuilder content = new StringBuilder();
            int wordCount = 0;

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (word.equals(wordToRemove)) {
                        wordCount++;
                    } else {
                        content.append(word).append(" ");
                    }
                }
                content.append("\n");
            }
            scanner.close();

            // Write to output file
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));
            writer.write(content.toString().trim());
            writer.close();

            System.out.println("Number of words removed: " + wordCount);
        } catch (FileNotFoundException e) {
            System.out.println("Input file not found: " + inputFilePath);
        } catch (IOException e) {
            System.out.println("Error writing to output file: " + outputFilePath);
        }
    }
}
