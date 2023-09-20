package com.General;

public class MissingNumberFinder {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 5, 6 }; // Example input array (missing 3)

		int n = arr.length + 1; // Assuming one number is missing
		int expectedSum = n * (n + 1) / 2;
		int actualSum = 0;

		for (int num : arr) {
			actualSum += num;
		}

		int missingNumber = expectedSum - actualSum;
		System.out.println("Missing number is: " + missingNumber);
	}
}
//awsravi