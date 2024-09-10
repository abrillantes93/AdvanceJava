import java.util.*;/**
 * OverloadedAvgArray
 */
public class OverloadedAvgArray {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter in 10 numbers");
        //assign values to user array
        double[] userList = new double[10];
       int index = 0 ;
       for (double num : userList){
            userList[index ++] = userInput.nextDouble();
       }
       double average = average(userList);
       System.out.println("The average of your inputs is: " + average);
        
    }
    public static int average(int[] array){
        int sum = 0;
            //for each loop - add value in array to sum
        for (int num : array){
            sum += num;
        }
        int average = sum / array.length;
            
        return average;
    }

    public static double average(double[] array){
        double sum = 0;
            //for each loop - add value in array to sum
        for (double num : array){
            sum += num;
        }
        double average = sum / array.length;
            
        return average;    
    
    }
    
}