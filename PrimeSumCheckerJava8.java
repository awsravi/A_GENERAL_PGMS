package com.General;

import java.util.stream.IntStream;

public class PrimeSumCheckerJava8 {
    public static void main(String[] args) {
        int number = 18; // Change this to the desired number

        findPrimeSumPairs(number);
    }//awsravi

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        return IntStream.rangeClosed(2, (int) Math.sqrt(num))
                .noneMatch(i -> num % i == 0);
    }

    public static void findPrimeSumPairs(int number) {
        System.out.println("Number = " + number);
        System.out.println("Prime Sum Pairs:");

        IntStream.rangeClosed(2, number / 2)
                .filter(i -> isPrime(i) && isPrime(number - i))
                .forEach(i -> System.out.println(number + " = " + i + " + " + (number - i)));
    }
}
