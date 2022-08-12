package com.cms.register.details;

/*
 * @author Samita Shrestha
 * JDBC-3, Takeo
 * Assignment: Admin Customer Management System
 */
import java.util.Scanner;

import com.cms.admin.dao.impl.AdminDaoImpl;
import com.cms.admin.pojo.Customer;
import com.cms.client.CustomerClient;

public class CustomerDetails {
	public void custDetails() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				AdminDaoImpl ad = new AdminDaoImpl();
				Customer[] c = new Customer[3];
				c = ad.viewAllCustomers();
				System.out.println("All Customers: \n");

				if (c[0] == null) {
					System.out.println("Record not found");

				} else {
					System.out.println("----------------------------------------------------------------");
					System.out.println("CustomerID\t\tName\t\t\tAddress");
					System.out.println("----------------------------------------------------------------");
					for (Customer cst : c) {
						System.out.println(cst.getcNo() + "\t\t\t" + cst.getcName() + "\t\t\t" + cst.getcAdd());
						System.out.println("-------------------------------------------------------------");
					}
					System.out.println();
				}
				System.out.println();
				break;
			case 2:
				CustomerClient.main(null);
				break;
			default:
				System.err.println("\nInvalid Choice!!!\n");
				System.out.println("Enter the numbers between [1-2]");

			}
		}
	}
}
