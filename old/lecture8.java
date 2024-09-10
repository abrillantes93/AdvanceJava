/**
 * double[][] distances = {0,0,0,0,0},{0,0,0,0,0},{1,1,1,1}
 * Declar array ref car
 *      dataType[][] refVar;
 * Create array and assign its reference to variable 
 *      refVar = new dataType [10][10];
 * Combine declaration and creation in one statement
 *      dataType[][] refVar = new dataType[10][10];
 * Alternative syntax 
 *      dataType refVar[][] = new dataType[10][10];
 */
public class lecture8 {
       public static void main(String[] args){
      
        String[][] carMakers = new String[][]{
            {"Chevy","silverado", "LTZ"},
            {"Honda","RIDGELINE","EX"},
            {"Toyota","TUNDRA","TDR"},
            {"Ford","F150","RAPTOR"},
        };
        //System.out.println(carMakers[0][1]);
        // FOR each loop - always moves seqtual (++)
        /*for (String[] carMaker: carMakers){
            System.out.println("Make: " + carMaker[0]);
             System.out.println("Model: " + carMaker[1]);
              System.out.println("Trim: " + carMaker[2]);
        }*/
        for (int i = 0; i < carMakers.length; i++){
            {
                  System.out.println("Make: " + carMakers[i][0]);
             System.out.println("Model: " + carMakers[i][1]);
              System.out.println("Trim: " + carMakers[i][2]);
            }
        }
    }
}
