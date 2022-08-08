package com.personal.bootcamp.flowcontrol;
/*15) Write a program to add all the values in a given number and print. Ex: 1234->10
 * 								[For Loop] 
 */

import java.util.Scanner;

public class AddDigits {
	public static int addDigit(int n) {
		int sum =0;
		for(int i=n; i!=0;i/=10){
			int rem = i%10;
			sum+=rem;
			
		}
		return sum;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Integer value: ");
		int num = sc.nextInt();
		System.out.println("\n==================================");
		System.out.println("The number you entered is: "+num);
		System.out.println("The sum of digit is :"+addDigit(num));
		System.out.println("==================================");
		sc.close();
	}

}
