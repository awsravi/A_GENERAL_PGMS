package com.General;
public class MagicNumberChecker {
    public static void main(String[] args) {
        int number = 189;// Change this to the desired number

        boolean isMagic = isMagicNumber(number);

        if (isMagic) {
            System.out.println(number + " is a magic number.");
        } else {
            System.out.println(number + " is not a magic number.");
        }
    }
//awsravi
    public static boolean isMagicNumber(int number) {
        while (number > 9) {
            int sum = 0;
            while (number != 0) {
                sum += number % 10; // Add the last digit to the sum
                number /= 10; // Remove the last digit
            }
            number = sum; // Update the number with the sum
        }

        return number == 1;
    }
}
