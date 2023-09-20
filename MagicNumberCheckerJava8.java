package com.General;


public class MagicNumberCheckerJava8 {
    public static void main(String[] args) {
        int number = 163; // Change this to the desired number

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
            number = Stream.of(String.valueOf(number).split(""))
                    .mapToInt(Integer::parseInt)
                    .sum();
        }

        return number == 1;
    }
}
