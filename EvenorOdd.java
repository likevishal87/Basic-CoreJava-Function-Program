package com.bridgelabz.day5;

import java.util.Scanner;

//Java Program to Check Whether a Number is Even or Odd
public class EvenorOdd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if (num % 2 == 0)
			System.out.println("even");
		else
			System.out.println("odd");

	}

}
