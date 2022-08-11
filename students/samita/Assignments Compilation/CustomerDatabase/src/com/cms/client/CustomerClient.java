package com.cms.client;

import java.util.Scanner;

import com.cms.details.CustomerDetails;;

public class CustomerClient {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		CustomerDetails cd = new CustomerDetails();

		int choice;
		System.out.print("\n::WELCOME TO CUSTOMER MANAGEMENT SYSTEM ::");
		while (true) {

			System.out.println("\n========================================");
			System.out.println("\t1.Customer ");
			System.out.println("\t2.Exit");
			System.out.println("Please enter the choice between [1-2]:");
			System.out.println("========================================");

			choice = sc.nextInt();
			System.out.println("\n--------------------------------");
			System.out.println("You entered Choice Number: " + choice);
			System.out.println("--------------------------------");
			switch (choice) {
			case 1:
				cd.choiceOne();
				break;

			case 2:

				System.out.println("Bye Bye!!");
				System.exit(0);
			default:
				System.err.println("Invalid Entry!!!");
				System.err.println("Choice should be either 1 or 2");

			}

		}

	}

}
