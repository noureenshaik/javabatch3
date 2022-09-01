package com.takio.client;

/*
 * @author Samita Shrestha
 * JDBC-3, Takeo
 * Assignment: Login Management- Hibernate
 */
import java.util.Scanner;

import com.takio.dao.impl.UserDAOImpl;
import com.takio.entity.User;
import com.takio.logindetails.LoginDetails;

public class UserClient {
	static Scanner sc = new Scanner(System.in);

	// This method is used to handle input mismatch exception
	public static void intInputValidation() {
		while (!sc.hasNextInt()) {
			System.out.println("========================================");
			System.out.println("Only integer value is accepted");
			System.out.println("Please enter the choice, Again !");
			System.out.println("========================================");
			sc.next();
		}

	}

	// Main method
	public static void main(String[] args) {

		System.out.println("\n================================");
		System.out.println("\t  WELCOME");
		System.out.println("\t    TO");
		System.out.print("  LOGIN MANAGEMENT SYSTEM");

		while (true) {
			// Main menu
			System.out.println("\n================================");
			System.out.println("\t1. Register");
			System.out.println("\t2. Login");
			System.out.println("\t3. Signout");
			System.out.println("    Enter the choice: ");
			System.out.println("=================================");
			intInputValidation();
			int choice = sc.nextInt();
			UserDAOImpl use = new UserDAOImpl();

			switch (choice) {

			// 1. Register
			case 1:
				System.out.println("=================================");
				System.out.print("\nEnter User ID: ");
				intInputValidation();
				int uid = sc.nextInt();
				System.out.print("Enter First name: ");
				String firstName = sc.next();
				System.out.print("Enter Last Name: ");
				String lastName = sc.next();
				System.out.print("Enter Email: ");
				String email = sc.next();
				System.out.print("Enter User name: ");
				String userName = sc.next();
				System.out.print("Enter password: ");
				String passWord = sc.next();
				System.out.println("\n=================================");
				User user = new User(uid, firstName, lastName, email, userName, passWord);
				use.register(user);
				break;

			// 2. Login
			case 2:
				System.out.print("Enter User name: ");
				userName = sc.next();
				System.out.print("Enter password: ");
				passWord = sc.next();
				boolean status = use.verifyUnameAndPass(userName, passWord);
				if (status) {
					System.out.println("\n---------------------------------");
					System.out.println("Username and password Accepted");
					System.out.println("---------------------------------\n");
					LoginDetails ld = new LoginDetails();
					ld.userDetails(userName, passWord);

				} else {
					System.out.println("\n================================");
					System.out.println("UserName and Password didnot match");
					System.out.println("         Access denied!!");
					System.out.println("==================================\n");
				}
				break;

			// 3. Sign out
			case 3:
				System.out.println("--------------------------------------------");
				System.out.println("Thank you for using LOGIN management system");
				System.out.println("\t\tGood Bye! :)");
				System.out.println("--------------------------------------------");
				System.exit(0);

			// default is used to handle out of bound choice entry
			default:
				System.out.println("========================================");
				System.out.println("           Invalid choice");
				System.out.println("Please enter the choice between [1-3]");
				System.out.println("========================================");
			}

		}

	}
}
