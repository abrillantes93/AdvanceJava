import java.util.*;

public class Notes2_2 {
    public static void main (String[] args){
        System.out.println("Please enter the radius of the circle");
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        double area = Math.pow(radius, 2) * Math.PI;
        System.out.println("The area of the circle " + area);    }
       
    }
