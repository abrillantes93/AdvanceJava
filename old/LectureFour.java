import java.util.*;
public class LectureFour{
    private final static Scanner input = new Scanner(System.in);
    // private - assessor; variable not accessable outside of class
    //final cannot change variable
    //static -- do not have to call object
    //void - does not return a value
    public static void main(String[] args){
        
        //int x = (int) (Math.random() * 10);
            //returns a random integer b/t 0 and 9
            //.random returns a double, casting an integer returns a whole numbe
        double rand = Math.random() * 10;
      
        System.out.println("Original " + rand);
        System.out.println("Reflected ine value " + (int)rand);
        System.out.println("Value after reflection" + rand);

    }

}
//.ceil round up
//.floor round down
//reflect - does not change value, 
//slide 21, 31, 23, 33