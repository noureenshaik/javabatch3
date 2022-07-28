package com.personal.bootcamp.flowcontrol;

import java.util.Scanner;

/*7) Write a program to convert from upper case to lower case and vice versa of an 
 * alphabet and print the old character and new character as shown in example 
 * (Ex: a->A, M->m).If Statement 	*/

public class CaseConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the alphabet of your choice => ");
		char ch = sc.next().charAt(0);
	
		while ((ch < 65) || (ch > 90 && ch < 97) || ch > 122) {
			System.out.println("Please enter the alphabet [a-z] or [A-Z]");
			ch = sc.next().charAt(0);
		}
		System.out.println("\n=================================");
		if (ch < 97) {
			
			System.out.println("The lowercase of letter " + ch + " is " + (char) (ch + 32));
		} else {
			System.out.println("The uppercase of letter " + ch + " is " + (char) (ch - 32));
		}
		System.out.println("=================================\n\n");
		sc.close();
	}

}
