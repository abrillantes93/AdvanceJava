import java.util.*;
public class Fibon {
    public static void main(String[] args) {
        int numberOfSteps = 10;
            System.out.println(Fib(numberOfSteps));
    }
        public static int Fib(int numberOfSteps){
        int num1 = 0;
       int num2 = 1;
       int sum = 0; 
       //f(0)=0 
       //f(1)= 1
       //f(2) = 1
       //f(3) = 2
       //f(4) = 3
       //f(5) = 5
       if  (numberOfSteps == 0){
        return 0;
       }
       if (numberOfSteps == 1) {
        return 1;
        
       }
       // for (int i = )
       for (int i = numberOfSteps; i > 1; i--){
        sum = num1 + num2;
        num1 = num2;
        num2 = sum;
        
       }
       
      return sum;
       

       
    }
}

       