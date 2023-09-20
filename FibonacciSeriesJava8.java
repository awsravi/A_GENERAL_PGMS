package com.General;

import java.util.stream.Stream;

public class FibonacciSeriesJava8 {

	public static void main(String[] args) {
		int n = 10; 

		System.out.println("Fibonacci Series (First " + n + " numbers):");

		Stream.iterate(new int[] { 0, 1 }, fib -> new int[] { fib[1], fib[0] + fib[1] })
		.limit(n)
		.map(fib -> fib[0])
		.forEach(fibonacci -> System.out.print(fibonacci + " "));


       //awsravi
    }
}

