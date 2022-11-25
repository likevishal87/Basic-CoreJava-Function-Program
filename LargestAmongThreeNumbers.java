package com.bridgelabz.day5;

import java.util.Scanner;

//Java Program to Find the Largest Among Three Numbers
public class LargestAmongThreeNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		System.out.println();
		int value = a > b ? (a > c ? a : c) : (b > c ? b : c);
		System.out.println(value);
	}

}
