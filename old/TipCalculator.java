//Class asks for user to input subtotal and gratuity rate and then computes gratuity and total

import java.util.*;

public class TipCalculator {
    public static void main(String[] args) {
        System.out.print("Enter the subtotal and a gratuity rate: ");
        Scanner input = new Scanner(System.in);
        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();
        //converts gratuity rate into precentage then gives gratuity amount
        double gratuity = (gratuityRate * 0.01) * subtotal;
        double total = subtotal + gratuity;
       
        System.out.println("The gratuity is $" + gratuity + " and the total is $" + total);

    }
    
}
