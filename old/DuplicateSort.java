import java.util.*;
public class DuplicateSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inputNumbers = new int[10];
        //input
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++){
            inputNumbers[i] = input.nextInt();
        }
        //distinct numbers output
        int[] distinctList = eliminateDuplicates(inputNumbers);
        System.out.print("The disinct numbers are: ");
        for (int num : distinctList){
            if (num != 0){
                System.out.print(num + " ");

            }
        }
    }
    public static int[] eliminateDuplicates(int[] list){
     
            // distinct array
            int[] distinctList = new int[list.length];
            int dIndex = 0;
        
            for (int i : list) {
                boolean isDuplicate = false;
        
                // Check for duplicates among previous elements in distinctList
                for (int j = 0; j < dIndex; j++) {
                    if (i == distinctList[j]) {
                        isDuplicate = true;
                        break;
                    }
                }
        
                // Add element to distinctList if not a duplicate
                if (!isDuplicate) {
                    distinctList[dIndex++] = i;
                }
            }
        
            // Create a new array of the exact size with distinct elements
            int[] result = Arrays.copyOf(distinctList, dIndex);
            return result;
        }
        
        //distinct array 
        /*int distinctLength = list.length;
        int[] distinctList = new int[distinctLength];
        int dIndex = 0;
        
      

        for (int i = 0; i < distinctLength; i++){
            boolean isDuplicate = false;
    
            // Check for duplicates among previous elements; check list vs itself
            for (int j = 0; j < i; j++){
                if (list[i] == list[j]){
                    isDuplicate = true;
                    break;
                }
            }
    
            // Add element to distinctList if not a duplicate
            if (!isDuplicate){
                distinctList[dIndex++] = list[i];
            }
        }*/
        
 
}
    
   

   

