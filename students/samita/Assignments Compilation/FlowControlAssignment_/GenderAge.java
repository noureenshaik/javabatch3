package com.personal.bootcamp.flowcontrol;

/*6) Write a program to accept gender ("Male" or "Female") and age (1-120) from command 
 * line arguments and print the percentage of interest based on the given conditions. 
 * Interest == 8.2% Gender ==> Female Age ==>1 to 58 Interest == 7.6% Gender ==> Female Age ==>59 -120 Interest == 9.2% Gender ==> Male Age ==>1-60 Interest == 8.3% Gender ==> Male Age ==>61-120
 * If Statement 	
*/
import java.util.Scanner;

public class GenderAge {

	public static void femaleInterest(int age) {
		if ((age >= 1) && (age <= 58)) {
			System.out.println("Interest Rate is 8.2% ");
		} else if ((age >= 59) && (age <= 120)) {
			System.out.println("Interest Rate is 7.6% ");
		} else {
			System.out.println("Invalid age");
		}
	}

	public static void maleInterest(int age) {
		if ((age >= 1) && (age <= 60)) {
			System.out.println("Interest Rate is 9.2% ");
		} else if ((age >= 61) && (age <= 120)) {
			System.out.println("Interest Rate is 8.3% ");
		} else {
			System.out.println("Invalid age!!");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your choice: [Type: Male or Female]: ");
		String gender = sc.next();
		if (gender.equalsIgnoreCase("female")) {
			System.out.print("\tGender Entered: Female\n\tEnter the age: [1-120] ");
			femaleInterest(sc.nextInt());
		} else if (gender.equalsIgnoreCase("male")) {
			System.out.print("\tGender Entered: Male\n\tEnter the age: [1-120] ");
			maleInterest(sc.nextInt());

		} else {
			System.err.println("\tInvalid gender!!");

		}
		sc.close();
	}

}
