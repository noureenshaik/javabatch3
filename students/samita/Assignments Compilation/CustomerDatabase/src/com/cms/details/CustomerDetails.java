package com.cms.details;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.cms.client.CustomerClient;
import com.cms.dao.impl.CustomerDAOImpl;
import com.cms.pojo.Customer;

public class CustomerDetails {
	CustomerDAOImpl cs = new CustomerDAOImpl();
	Scanner sc = new Scanner(System.in);

	public void choiceOne() {
		while (true) {
			System.out.println("\n========================================");
			System.out.println("\t1. Add Customer ");
			System.out.println("\t2. View All Customer");
			System.out.println("\t3. View Customer");
			System.out.println("\t4. back");
			System.out.println("Please enter the choice between [1-4]:");
			System.out.println("========================================");

			int ch = sc.nextInt();

			System.out.println("You entered Choice Number: " + ch);

			switch (ch) {
			case 1:
				cs.addCustomer();
				break;

			case 2:
				ArrayList<Customer> c = new ArrayList<Customer>();
				c = cs.viewAllCustomers();

				if (c.size() == 0) {
					System.out.println("Resource not found!!");
					System.out.println("First create the Customer list!");
					break;
				} else {
					Iterator<Customer> iterator = c.iterator();
					System.out.println("\nCustomerID\tName\t\tAddress");
					System.out.println("------------------------------------------");
					while (iterator.hasNext()) {

						Customer i = iterator.next();
						System.out.println(i.getcNo() + "\t\t" + i.getcName() + "\t\t" + i.getcAdd());
						System.out.println("----------------------------------------");

					}
				}

				break;

			case 3:

				System.out.print("Enter the customer ID: ");
				int id = sc.nextInt();
				Customer cust = cs.viewCustomer(id);
				if (cust == null) {
					System.err.print("\nResource not found");
					System.out.println();
				} else {
					System.out.println("\n==========================");
					System.out.print("Details of Customer ID: " + id);
					System.out.println("\n==========================");
					System.out.println("\nCustomerID\tName\t\tAddress");
					System.out.println("-------------------------------------------");
					System.out.println(cust.getcNo() + "\t\t" + cust.getcName() + "\t\t" + cust.getcAdd());
					System.out.println("-------------------------------------------");
				}
				break;
			case 4:
				System.out.println("Returning to main.......");
				CustomerClient.main(null);
				break;
			default:
				System.err.println("\nInvalid Entry!!!");
				System.err.println("Number should be between [1-4]");
				System.out.println("\n--------------------------------");

			}

		}

	}

}
