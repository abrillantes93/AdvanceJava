package p3;

import java.util.Scanner;

public class CarAndDriver 
{
    
    public static void main(String[] args) 
    {
        // variable - declaration
        String introMsg = "P2 - 05/31/24 - Anthony Brillantes";

        //car and driver intialization
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Person driver1 = new Person();
        Person driver2 = new Person();
        Person driver3 = new Person();
        //car declarations
        car1.setColor("blue");
        car1.setMake("Ford");
        car1.setModel("F150");
        car1.setYear(2015);
        car1.setHeadroom(180);
        car1.setTransmission("manual");
        car2.setColor("red");
        car2.setMake("Toyota");
        car2.setModel("Camry");
        car2.setYear(2011);
        car2.setHeadroom(160);
        car2.setTransmission("automatic");
        car3.setColor("yellow");
        car3.setMake("Honda");
        car3.setModel("Civic");
        car3.setYear(2008);
        car3.setHeadroom(200);
        car3.setTransmission("automatic");
        
        //main logic 
        System.out.println(introMsg);
        //driver assignment
        driverAssignment(car1, driver1);
        driverAssignment(car2, driver2);
        driverAssignment(car3, driver3);
        //final report + errors
        carAndDriverReport(car1, driver1);
        carAndDriverReport(car2, driver2);
        carAndDriverReport(car3, driver3);
    }

    public static void driverAssignment(Car car, Person driver) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter driver information (name, age, height(cm), canDriveStick (y/n)): "); //input prompt
        //driver assignments
        driver.setName(scanner.next());
        driver.setAge(scanner.nextInt());
        driver.setHeight(scanner.nextInt());
        driver.setCanDriveStick(scanner.next());
        car.setDriver(driver);

        System.out.println("Driver assigned"); //conformation
       
    }
    public static void carAndDriverReport(Car car, Person driver)
    {   
        //report
        System.out.println("___________________________________________________________");
        System.out.println("Car" + car.toString());
        System.out.println("Driver" + driver.toString());
        //error reporting
        if (car.getHeightError()){
            System.out.println("ERROR: Driver is too tall!");
        }
        if (car.getDriverError()){
            System.out.println("ERROR: Driver cannot drive manual transmission!");
        }
    }
}


