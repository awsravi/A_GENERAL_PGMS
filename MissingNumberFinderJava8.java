package com.General;


import java.util.Arrays;

public class MissingNumberFinderJava8 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6}; // Example input array (missing 3)

        int n = arr.length + 1; // Assuming one number is missing

        int missingNumber = findMissingNumber(arr, n);
        
        System.out.println("Missing number is: " + missingNumber);
    }//awsravi

    public static int findMissingNumber(int[] arr, int n) {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = Arrays.stream(arr).sum();
        
        return expectedSum - actualSum;
    }
}
