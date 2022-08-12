package com.personal.bootcamp.flowcontrol;

import java.util.Scanner;
/*2) Write a program to check if a given number is odd or even.
					If Statement */

public class OddEven {

	public static String isOddEven(int num){
		if (num%2==0){
			return "Even.";
		}

		else{
			return "Odd.";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
        System.out.println("The entered number ("+num+") is "+isOddEven(num));
		sc.close();
		
	}
}
