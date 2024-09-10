package p5;

import java.util.Scanner;

public class CookingDinner {
    static Scanner scanner;
    static String mainCourse;

    public static void main(String[] args) {
        System.out.println("P5 - 06/16/24 - Anthony Brillantes");
        System.out.println("What's the main course for dinner? (1) Backyard BBQ (2) Hearty Stew (3) Thanksgiving");
        scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        if (userInput == 1) {
            CookBackyardBBQ();
        } else if (userInput == 2) {
            CookHeartyStew();
        } else if (userInput == 3) {
            CookThanksgivingDinner();
        }

    }

    public static void CookBackyardBBQ() //option 1
    { 
        System.out.println("What are you cooking?");
        scanner = new Scanner(System.in);
        mainCourse = scanner.nextLine();
        System.out.println("How much does it weigh(lbs)?");
        double foodWeight = scanner.nextDouble();
        System.out.println("What type of Fuel?");
        String fuel = scanner.next();
        BackyardBBQ bbqDinner  = new BackyardBBQ(mainCourse, foodWeight, fuel);
        System.out.println(bbqDinner.cook(bbqDinner.getFood()));
        System.out.println(bbqDinner.toString());
        System.out.println("Dinner is ready!");
    }

    public static void CookHeartyStew() //option 2
    {
        System.out.println("What ingredients are you cooking?");
        scanner = new Scanner(System.in);
        mainCourse = scanner.nextLine();
        System.out.println("What is the volume(cups)?");
        double foodWeight = scanner.nextDouble();
        System.out.println("What kind of heating element?");
        String device = scanner.next();
        HeartyStew heartyStew  = new HeartyStew(mainCourse, foodWeight, device);
        System.out.println(heartyStew.cook(heartyStew.getFood()));
        System.out.println(heartyStew.toString());
        System.out.println("Dinner is ready!");
    }
    public static void CookThanksgivingDinner() //option 3
    {

        scanner = new Scanner(System.in);
        System.out.println("How heavy is your turkey?");
        double turkeyWeight = scanner.nextDouble();
        ThanksgivingDinner thanksgivingDinnner  = new ThanksgivingDinner(turkeyWeight);
        System.out.println(thanksgivingDinnner.cook(thanksgivingDinnner.getFood()));
        System.out.println(thanksgivingDinnner.toString());
        System.out.println("Dinner is ready!");
    }
}


