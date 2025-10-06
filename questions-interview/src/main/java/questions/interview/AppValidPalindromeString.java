package questions.interview;

import questions.interview.leetcodes.ValidPalindromeString;

public class AppValidPalindromeString {
	public static void main(String[] args) {

		/*
			Testing Valid Palindrome String -> Level: Easy

			A phrase is a palindrome if, after converting all uppercase letters into lowercase
			letters and removing all non-alphanumeric characters, it reads the same forward and
			backward. Alphanumeric characters include letters and numbers.

			Given a string s, return true if it is a palindrome, or false otherwise.

			Example 1:
			Input: s = "A man, a plan, a canal: Panama"
			Output: true
			Explanation: "amanaplanacanalpanama" is a palindrome.
		 */
		String inputTrue = "A man, a plan, a canal: Panama";
		String inputFalse = "A man, a plan, a canal: Panamazxzxz";

		//Testing String Builder Output: true
		long startTimeStringBuilderTrue = System.currentTimeMillis();
		boolean resultStringBuilderTrue = ValidPalindromeString.isPalindromeStringBuilder(inputTrue);
		long endTimeStringBuildertrue = System.currentTimeMillis();
		System.out.println("Using StringBuilder: " + resultStringBuilderTrue);
		System.out.println("Execution time with StringBuilder: " + (endTimeStringBuildertrue - startTimeStringBuilderTrue) + " ms");

		//Testing While Output: true
		long startTimeWhileTrue = System.currentTimeMillis();
		boolean resultWhileTrue = ValidPalindromeString.isPalindrome(inputTrue);
		long endTimeWhileTrue = System.currentTimeMillis();
		System.out.println("Using while: " + resultWhileTrue);
		System.out.println("Execution time with while: " + (endTimeWhileTrue - startTimeWhileTrue) + " ms");

		//Testing String Builder Output: false
		long startTimeStringBuilderFalse = System.currentTimeMillis();
		boolean resultStringBuilderFalse = ValidPalindromeString.isPalindromeStringBuilder(inputFalse);
		long endTimeStringBuilderFalse = System.currentTimeMillis();
		System.out.println("Using StringBuilder: " + resultStringBuilderFalse);
		System.out.println("Execution time with StringBuilder: " + (endTimeStringBuilderFalse - startTimeStringBuilderFalse) + " ms");

		//Testing While Output: true
		long startTimeWhileFalse = System.currentTimeMillis();
		boolean resultWhileFalse = ValidPalindromeString.isPalindrome(inputFalse);
		long endTimeWhileFalse = System.currentTimeMillis();
		System.out.println("Using while: " + resultWhileFalse);
		System.out.println("Execution time with while: " + (endTimeWhileFalse - startTimeWhileFalse) + " ms");

	}
}