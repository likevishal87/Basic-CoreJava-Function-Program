package com.bridgelabz.day5;

import java.util.Scanner;

//Java Program to Check Whether an Alphabet is Vowel or Consonant
public class VowelorConsonant {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any char");
		String x = scanner.next();
		if (x.equalsIgnoreCase("A") || x.equalsIgnoreCase("E") || x.equalsIgnoreCase("I") || x.equalsIgnoreCase("O")
				|| x.equalsIgnoreCase("U"))
			System.out.println("Vowel");
		else
			System.out.println("Consonant");
	}

}
