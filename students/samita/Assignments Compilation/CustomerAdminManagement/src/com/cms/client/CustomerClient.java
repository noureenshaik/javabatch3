package com.cms.client;

/*
 * @author Samita Shrestha
 * JDBC-3, Takeo
 * Assignment: Admin Customer Management System
 */
import java.util.Scanner;

import com.cms.admin.details.AdminDetails;
import com.cms.register.dao.impl.UserDaoImpl;
import com.cms.register.pojo.User;

public class CustomerClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("\n================================");
		System.out.println("\t  WELCOME");
		System.out.println("\t    TO");
		System.out.print("ADMIN CUSTOMER MANAGEMENT SYSTEM");
		UserDaoImpl userInfo = new UserDaoImpl();
		while (true) {
			// Main menu
			System.out.println("\n================================");
			System.out.println("\t1. Admin");
			System.out.println("\t2. Customer");
			System.out.println("\t3. Register");
			System.out.println("\t4. Exit");
			System.out.println("    Enter the choice: ");
			System.out.println("=================================");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				AdminDetails ad = new AdminDetails();
				ad.adminMenu();
				break;
			case 2:
				System.out.print("Enter your UserName: ");
				String userName = sc.next();
				System.out.print("Enter your Password: ");
				String pass = sc.next();

				boolean flag = userInfo.verifyUserNameAndPassword(userName, pass);
				if (flag) {
					System.out.println("\nLogin Credential is Valid !!");
					System.out.println("\n=================");
					System.out.println("User Information:");
					System.out.println("=================");
					User u = userInfo.viewUserInfo(userName);
					System.out.println("User ID: " + u.getuID());
					System.out.println("First Name: " + u.getFirstName());
					System.out.println("Last Name: " + u.getLastName());
					System.out.println("Email ID: " + u.getEmail());
					System.out.println();
				} else {
					System.out.println("\n   [ X Invalid Username or Password ]");
					System.out.println("              Access Denied!!!!");
					System.out.println("[Please sign up by clicking Register from the MENU]");
				}
				break;

			case 3:
				userInfo.register();
				break;

			case 4:
				System.out.println("Thanks for using this app!!");
				System.out.println("Bye bye!!");
				System.exit(0);
			default:
				System.err.println("\nInvalid Choice!!!");
				System.out.println("Please enter the choice between [1-5]");
				break;

			}

		}

	}

}
