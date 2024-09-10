public class FizzBuzz {
    public static void main(String[] args){
        //list 1 - 100, at multiples of 3 fzz and 5 buzz , 3/5 fizzbuzz
        for (int i = 1; i <= 90; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz");
                continue;
            }
            if (i % 3 == 0) {
                System.out.println("Fizz");
                continue;
            }
            if (i % 5 == 0) {
                System.out.println("Buzz");
               continue;
            }
            
           
            System.out.println(i);
            
           
        }
    }
}
