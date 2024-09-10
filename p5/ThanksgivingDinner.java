package p5;

public class ThanksgivingDinner implements Meal_Cook
{
    private final String device = "oven";
    private double cookTime;
    private double turkeyWeight;
    private final String food = "Turkey";
    private final double defaultCookTime = 10; // 10 mins 

    public ThanksgivingDinner(double turkeyWeight)
    {
        this.turkeyWeight = turkeyWeight;
    }

    @Override
    public String cook(String food) //print cooking instructions
    {
        this.cookTime = this.turkeyWeight * defaultCookTime; //10mins * lbs
        return "Cook the " + food + " for " + this.cookTime + " mins in the " + this.device;
    }

    @Override
    public String toString()
    {
        return "Thanksgiving Dinner: " +
        " | Turkey Weight(lbs): " + this.turkeyWeight +
        " | Safe Cook Time(mins): " + this.cookTime +
        " | Type of device used: " + this.device
        ;
    }
    //mutators
    public String getFood()
    {
        return this.food;
    }
    public double getSafeCookTime()
    {
        return this.cookTime;
    }

    public double getFoodWeight()
    {
        return this.turkeyWeight;
    }

}
