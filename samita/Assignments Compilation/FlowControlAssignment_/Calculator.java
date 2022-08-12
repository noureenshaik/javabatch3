package com.personal.bootcamp.flowcontrol;
/*20) Write a program that displays a menu with options 1. Add 2. Sub 
 *    Based on the options chosen, read 2 numbers and perform the relevant 
 *    operation. After performing the operation, the program should ask the user 
 *    if he wants to continue. If the user presses y or Y, then the program should 
 *    continue displaying the menu else the program should terminate.
 *    [ Note: Use Scanner class, you can take help from the trainer regarding 
 *    the same ]
 *   						 [Do While]
 */

import java.util.Scanner;

public class Calculator {
	static Scanner sc = new Scanner(System.in);
	public static void add(){
		System.out.println("Enter two numbers to add");
		System.out.print("First Num: ");
		int fNo= sc.nextInt();
		System.out.print("Second Num: ");
		int sNo= sc.nextInt();
		System.out.println("Addition is performed: ");
		System.out.println("\t"+fNo+" + "+sNo+" = " + (fNo+sNo));
		System.out.println();
	}
	public static void sub(){
		System.out.println("Enter two numbers to subtract");
		System.out.print("First Num: ");
		int fNo= sc.nextInt();
		System.out.print("Second Num: ");
		int sNo= sc.nextInt();
		System.out.println("Subtraction is performed: ");
		System.out.println("\t"+sNo+" - "+fNo+" = " + (sNo-fNo));
		System.out.println();
		
	}

	public static void main(String[] args) {

		char ch;
		do{
			System.out.println("\nSelect one option:");
			System.out.println("==================================== ");
			System.out.println("\t\t1.Add");
			System.out.println("\t\t2.Subtract");
			System.out.println("==================================== ");
			
			System.out.print("Enter the choice: ");
			int choice = sc.nextInt();
			
			switch(choice){
			case 1:
				add();
				break;
			case 2:
				sub();
				break;
		    default:
		    	System.err.println("\nInvalid Input\n[Please enter either 1 or 2]\n");
			}
			System.out.println("\nDo you want to continue? \n [Press Y to continue]\n\totherwise \n [press any key to EXIT]");
	     	ch= Character.toUpperCase(sc.next().charAt(0));
			
		}while(ch=='Y');
		System.out.println("\n\n========================");
		System.out.println("Exiting...........");
		System.out.println("Thanks for stopping by...");
		System.out.println("See you soon!!!");
		System.out.println("========================\n\n");
	}
}
