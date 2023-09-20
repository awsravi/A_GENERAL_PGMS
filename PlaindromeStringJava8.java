package com.General;

import java.util.stream.IntStream;

public class PlaindromeStringJava8 {

	public static void main(String[] args) {
		String input = "racecar";

		if (isPalindrome(input)) {
			System.out.println(input + " is a palindrome.");
		} else {
			System.out.println(input + " is not a palindrome.");
		}
	}//awsravi

	public static boolean isPalindrome(String str) {
		// Remove spaces and convert to lowercase
	String 	str1 = str.replaceAll("\\s", "").toLowerCase();

		// Use IntStream.rangeClosed to check characters from both ends simultaneously
		return IntStream.rangeClosed(0, str1.length() / 2)
				.noneMatch(i -> str1.charAt(i) != str1.charAt(str1.length() - 1 - i));
	}
}
