package com.General;

import java.util.stream.LongStream;

public class FactorialJava8 {
	public static void main(String[] args) {
		int num = 5;

		long factorialResult = calculateFactorial(num);

		System.out.println("Factorial: " + factorialResult);
	}

	public static long calculateFactorial(int num) {
		if (num < 0) {

		}

		return LongStream.rangeClosed(1, num).reduce(1, (x, y) -> x * y);
	}
}
//awsravi