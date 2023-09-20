package com.General;

import java.util.Optional;
import java.util.stream.IntStream;

public class BinarySearchRecursiveJava81 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 10; // Change this to the value you want to search for

        Optional<Integer> result = IntStream.range(0, array.length)
                .filter(i -> array[i] == target)
                .boxed()
                .findFirst();
//awsravi
        if (result.isPresent()) {
            System.out.println("Element " + target + " found at index " + result.get());
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}
