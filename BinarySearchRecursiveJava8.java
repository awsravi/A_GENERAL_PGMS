package com.General;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.IntStream;

public class BinarySearchRecursiveJava8 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 7; // Change this to the value you want to search for

        Optional<Integer> result = binarySearch(array, target);
        
        if (result.isPresent()) {
            System.out.println("Element " + target + " found at index " + result.get());
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }//awsravi

    public static Optional<Integer> binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midValue = array[mid];

            if (midValue == target) {
                return Optional.of(mid);
            } else if (midValue < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return Optional.empty(); // Element not found
    }
}
