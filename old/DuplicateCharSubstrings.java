import java.util.*;

public class DuplicateCharSubstrings {
    // Given a string S, return the number of substrings that only have one distinct letter
    public static void main(String[] args) {
        String S = "aaaaaaaaaa";
        int count = 0;

        for (int i = 0; i < S.length(); i++) {
            char char1 = S.charAt(i);
            int j = i + 1;

            // Find the longest substring of the same character
            while (j < S.length() && S.charAt(j) == char1) {
                j++;
            }

            // Calculate the number of substrings formed by this sequence
            int length = j - i;
            count += (length * (length + 1)) / 2;
                //aa 2

            // Move 'i' to the end of this sequence to avoid redundant counting
            i = j - 1;
        }

        System.out.println("Number of substrings with only one distinct letter: " + count);
    }
}
