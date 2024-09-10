package P4;

import java.util.Scanner;

public class EventPlanner {
    public static void main(String[] args) 
    {
        System.out.println("P4 - 06/07/24 - Anthony Brillantes");       //print course assignment, date , name
        System.out.println("EVENT PLANNER -- ENTER IN NUMBER OF EVENTS TO CREATE: "); //prompt number of events
        Scanner scanner = new Scanner(System.in);
        
        //Event Array Creation
        Event eventArray[] = new Event[scanner.nextInt()]; //array of events

        for (int i = 0; i < eventArray.length; i++){ //Event creation loop
            eventArray[i] = eventCreation();
            System.out.println("Event added!");
        }
        
        //print event details
        for (int i = 0; i < eventArray.length; i++){

            System.out.println(eventArray[i].toString());
        }
    }

    public static Event eventCreation()  //choose event type + fields
    {
        System.out.println("Enter type of event: general(1), birthday party(2), quinceanera(3): "); 
        Scanner scanner = new Scanner(System.in);
        int eventChoice = scanner.nextInt();

        if (eventChoice == 1){ //if event
            Event newEvent = new Event();
            return newEvent;
        }

        if (eventChoice ==2 ){ //if birthday
            System.out.println("Enter age: ");
            int age = scanner.nextInt();
            BirthdayParty newEvent = new BirthdayParty(age);
            return newEvent;
        }
        if (eventChoice == 3){ //if quinceanera
            Quinceanera newEvent = new Quinceanera();
            return newEvent;
        }

        return null;
    }
}
