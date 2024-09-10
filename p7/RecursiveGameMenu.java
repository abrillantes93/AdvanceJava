// Anthony Brillantes
// COP 2805C – 91339
//  07/13/24
// P7

package p7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RecursiveGameMenu 
{
        public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("P7 - 07/13/24 - Anthony Brillantes");
        while(true){
            System.out.println("-- Recursion Game Menu ---");
            System.out.println("Select game: Factorial(1) - Fibonacci(2) - Reverse (3) -- Quit(0)");
            try {
                //menu selection 
                int userSelection = scanner.nextInt();
                boolean gameCont = true;
                int errorCount = 0;
                switch (userSelection) {
                    case 0:
                        System.out.println("Exiting the game. Goodbye!");
                        System.exit(0);
                    case 1:
                        // Factorial Game
                        while (gameCont) {
                            try {
                                gameCont = RecursiveGame.FactorialGame(gameCont);                  
                            } catch (InputMismatchException e) {
                                errorCount++;
                                if (errorCount == 3){
                                    System.out.println("Too many attempts. Returning to menu.");
                                    gameCont = false;
                                }
                                System.out.println("Invalid input. Please enter a positive whole number.");
                                scanner.next(); 
                            }
                        }
                        break;
                        
                    case 2:
                        // Fibonacci Game
                        while(gameCont){
                            try {
                                  gameCont = RecursiveGame.FibonacciGame(gameCont);
                            } catch (InputMismatchException e) {
                                if (errorCount == 3){
                                    System.out.println("Too many attempts. Returning to menu.");
                                    gameCont = false;
                                }
                                System.out.println("Invalid input. Please enter a whole number.");
                                scanner.next();
                            } 
                        }
                        break;

                    case 3:
                        // Reverse Game
                        while (gameCont) {
                            try {
                                gameCont = RecursiveGame.ReverseGame(gameCont);
                            } catch (InputMismatchException e) {
                                if (errorCount == 3){
                                    System.out.println("Too many attempts. Returning to menu.");
                                    gameCont = false;
                                }
                                System.out.println("Invalid input. Please enter a whole number.");
                                scanner.next();
                            }
                        }
                        break;
                    }
            } catch (InputMismatchException e) {
                System.out.println("Invalid selection. Please enter a {1,2,3} or {0} to quit.");
                scanner.next();
            }
        }
    }   
}
