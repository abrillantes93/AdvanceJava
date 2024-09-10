public class findDuplicate {
    public static void main(String[] args) {
         int array[] = {3,1,3,2,5,9};

      int j = 1;
        for (int i = 0 ; i < array.length;){
          
            if (array[i] == array[j]){
                int duplicate = array[i];
                System.out.println(duplicate);
                i++;
                break;
            }
            if (j < array.length -1){
                j++;
            }
        }
    
    }
}
