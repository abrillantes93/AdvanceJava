public class RecursivePalindromeUsingSubstring {
    public static boolean isPalinDrome(String s){
        if (s.length() <= 1) //base case
            return true;
        else if (s.charAt(0) != s.charAt(s.length() -1)) 
            return false;
        else 
            return isPalinDrome(s.substring(1, s.length() - 1)); 
    }
}
