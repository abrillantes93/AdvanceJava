package p7;

import java.util.Scanner;

public class RecursiveGame {
    static Scanner scanner = new Scanner(System.in);

    public static boolean FactorialGame(boolean gameCont){ //factorial game - option 1
        System.out.println("Factorial Game. Enter a positive whole number: ");
        int factorialInput = scanner.nextInt();
        
        if (factorialInput < 0) { //if negative clear line - restart game loop
            System.out.println("Invalid input. Please enter a positive whole number.");
            scanner.nextLine();
            return gameCont = true;
        } else {   // exit the loop after successful input and output
            long factorialOutput = Factorial(factorialInput);
            System.out.println("Factorial of " + factorialInput + " is " + factorialOutput);
           return gameCont = false;
        }     
    }

    public static boolean FibonacciGame(boolean gameCont){
        System.out.println("Fibonacci Game. Enter a positive whole number: ");
        int userIndex = scanner.nextInt();
        if (userIndex < 0){ 
            System.out.println("Invalid input. Please enter a positive whole number.");
            scanner.nextLine();
            return gameCont = true;
        } else {
            System.out.println("Fibonacci series up to " + userIndex + " : ");
            for (int i = 0; i <= userIndex; i++) {
                System.out.print(Fibonacci(i) + " ");
            }
            System.out.println("");
            return gameCont = false;
        }   
    }

    public static boolean ReverseGame(boolean gameCont){
        System.out.println("Reverse Game. Enter a whole number: ");
        int reverseInput = scanner.nextInt();
        if (reverseInput < 0){ 
            System.out.println("Invalid input. Please enter a positive whole number.");
            scanner.nextLine();
            return gameCont = true;
        } else{
            RecursiveGame.Reverse(reverseInput);
            return gameCont = false;
        }
    }

    private static long Reverse(int index)
    { //print index -->call func(index - 1)...print 0 --> return 0
        if (index == 1){ //base case
            System.out.println(1);
            return 1;
        } 
        else 
            System.out.print(index + " ");
            return Reverse(index - 1); //recursive call
    }

    private static long Factorial(int index)
    {//index * index - 1...1*1
        if (index == 0){ //base case
            return 1;
        }
        else 
            return index * Factorial(index-1); //recursive call
    }

    private static long Fibonacci(int index)
    { //fib(index) = fib(index - 1) + fib(index + 1)

        if (index == 0){ //base case
            return 0;
        } else if (index == 1){ //base case
            return 1;
        } else
            return Fibonacci(index - 1 ) + Fibonacci(index - 2); //recursive call 
    }

}
