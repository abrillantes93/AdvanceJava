import java.util.*;

public class SortNumbers {
    public static void main(String[] args){
        System.out.printf("Enter in 3 numbers to sort: ");
        Scanner input = new Scanner(System.in);
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        displaySortedNumbers(num1, num2, num3);

    }
    public static void displaySortedNumbers (double num1, double num2, double num3){
        double[] numbers = { num1, num2, num3};
        //bubble sort
        int n = numbers.length;
        for (int i = 0; i < n-1; i++){
            // j = index variable , i is control variable, n number of elements in array 
            for (int j = 0; j < n - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    //swap 
                    double holdV = numbers[j];
                    numbers[j] = numbers[j +1];
                    numbers[j+1] = holdV;

                }
            }
        }
        System.out.println("Sorted Numbers: " + Arrays.toString(numbers));
    }
    //.sort function
    /*public static void displaySortedNumbers(double num1, double num2, double num3){
        double[] numbers ={  num1, num2, num3};
        Arrays.sort(numbers);
        System.out.println("Sorted Numbers: " + Arrays.toString(numbers));
    } */
}

/*
In the context of the nested loops used for sorting in the displaySortedNumbers method, j is a variable used as an index within the array.

The outer loop, controlled by variable i, iterates through the array from the first element to the second-to-last element. For each iteration of the outer loop, the inner loop, controlled by variable j, starts from the first element and goes up to n - i - 1, where n is the total number of elements in the array.

This inner loop essentially compares adjacent elements in the array (numbers[j] and numbers[j + 1]) and performs the swapping if necessary to sort the elements in ascending order using the bubble sort algorithm.


