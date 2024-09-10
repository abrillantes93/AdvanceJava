//Program asks user for weight and height (feet+inches),computes their bmi, then interprets if it is healthy or not
import java.util.*;

public class ComputeAndIntrepretBMI {
    public static void main(String[] args){
        //scanner, inputs
        System.out.println("Enter in your weight (lbs)");
        Scanner input = new Scanner(System.in);
        double massLbs = input.nextDouble();
        System.out.println("Enter in your height (feet inches):");
        Scanner inputHeight = new Scanner(System.in);
        double hFeet = inputHeight.nextDouble();
        double hInches = inputHeight.nextDouble();
       //conversions to metric 
        double massKg = massLbs / 2.205;
        double totalHeightFtInches = (hFeet * 12) + hInches;
        double heightMeters = totalHeightFtInches/ 39.37;
        //calculate BMI
        double userBMI = massKg / Math.pow (heightMeters, 2);
        //interpret BMI
        System.out.println("Your BMI is " + userBMI);
        if (userBMI >= 18.5 && userBMI < 25) {
            System.out.println("Your BMI is normal");
        }
         else if (userBMI <18.5) {
            System.out.println("Underweight");
        }

         else if (25 <= userBMI && userBMI < 30 ){
            System.out.println("Overweight");
        }
        else {System.out.println("Obese");}
        



    }
}


//bmi reference formula: mass[kg]/ height^2(meters)
// BMI<18.5 underweight; 18.8 -<25 normal, 25 <= x <30 overweight; 30<=bmi obese