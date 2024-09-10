
/*
Name: Anthony Brillantes
Course: COP-2805C-91339 Java Advanced
Assignment: D1
Date: 5/16/2024
*/
public class Introduction //Class header
{
    public static void main(String[] args) //main method
    {
        //variable delcaration
        String introMsg = "Hello, My name is Anthony. I am majoring in Computer Programming and I plan to finish my program this summer." +
        "I am aspiring to become a software developer. The last movie I enjoyed was Dune 2 and I hope there is a sequel soon.";
        String errorMsg = "Intro is empty!";
        //message branch
        if (!introMsg.isEmpty()) { //if intro is not empty, print intro
           System.out.println(introMsg);
        }
        else { //if intro is empty print error
            System.out.println(errorMsg);
        }
    }

  
}



