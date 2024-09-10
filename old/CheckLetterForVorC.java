import java.util.*;

public class CheckLetterForVorC {
    public static void main(String[] args){
        String vowels ="aeiou";
        
        System.out.printf("Enter a letter: ");
        Scanner input = new Scanner(System.in);
        
        String letter = input.nextLine();
        char ch = letter.charAt(0);

       if ((!Character.isLetter(ch)) || letter.length() != 1){
            System.out.printf("Invalid Entry, Please try again.");
            } 
            else if (vowels.indexOf(Character.toLowerCase(ch)) > -1){
                System.out.println(ch + " is a vowel.");
        }  
             
        System.out.println(ch + " is a consonant.");
        }
    }

