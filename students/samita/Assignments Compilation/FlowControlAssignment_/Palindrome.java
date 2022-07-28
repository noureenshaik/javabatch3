package com.personal.bootcamp.flowcontrol;
//18) Write a Java program to find if the given number is palindrome or not

import java.util.Scanner;

public class Palindrome {

	public static void isPalindrome(int num) {
		int originalNumber = num;
		int rev = 0;
		while (num != 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num /= 10;
		}
		if (originalNumber == rev) {
			System.out.println("It is Palindrome number.");
		} else {
			System.out.println("It is not Palindrome number.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		System.out.println("\n----------------------------");
		System.out.println("Original Number: " + num);
		isPalindrome(num);
		System.out.println("------------------------------");
		sc.close();
	}

}
