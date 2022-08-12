package com.personal.bootcamp.flowcontrol;
/*17) Write a program to reverse a given number and print Eg1) I/P: 1234 O/P:4321
 *    Eg2) I/P:1004 O/P:4001
 *  				[While Loop] 	
 */

import java.util.Scanner;

public class ReverseNumber {

	public static void reverseNumber(int num) {
		int rev = 0;
		
		while (num != 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num /= 10;
		}
		System.out.println("Reverse of Number:  " + rev);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		System.out.println("\n--------------------------");
		System.out.println("Original Number: " + num);
		reverseNumber(num);
		System.out.println("--------------------------");
		sc.close();
	}

}
