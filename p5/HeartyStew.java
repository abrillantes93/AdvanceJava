package p5;

public class HeartyStew implements Meal_Cook
{
    private String device;
    private double cookTime;
    private double stewVolume;
    private String food;

    private final double defaultCookTime = 5; //mins 

    public HeartyStew(String food, double stewVolume, String device)
    {
        this.food = food;
        this.stewVolume = stewVolume;
        this.device = device;
    }

    @Override
    public String cook(String food)
    {
        this.cookTime = stewVolume * defaultCookTime; //5mins * cups 
        return "Add the " + this.food + " and cook the stew " + 
        " for " + this.cookTime + " mins on the " + device +
        ". Stir every " + this.cookTime/2 + " mins.";
    }

    @Override
    public String toString()
    {
        return "Hearty Stew meal: " +
        " | Ingredients " + this.food +
        " | Stew Volume(cups): " + this.stewVolume +
        " | Safe cook time: " + this.cookTime +
        " | Type of device used: " + this.device 
        ;
    }
    
    //mutators
    public String getFood()
    {
        return this.food;
    }

    public String getDevice()
    {
        return this.device;
    }
    public double getcookTime()
    {
        return this.cookTime;
    }

    public double getstewVolume()
    {
        return this.stewVolume;
    }



}
