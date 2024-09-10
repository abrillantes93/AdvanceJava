import java.util.*;

public class AreaOfHexagon{
    public static void main(String[] args){
        System.out.printf("Enter the side: ");
        Scanner input = new Scanner(System.in);
        double side = input.nextDouble();
        double area = (6 * Math.pow(side, 2))/ (4 * Math.tan(Math.PI/6));
        System.out.printf("The area of the hexagon is: %f ", area);

    }
}