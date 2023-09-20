package com.General;

public class PalindromeString {

	public static void main(String[] args) {
		String input = "Racecar";

		if (isPalindrome(input)) {
			System.out.println(input + " is a palindrome.");
		} else {
			System.out.println(input + " is not a palindrome.");
		}
	}
//awsravi
	public static boolean isPalindrome(String str) {
		// Remove spaces and convert to lowercase
		str = str.replaceAll("\\s", "").toLowerCase();
		return isPalindromeRecursive(str, 0, str.length() - 1);
	}

	private static boolean isPalindromeRecursive(String str, int left, int right) {
		if (left >= right) {
			// Base case: If left index is greater than or equal to right index, it's a
			// palindrome.
			return true;
		}

		// Compare characters at left and right indices
		if (str.charAt(left) != str.charAt(right)) {
			// If characters don't match, it's not a palindrome
			return false;
		}

		// Recursively check the substring between left+1 and right-1
		return isPalindromeRecursive(str, left + 1, right - 1);
	}
}
