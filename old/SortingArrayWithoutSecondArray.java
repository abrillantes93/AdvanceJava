import java.util.Arrays;

public class SortingArrayWithoutSecondArray{
    //keep check of read and write index
    //Start from the back
    //Problem - move 0 to front, modify array in place, no second array
    public static void main(String[] args) {
        int inputArray[] = {};
        int writeIndex = inputArray.length - 1;
        int readIndex = inputArray.length - 1;
        if (inputArray.length == 0) {
            System.exit(0);
        }
        //while loop - moves /= 0 values to end 
        System.out.println(Arrays.toString(inputArray));
        while (readIndex >= 0){
            if (inputArray[readIndex] != 0){
                inputArray[writeIndex] = inputArray[readIndex];
                writeIndex--;
            }
            readIndex--;
        }
        //while loop - swaps 0 to inital positions
        while (writeIndex >= 0){
            inputArray[writeIndex] = 0;
            writeIndex--;
        }
        System.out.println(Arrays.toString(inputArray));

        
    }
}