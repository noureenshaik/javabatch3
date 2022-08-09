package com.personal.bootcamp.flowcontrol;

import java.util.Scanner;
/*9) Write a program to print month in words, based on input month in numbers Example1:*/

public class Month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		do {
			System.out.println("========================================");
			System.out.println("Please enter the number between [1-12]:");
			System.out.println("========================================");
			
			Scanner sc = new Scanner(System.in);
			int month= sc.nextInt();

			System.out.println("You entered: " + month);
			System.out.println("\n--------------------------------");
			
			switch (month) {
			case 1:
				System.out.println("\t    JANUARY");
				System.out.println("--------------------------------\n");
				break;
			case 2:
				System.out.println("\t    FEBRUARY");
				System.out.println("--------------------------------\n");
				break;
			case 3:
				System.out.println("\t    MARCH");
				System.out.println("--------------------------------\n");
				break;
			case 4:
				System.out.println("\t    APRIL");
				System.out.println("--------------------------------\n");
				break;
			case 5:
				System.out.println("\t    MAY");
				System.out.println("--------------------------------\n");
				break;
			case 6:
				System.out.println("\t    JUNE");
				System.out.println("--------------------------------");
				break;
			case 7:
				System.out.println("\t    JULY");
				System.out.println("--------------------------------");
				break;
			case 8:
				System.out.println("\t    AUGUST");
				System.out.println("--------------------------------\n");
				break;
			case 9:
				System.out.println("\t    SEPTEMBER");
				System.out.println("--------------------------------\n");
				break;
			case 10:
				System.out.println("\t    OCTOBER");
				System.out.println("--------------------------------\n");
				break;
			case 11:
				System.out.println("\t    NOVEMBER");
				System.out.println("--------------------------------\n");
				break;
			case 12:
				System.out.println("\t    DECEMBER");
				System.out.println("--------------------------------\n");
				break;
				
			default:
				System.err.println("\nInvalid Month!!!");
				System.err.println("Number should be between [1-12]");
				System.out.println("\n--------------------------------");

			}
			System.out.println("\nWant to continue? Yes for Y ");
			System.out.println("Or Press any key to EXIT");
			ch= Character.toUpperCase(sc.next().charAt(0));
			
		}while(ch=='Y');
		System.out.println("\n\nThanks for playing Month Words!");
		System.out.println("\tSee you soon!!");
		System.out.println("--------------------------------");
	}

}
