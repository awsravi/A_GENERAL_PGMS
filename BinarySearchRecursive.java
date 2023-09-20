package com.General;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 7; // Change this to the value you want to search for
        int result = binarySearch(array, target, 0, array.length - 1);
        
        if (result != -1) {
            System.out.println("Element " + target + " found at index " + result);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
//awsravi
    public static int binarySearch(int[] array, int target, int low, int high) {
        if (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == target) {
                return mid;
            }

            if (array[mid] < target) {
                return binarySearch(array, target, mid + 1, high);
            }

            return binarySearch(array, target, low, mid - 1);
        }

        return -1; // Element not found
    }
}
