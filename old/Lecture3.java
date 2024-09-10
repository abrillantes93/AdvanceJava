import java.util.*;

public class Lecture3{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String fName = input.nextLine();
        if(fName.contains("Anthony")){
            System.out.println("What's up, Mr.Anthony");
        }
        else if (!fName.isEmpty()){
           System.out.println("Hello, world!, my name is " + fName);
        }            
        else {
            System.out.println("No value found, Try Again");
        }
    }
    }
    
    // ! not
    // && and
    // || or
    // ^ exlusive or