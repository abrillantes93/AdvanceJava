/*/ class Circle{
    double radius = 1.0; Data Field
    Construct a circle object
        Circle(){
        }
        Circle(double newRadius){
         radius = newRadius;
        }

    double getArea(){ Method
        return radius * radius * 3.14159;
    }
    default constructor  -- no arg

    to reference an object, assign the object to a reference variable
        to declare a reference variable 
            ClassName objectRefVar
        Declaring/Creating Object in single step
            ClassName objectRefVar = new ClassName();
                Circle myCircle = new Circle(); <--- Create an object
        Referencing the object's data
            objectRefVar.data
                myCircle.radius
        Invoking object's method
            objectRefVar.methodName(arguments)
                myCircle.getArea()
}

*/
import java.util.*;

public class lecture9{
    public static void main(String[] args){
    Cars ford = new Cars("Ford", "F-150", "Raptor");
    
    System.out.println("Make: " + ford.GetMake());
    System.out.println("Model: " +ford.GetModel());
    System.out.println("Trim: " + ford.GetTrim());
    

    Cars chevy = new Cars();

    chevy.SetMake("Chevorlet");
    chevy.SetModel("Silverado");
    chevy.SetTrim("Ltz");

    System.out.println("Make: " + chevy.GetMake());
    System.out.println("Model: " + chevy.GetModel());
    System.out.println("Trim: " + chevy.GetTrim());
    }
    

}