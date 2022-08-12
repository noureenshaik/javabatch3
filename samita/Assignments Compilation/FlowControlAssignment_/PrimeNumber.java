package com.personal.bootcamp.flowcontrol;
/*12) Write a program to check if a given number is prime or not
 * 					[For Loop] 	
 * The same solution works for Question num: 14
 */

import java.util.Scanner;

public class PrimeNumber {
	public static void isPrime(int num) {
	   if (num == 1|| num==0) {
			System.out.println("\t"+num + " is neither prime nor composite.");

		} else {
			int count = 0;
			for (int i = 1; i <= num; ++i) {
				if (num % i == 0) {
					count++;
				}
			}
			if (count == 2)
				System.out.println("\t"+num + " is a prime");
			else
				System.out.println("\t"+num + " is not a prime");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter an integer number : ");
		int number = sc.nextInt();

		isPrime(number);
		sc.close();
	}

}
