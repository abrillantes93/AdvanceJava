import java.util.*;

public class CreateFans{
    public static void main(String[] args){

        FanStore fanStore = new FanStore();
        fanStore.PrintStore(); // 0
        Fan FancyFan = new Fan();
        Fan RedFan = new Fan("Fancy Fan", "red");

        fanStore.AddFan(FancyFan);
        fanStore.AddFan(FancyFan); 
        fanStore.AddFan(FancyFan); 
        fanStore.AddFan(RedFan);
        fanStore.AddFan(RedFan);
        fanStore.AddFan(RedFan);
        fanStore.PrintStore(); // 3
        
        System.out.println("Number of blue fans: " + fanStore.GetBlueFans());
        
        
        /*Fan fan1 = new Fan();

        fan1.SetSpeed(Fan._FAST);
        fan1.SetRadius(10);
        fan1.SetColor("yellow");
        fan1.SetON(true);

        System.out.println("Fan 1 is " + fan1.toString());

        Fan fan2 = new Fan();
        fan2.SetSpeed(Fan._MEDIUM);
        fan2.SetRadius(5);
        fan2.SetColor("blue");
        fan2.SetON(false);

        System.out.println("Fan 2 is " + fan2.toString());*/

        // Fan fan1 = new Fan("Fan 1");
        // Fan fan2 = new Fan("Fan 2");
        // fan1.SetON(false);
        // fan1.PrintStatus();
        // fan1.SetON(true);
        // fan1.PrintStatus();
        // fan1.SetSpeedDouble(); // 2
        // fan1.PrintStatus();
        // fan1.SetSpeedDouble(); // 4
        // fan1.PrintStatus();
        // fan1.SetSpeedDouble(); // 8
        // fan1.PrintStatus();
        // fan1.SetSpeedDouble(); // 10
        // fan1.PrintStatus();
        // fan1.SetSpeedDouble(); 
        // fan1.PrintStatus();
        // fan2.PrintStatus();
    }

    //array 
    
}