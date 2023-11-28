package questions.interview.leetcodes;

import java.util.HashSet;

public class ValidPalindromeString {

    public static boolean isPalindromeStringBuilder(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    public static boolean isPalindrome(String s) {
        String cleanString = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        int left = 0;
        int right = cleanString.length() - 1;

        while (left < right) {
            if (cleanString.charAt(left) != cleanString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

}
