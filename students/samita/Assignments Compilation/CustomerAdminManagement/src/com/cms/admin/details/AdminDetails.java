package com.cms.admin.details;

/*
 * @author Samita Shrestha
 * JDBC-3, Takeo
 * Assignment: Admin Customer Management System
 */
import java.util.Scanner;

import com.cms.admin.dao.impl.AdminDaoImpl;
import com.cms.admin.pojo.Customer;
import com.cms.client.CustomerClient;

public class AdminDetails {
	public void adminMenu() {
		Scanner sc = new Scanner(System.in);
		AdminDaoImpl ad = new AdminDaoImpl();
		Customer[] c = new Customer[3];
	
		while (true) {
			// Menu inside 1. Admin from main menu
			System.out.println("=================================");
			System.out.println("\t1. Add Customer");
			System.out.println("\t2. View All Customers");
			System.out.println("\t3. View Customer");
			System.out.println("\t4. Delete Customer");
			System.out.println("\t5. Back");
			System.out.println("    Enter the choice: ");
			System.out.println("=================================");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				ad.addCustomer();
				break;

			case 2:
				c = ad.viewAllCustomers();

				if (c[0] == null) {
					System.out.println("Record not found");
					System.out.println("Please add customers to the list");
				} else {
					System.out.println("\t\t  All Customers:");
					System.out.println("-----------------------------------------------------------");
					System.out.println("CustomerID\t\tName\t\t\tAddress");
					System.out.println("-----------------------------------------------------------");
					for (Customer cst : c) {
						System.out.println(cst.getcNo() + "\t\t\t" + cst.getcName() + "\t\t\t" + cst.getcAdd());
						System.out.println("-----------------------------------------------------------");
					}
					System.out.println();
				}
				break;
			case 3:
				System.out.print("Enter the customer ID:  ");
				int cNo = sc.nextInt();
				Customer cc = ad.viewCustomer(cNo);
				if (cc == null) {
					System.out.println("Record not found!!\n");
					break;

				} else {
					System.out.print("Customer details for Customer ID: " + cNo);
					System.out.println("\n======================================");
					System.out.println("\nCustomerID\tName\t\tAddress");
					System.out.println("-----------------------------------------");
					System.out.println(cc.getcNo() + "\t\t" + cc.getcName() + "\t\t" + cc.getcAdd());
					System.out.println("-----------------------------------------");
				}
				break;
			case 4:
				System.out.println("Enter the customer ID: ");
				int cdNo = sc.nextInt();

				if (ad.deleteCustomer(cdNo)) {
					System.out.println("Customer detail deleted successfully");
				} else
					System.out.println("Customer detail not found");
				break;
			case 5:
				CustomerClient.main(null);
				break;
			default:
				System.err.print("\nInvalid Entry!!!");
				System.out.println("Please enter the choice between [1-5]");
				break;

			}
		}

	}
}
