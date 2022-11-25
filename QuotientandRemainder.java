package com.bridgelabz.day5;

import java.util.Scanner;

//Java Program to Compute Quotient and Remainder
public class QuotientandRemainder {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int rem = num % 10;
		int quo = num / 10;
		System.out.println(rem + " " + quo);
	}
}
