package p3;

public class Person
{   
    // variable intailization
    private String name;
    private int age;
    private int height;
    private String canDriveStick;
    //mutators
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    } 
    public int getHeight() 
    {
        return height;
    }
    public String getCanDriveStick()
    {
        return canDriveStick;
    }

    public void setName(String name) 
    {
        this.name = name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public void setHeight(int height) 
    {
        this.height = height;
    }
    public void setCanDriveStick(String canDriveStick) 
    {
        this.canDriveStick = canDriveStick;
    }
    //toString
    @Override
    public String toString() 
    {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", canDriveStick='" + canDriveStick + '\'' +
                '}';
    }
}