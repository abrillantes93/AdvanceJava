package P4;

import java.util.Scanner;

public class BirthdayParty extends Event{
    private int age;
    private String cake;
    private int numberOfCandles;
    private String decorations;
    // Scanner scanner;
    //constructor
    public BirthdayParty(int age) //defualt constrctor - age = 0 
    {
        super();    
        this.age = age;
        setCakeCandlesDecorations();
    }
    //mutators
    public void setAge(int age)
    {
        this.age = age;
    }
    public void setCake(String cake)
    {
        this.cake = cake;
    }
    public void setCandles(int numberOfCandles)
    {
        this.numberOfCandles = numberOfCandles;
    }
    public void setDecorations(String decorations)
    {
        this.decorations = decorations;
    }
    public int getAge() {
        return this.age;
    }
    public String getCake() {
        return this.cake;
    }
    public int getNumberofCandles() {
        return this.numberOfCandles;
    }
    public String getDecorations() {
        return this.decorations;
    }
    public void setCakeCandlesDecorations(){
        System.out.println("Enter in cake");
       
        this.cake = scanner.next();

        System.out.println("Enter in number of candles");
       
        this.numberOfCandles = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Enter in decorations");
        
        this.decorations = scanner.nextLine();

    }
    //toString
    @Override
    public String toString()
    {
        return super.toString() +
        " Age: " + this.age + 
        " Cake: "+ cake + 
        " Number of Candles: " + numberOfCandles + 
        " Decorations: " + decorations;
    }
    //Getters?
    
}
