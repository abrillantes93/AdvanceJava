//Class converts user input in Celsius to degrees in Fahrenheit
import java.util.*;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        System.out.println("Please enter a degree in celsisus.");
            Scanner input = new Scanner(System.in); 
            double degreesC = input.nextDouble();
            double degreesF = (9/5)* degreesC + 32;
            System.out.println(degreesC + " Celsius is " + degreesF + " Fahrenheit ");
        



    }

}
    
