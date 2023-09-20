package com.General;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 5; // Change this value to the number of Fibonacci numbers you want to print
        
        System.out.println("Fibonacci Series (First " + n + " numbers):");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
//awsravi