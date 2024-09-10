public class ShuffleString {
    public static void main(String[] args) {
        String S = "Medium";
        int[] indiceArray = new int[]{2,4,5,0,1,3};

        //loop through, move char to position to from indiceArray
        char output[] = new char[S.length()];
        
        for (int i = 0; i < S.length(); i++){
            char swapChar = S.charAt(i);
            int position = indiceArray[i];
            output[position] = swapChar;
        }
        System.out.println(output);
        //OUTPUT IUMMED


    }
}
