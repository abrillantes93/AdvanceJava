import java.util.*;

public class SumOfDigitsInInt{
    public static void main(String[] args){
        System.out.println("Enter an integer: ");
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        System.out.println("The sum of the digits in " + n + " is " + sumDigits(n));

    }

    public static int sumDigits(long n){
        //declare sum
        int sum = 0;
        while (n > 0){
            //cast n as int
            int digit = (int)(n % 10);
            sum += digit; 
            //removes 10 place - int holds no decimals
            n /= 10;
        }
        return sum;
    }
}