package com.General;
public class PrimeSumChecker {
    public static void main(String[] args) {
        int number = 18; // Change this to the desired number

        findPrimeSumPairs(number);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }//awsravi
        return true;
    }

    public static void findPrimeSumPairs(int number) {
        System.out.println("Number = " + number);
        System.out.println("Prime Sum Pairs:");

        for (int i = 2; i <= number / 2; i++) {
            int complement = number - i;

            if (isPrime(i) && isPrime(complement)) {
                System.out.println(number + " = " + i + " + " + complement);
            }
        }
    }
}
