
//Program asks user for month and year (x xxxx), then outputs the number of days in that month.
import java.util.*;
public class NumberOfDaysInMonth {
	public static void main(String[] args){
		//scanner , inputs
        System.out.println("Enter in month (1-12) and year");
		Scanner input = new Scanner(System.in);
		int month = input.nextInt();
		int year = input.nextInt();
		int daysInMonth = 0;
        //switch case
        switch (month) {
			case 1 :
			case 3:
			case 5:
			case 7 :
			case 8 :
			case 10:
			case 12:
				 daysInMonth = 31;
                break;
			case 4:
			case 6:
			case 9:
			case 11:
				 daysInMonth = 30;
                break;
			case 2: //February Leap year- if divisible by 4 and not 100; or divisible by 400
			    if ((year % 4 == 0 && year % 100!=0) || (year % 400 ==0)){
				 daysInMonth = 29; 
            }

			    else {
				 daysInMonth = 28;
             }
                break;
        }
        System.out.println("In the year, "+ year +" ,there are " + daysInMonth + " days in month " + month);
    }
}