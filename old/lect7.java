/*arrays can only contain the same data type
 *  double[] myList = new double[10]
 * data type[] arrayName = new datatype[array size]
 * creating array 
 * myList = new double[10]
 * empty array - default value ( 0 or null, depends on data type)
 * Using Indexed Variables
 *       myList[2] = myList[0] + myList[1];
 * Array Initializers
 *      double[] myList = {1.9, 2.9, 3.4, 3.5};
 *      Declares, creates, and initializes - {} instead of "new"
 *          equiv to double[] myList = new double[4];
 *                      myList[0] = 1.9;
 *                      myList[1] = 2.9;
 *                      myList[2] = 3.4;
 *                      myList[3] = 3.5;
 */
public class lect7{
    public static void main(String[] args){
       /*  int[] values = new int[5];
        for (int i = 0; i < 5; i ++){
            values[i] = i + values [i];
        }
        values[0] = values[1] + values[4];
        System.out.println(values[0]); */
        String[] carMakers = new String[]{
            "Chevy",
            "Honda",
            "Toyota",
            "Ford",
        };

        // FOR each loop - always moves seqtual (++)
        for(String carMaker : carMakers){
            System.out.println(carMaker);

        }
        /*for (int i = 0; i < carMakers.length; i++){
            System.out.println(carMakers[i]);
        }*/
    } 

}
/* for int i = 0; i < myList.length - 1; i++{
    int j= (int) (Math.)
} */