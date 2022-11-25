package com.bridgelabz.day5;

import java.util.Scanner;

//Java Program to Swap Two Numbers
public class SwapNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = scanner.nextInt();

		System.out.println("Enter the second number");
		int b = scanner.nextInt();

		int c = a;
		a = b;
		b = c;
		System.out.println("the swapped number are ");
		System.out.println("a= " + a);
		System.out.println("b= " + b);

	}

}
