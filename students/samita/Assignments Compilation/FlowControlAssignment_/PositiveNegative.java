package com.personal.bootcamp.flowcontrol;
/*1)	Write a program to check if a given number is Positive, Negative, or Zero.
                                  ( If Statement ) */ 

import java.util.Scanner;

public class PositiveNegative {
	
	public static String isPosNegZero(int num){
		if (num<0){
			return "Negative.";
		}
		else if (num>0){
			return "Positive.";
		}
		else{
			return "Zero.";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
        System.out.println("The entered number ("+num+") is "+isPosNegZero(num));
		sc.close();
		
	}

}
