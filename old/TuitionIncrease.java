public class TuitionIncrease {
    public static void main(String[] args){
        double tuition = 10000;
        double fourYearsTuition = 0;
        
        System.out.println("Tuition starts at $10,000, and increases by 5% every year");
        for (int year = 0; year <= 10; year++){

            
            tuition = tuition + (tuition *.05); 
           
            if (year >= 7){
                fourYearsTuition += tuition; 
            }
            if (year == 10){
            System.out.printf("Tuition after year 10 is %.2f and for the last four years is %.2f.", tuition, fourYearsTuition);
            }
        }  
    }
}
