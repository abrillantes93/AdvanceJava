package P4;

import java.util.Scanner;

public class Event {
    //class fields
    private String date;
    private int startTime;
    private int endTime;
    private String locationName;
    private String locationAddress;
    private String eventName;
    private int numberOfGuests;
    private String pointOfContact;
    private double price;
    Scanner scanner;
    
    public Event(){
        
        System.out.println("Enter event date");
        scanner = new Scanner(System.in);
        this.date = scanner.nextLine();
        
        System.out.println("Enter event start time");
        scanner = new Scanner(System.in);
        this.startTime = scanner.nextInt();
        
        System.out.println("Enter event end time");
        scanner = new Scanner(System.in);
        this.endTime = scanner.nextInt();
 
        System.out.println("Enter event location name");
        scanner = new Scanner(System.in);
        this.locationName = scanner.nextLine();

        System.out.println("Enter event location address");
        scanner = new Scanner(System.in);
        this.locationAddress = scanner.nextLine();

        System.out.println("Enter event name");
        scanner = new Scanner(System.in);
        this.eventName = scanner.nextLine();

        System.out.println("Enter number of guests");
        scanner = new Scanner(System.in);
        this.numberOfGuests = scanner.nextInt();

        System.out.println("Enter point of contact");
        scanner = new Scanner(System.in);
        this.pointOfContact = scanner.next();

        System.out.println("Enter event price");
        scanner = new Scanner(System.in);
        this.price = scanner.nextDouble();
    }


    // Setter for date
    public void setDate(String date) 
    {
        this.date = date;
    }

    // Setter for startTime
    public void setStartTime(int startTime) 
    {
        this.startTime = startTime;
    }

    // Setter for endTime
    public void setEndTime(int endTime) 
    {
        this.endTime = endTime;
    }

    // Setter for locationName
    public void setLocationName(String locationName)
     {
        this.locationName = locationName;
    }

    // Setter for locationAddress
    public void setLocationAddress(String locationAddress)
     {
        this.locationAddress = locationAddress;
    }

    // Setter for eventName
    public void setEventName(String eventName)
     {
        this.eventName = eventName;
    }

    // Setter for numberOfGuests
    public void setNumberOfGuests(int numberOfGuests)
     {
        this.numberOfGuests = numberOfGuests;
    }

    // Setter for pointOfContact
    public void setPointOfContact(String pointOfContact)
     {
        this.pointOfContact = pointOfContact;
    }

    // Setter for price
    public void setPrice(double price) 
    {
        this.price = price;
    }

    // Getter for date
    public String getDate()
     {
        return date;
    }

    // Getter for startTime
    public int getStartTime() 
    {
        return startTime;
    }

    // Getter for endTime
    public int getEndTime()
     {
        return endTime;
    }

    // Getter for locationName
    public String getLocationName() 
    {
        return locationName;
    }

    // Getter for locationAddress
    public String getLocationAddress()
     {
        return locationAddress;
    }

    // Getter for eventName
    public String getEventName()
     {
        return eventName;
    }

    // Getter for numberOfGuests
    public int getNumberOfGuests()
     {
        return numberOfGuests;
    }

    // Getter for pointOfContact
    public String getPointOfContact()
     {
        return pointOfContact;
    }

    // Getter for price
    public double getPrice() 
    {
        return price;
    }
   
    //toString
    @Override
    public String toString()
    {
        return "Event details --" +
        " Date: " + date +
        " Start time: " +startTime +
        " End time: " + endTime +
        " Location Name: " + locationName +
        " Address: "+ locationAddress +
        " Event Name: " + eventName + 
        " Number of Guests: " + numberOfGuests +
        " Point of Contact: "+ pointOfContact +
        " Event Price: " + price;
    }

}
