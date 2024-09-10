public class booleantest 
{
        public static void main(String[] args) 
        {
            String trueString = "true";
            String falseString = "false";
    
            boolean trueValue = parseBooleanStrict(trueString);
            boolean falseValue = parseBooleanStrict(falseString);

    
            System.out.println("The boolean value of \"" + trueString + "\" is: " + trueValue);
            System.out.println("The boolean value of \"" + falseString + "\" is: " + falseValue);
        }

        public static boolean parseBooleanStrict(String input) {
            if ("true".equals(input)) {
                return true;
            } else if ("false".equals(input)) {
                return false;
            } else {
                throw new IllegalArgumentException("Invalid boolean value: " + input);
            }
        }
}
    

