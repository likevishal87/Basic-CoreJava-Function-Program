package com.bridgelabz.day5;

import java.util.Scanner;

//Harmonic Number
//a. Desc -> Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
//(http://users.encs.concordia.ca/~chvatal/notes/harmonic.html).
//b. I/P -> The Harmonic Value N. Ensure N != 0
//c. Logic -> compute 1/1 + 1/2 + 1/3 + ... + 1/N
//d. O/P -> Print the Nth Harmonic Value.
public class Harmonic {

	public static void main(String[] args) {
		double value = 0, number = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter  Nth Number");
		int count = scanner.nextInt();
		for (double i = 1; i <= count; i++) {
			number = number + (1 / i);
			value = number;
		}
		System.out.println("The value of harmonic no. " + count + " is: " + value);

	}

}
