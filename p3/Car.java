package p3;

public class Car {
    // variable initialization
    private String make;
    private String model;
    private int year;
    private String color;
    private int headroom;
    private String transmission;
    private Person driver;
    private boolean heightError;
    private boolean driverError;

    // Constructor (optional, if you want to initialize some variables by default)
    public Car() 
    {
        this.heightError = false;
        this.driverError = false;
    }

    // Accessors (getters)
    public String getColor() 
    {
        return color;
    }

    public String getModel() 
    {
        return model;
    }

    public int getYear() 
    {
        return year;
    }

    public Person getDriver() 
    {
        return driver;
    }

    public int getHeadroom() 
    {
        return headroom;
    }

    public String getMake() 
    {
        return make;
    }

    public String getTransmission() 
    {
        return transmission;
    }

    public boolean getHeightError() 
    {
        return heightError;
    }

    public boolean getDriverError() 
    {
        return driverError;
    }

    // Mutators (setters)
    public void setColor(String color) 
    {
        this.color = color;
    }

    public void setDriver(Person driver) 
    {
        this.driver = driver;

        if (driver.getHeight() > this.headroom) { //if driver is too tall - heightError = true
            this.heightError = true;
        } else {
            
            this.heightError = false;
        }
        if (this.getTransmission().equals("manual") && driver.getCanDriveStick().equalsIgnoreCase("n")){ //
            this.driverError = true;
        }   else {
            this.driverError = false;
        }
    }

    public void setHeadroom(int headroom) 
    {
        this.headroom = headroom;
    }

    public void setMake(String make) 
    {
        this.make = make;
    }

    public void setModel(String model) 
    {
        this.model = model;
    }

    public void setTransmission(String transmission) 
    {
        this.transmission = transmission;
    }

    public void setYear(int year) 
    {
        this.year = year;
    }

    public void setHeightError(boolean heightError) 
    {
        this.heightError = heightError;
    }

    public void setDriverError(boolean driverError) 
    {
        this.driverError = driverError;
    }

    @Override
    public String toString() 
    {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", headroom=" + headroom +
                ", transmission='" + transmission + '\'' +
                ", driver=" + driver.getName() +
                '}';
    }
}
