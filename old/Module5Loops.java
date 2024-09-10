import java.util.*;

public class Module5Loops {
    //4 types of loops
    //for, for/each, do/while, while
    public static void main(String[] args) throws Exception{
        String [] carMakers = new String[]{
            "Ford",
            "Chevy",
            "Honda",
            "Toyota",

        };
        PrintCarMakers(carMakers, 0);
  
        
        
        /*for (String carMaker : carMakers){
            System.out.println(carMaker);
        }
        /*for(int i=0; i < carMakers.length; i++) {
            System.out.println(carMakers[i]);

        }*/
    }

    private static void PrintCarMakers(String[] carMakers, int i) {
          System.out.println(carMakers[i]);
            i++;
        if (i < carMakers.length){
            PrintCarMakers(carMakers, i);
        }
    }
}
