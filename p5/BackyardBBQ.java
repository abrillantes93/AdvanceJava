package p5;

class BackyardBBQ implements Meal_Cook
{
    //class fields
    private final String device = "grill";
    private double cookTime;
    private double foodWeight;
    private String food;
    private String fuel;
    private final double defaultCookTime = 15; // 15 mins 

    public BackyardBBQ(String food, double foodWeight, String fuel)
    {
        this.food = food;
        this.foodWeight = foodWeight;
        this.fuel = fuel;

    }

    @Override
    public String cook(String food)
    {
        this.cookTime = this.foodWeight * defaultCookTime; //15mins * lbs
        return "Instructions: Cook " + food + " for " + this.cookTime + " mins on the " + this.device +
        ". Flip every " + this.cookTime/4 + " mins.";
    }

    @Override
    public String toString()
    {
        return "Backyard BBQ meal: " +
        "| Food: " + this.food +
        " | Food weight: " + this.foodWeight +
        " | Safe cook time: " + this.cookTime +
        " | Type of fuel used: " + this.fuel         ;
    }
    //mutators

    public String getFood()
    {
        return this.food;
    }

    public double getcookTime()
    {
        return this.cookTime;
    }

    public double getFoodWeight()
    {
        return this.foodWeight;
    }

    public String getFuel()
    {
        return this.fuel;
    }


}
