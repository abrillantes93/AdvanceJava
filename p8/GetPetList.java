// Anthony Brillantes
// COP 2805C – 91339
// 07/19/2024
// P8 
package p8;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;

public class GetPetList 
{
    public static void main(String[] args) 
    {
        System.out.println("P8 - 07/17/24 - Anthony Brillantes");
        Scanner scanner = new Scanner(System.in);
        boolean cont = true;
        int attemptsLeft = 3;

        while (cont){ //main program loop
            if (attemptsLeft == 0){ //error count
                System.out.println("Too many attempts. Exiting Program");
                System.exit(0);
            }
            System.out.println("Pet Records - Enter file name to be processed(or Q to exit): ");
            String inputFile = scanner.nextLine();

            if (inputFile.equalsIgnoreCase("Q")){ //quit function
                System.out.println("GoodBye");
                System.exit(0);
            }
            
            try { //file processing
            
                FileInputStream input = new FileInputStream(inputFile);
                Scanner fileScanner = new Scanner(input);
                attemptsLeft = 3; //reset attempts after successful file 
                List<Pet> petList = new ArrayList<>();
                while (fileScanner.hasNextLine()){
                    String petRecord = fileScanner.nextLine();
                    try { //record processing - by line - pass record AND list
                        processPetRecord(petRecord, petList);

                    } catch (PetException e) {
                        System.out.println(e.getMessage());
                    }
                }
                for (Pet pet : petList) { //iterate petList --> call walk function
                    if (pet instanceof WalkMyPet){
                    String walkMsg = ((WalkMyPet) pet).walk("park");
                    System.out.println(walkMsg);
                    }
                }
                } catch (FileNotFoundException e){
                    System.out.println("File not found.");
                    attemptsLeft--;
                    System.out.println("Attempts Left: " + attemptsLeft);
                }
        }
    }

    public static void processPetRecord(String petRecord, List<Pet> petList) throws PetException 
    {
        //split data in record - general pet fields -> children fields 
        String[] petRecordSplit = petRecord.split(":");
        String petSpecies = petRecordSplit[0];
        String petName = petRecordSplit[1]; 
        stringRegexCheck(petName);
        int petAge;
        String petColor = petRecordSplit[3];    
        stringRegexCheck(petColor);
        String petGender = petRecordSplit[4]; 
        stringRegexCheck(petGender);
        int expectedRecordLength;
        
     
        try { //parse age
            petAge = Integer.parseInt(petRecordSplit[2]);
        } catch (NumberFormatException e) {
            throw new PetException("Invalid age format for record: " + petRecord);
        }
    
        if (petSpecies.equalsIgnoreCase("dog")) { 
            //Dog pet example - Dog:jerome:2:brown:male:mutt:waggy:slobbery:true
            expectedRecordLength = 9;
            if (petRecordSplit.length != expectedRecordLength) {
                throw new PetException("Expected " + expectedRecordLength + " fields for dog, found " + petRecordSplit.length);
            }
    
            String dogBreed = petRecordSplit[5];
            stringRegexCheck(dogBreed);
            String tailWag = petRecordSplit[6];
            String slobber = petRecordSplit[7];

            try {
                boolean canCatchBall = parseBooleanStrict(petRecordSplit[8]);
                Dog petDog = new Dog(petName, petColor, petGender, petAge, dogBreed, tailWag, slobber, canCatchBall);
                petList.add(petDog); //add pet
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
            
    
        } else if (petSpecies.equalsIgnoreCase("bird")) {
            //bird pet example - //example data structure - bird:Bessie:3:green:female:pidgeon:yes:10
            expectedRecordLength = 8;
            if (petRecordSplit.length != expectedRecordLength) {
                throw new PetException("Expected " + expectedRecordLength + " fields for bird, found " + petRecordSplit.length);
            }
            
            String birdSpecies = petRecordSplit[5];
            stringRegexCheck(birdSpecies);
            String canTalk = petRecordSplit[6];
            int flightAltitude;
    
            try {
                flightAltitude = Integer.parseInt(petRecordSplit[7]);
            } catch (NumberFormatException e) {
                throw new PetException("Invalid flight altitude format for bird in record: " + petRecordSplit[7]);
            }
    
            Bird petBird = new Bird(petName, petColor, petGender, petAge, birdSpecies, canTalk, flightAltitude);
            petList.add(petBird); //add pet
    
        } else if (petSpecies.equalsIgnoreCase("turtle")) {
            expectedRecordLength = 7;
            if (petRecordSplit.length != expectedRecordLength) {
                throw new PetException("Expected " + expectedRecordLength + " fields for turtle, found " + petRecordSplit.length);
            }
    
            String habitat = petRecordSplit[5];
            try {
                boolean requiresHeat = parseBooleanStrict(petRecordSplit[6]);
                Turtle petTurtle = new Turtle(petName, petColor, petGender, petAge, habitat, requiresHeat);
                petList.add(petTurtle); //add pet
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
              
        } else {
            throw new PetException("Unknown pet species: " + petSpecies);
        }
    }

    private static boolean parseBooleanStrict(String input) {
        if ("true".equals(input)) {
            return true;
        } else if ("false".equals(input)) {
            return false;
        } else {
            throw new IllegalArgumentException("Invalid boolean value: " + input);
        }
    }

    private static void stringRegexCheck(String input) throws PetException 
    {
        String regex = "^[a-zA-Z]+$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        
        if (!matcher.matches()) {
            throw new PetException("Invalid format - expected letters only. Entry: " + input);
        }
    }
}



