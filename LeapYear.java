package com.bridgelabz.day5;

//Leap Year
//a. I/P -> Year, ensure it is a 4 digit number.
//b. Logic -> Determine if it is a Leap Year.
//c. O/P -> Print the year is a Leap Year or not.
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the four digit number");
		int year = sc.nextInt();
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println("The year is a leap year");
				} else
					System.out.println("The year is not a leap year");
			} else
				System.out.println("The year is a leap year");
		} else
			System.out.println("The year is not a leap year");
	}

}
