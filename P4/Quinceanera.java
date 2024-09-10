package P4;

import java.util.Scanner;

public class Quinceanera extends BirthdayParty
{
    //class fields
    private final static int age = 15;
    private int numberOfDamas;
    private int numberOfToasts;
    private String danceMusic;

 
    //constuctor
    public Quinceanera() 
    {
        super(age);
        scanner = new Scanner(System.in);
        System.out.println("Enter number of damas");
       
        this.numberOfDamas = scanner.nextInt();

        System.out.println("Enter number of toasts");
      
        this.numberOfToasts = scanner.nextInt();

        System.out.println("Enter type of dance music");
     
        this.danceMusic = scanner.next();
    }
    
    public void setNumberOfDamas(int numberOfDamas)
    {
        this.numberOfDamas = numberOfDamas;
    }
    
    public void setNumberOfToasts(int numberOfToasts)
    {
        this.numberOfToasts = numberOfToasts;
    }

    public void setDanceMusic(String danceMusic)
    {
        this.danceMusic = danceMusic;
    }

    public int getNumberOfDamas() 
    {
        return this.numberOfDamas;
    }

    public int getNumberOfToasts() {

        return this.numberOfToasts;
    }

    public String getDanceMusic() 
    {
        return this.danceMusic;
    }
    @Override
    public String toString()
    {
        return super.toString() +
       " Number of Damas: " + numberOfDamas +
       " Number of Toasts: "+ numberOfToasts + 
       " Type Of Music: " + danceMusic;
    }
}
    
