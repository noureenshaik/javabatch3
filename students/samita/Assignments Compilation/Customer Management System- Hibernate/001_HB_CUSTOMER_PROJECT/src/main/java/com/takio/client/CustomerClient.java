package com.takio.client;

/*
 * @author Samita Shrestha
 * JDBC-3, Takeo
 * Assignment: Customer Management- Hibernate
 */
import java.util.*;
import com.takio.dao.impl.CustomerDAOImpl;
import com.takio.entity.Customer;

public class CustomerClient {
	static Scanner sc = new Scanner(System.in);

	// Method to make sure user input correct datatype
	// This is to handle input Mismatch Exception
	public static void intInputValidation() {
		System.out.print("Enter the Customer ID: ");
		while (!sc.hasNextInt()) {
			System.out.println("========================================");
			System.out.println("Only integer value is accepted");
			System.out.println("Please enter the choice, Again !");
			System.out.println("========================================");
			sc.next();
		}

	}

	// Menu to be displayed at front page
	public static void menu() {
		System.out.println("\n========================================");
		System.out.println("\t1.Add Customer ");
		System.out.println("\t2.View All Customer");
		System.out.println("\t3.View Customer");
		System.out.println("\t4.Update Customer");
		System.out.println("\t5.Delete Customer");
		System.out.println("\t6.EXIT");
		System.out.println("Please enter the choice between [1-6]:");
		System.out.println("========================================");
	}

	// Main Method
	public static void main(String[] args) {

		int choice;
		System.out.print("\n::WELCOME TO CUSTOMER MANAGEMENT SYSTEM ::");
		while (true) {

			menu();
			while (!sc.hasNextInt()) {
				System.out.println("========================================");
				System.out.println("Only integer value is accepted");
				System.out.println("Please enter the choice, Again !");
				System.out.println("========================================");
				menu();
				sc.next();
			}
			choice = sc.nextInt();
			System.out.println("\n--------------------------------");
			System.out.println("You entered Choice Number: " + choice);
			System.out.println("--------------------------------");

			CustomerDAOImpl cd = new CustomerDAOImpl();
			switch (choice) {

			// 1. Add Customer
			case 1:
				System.out.println("\nPlease begin Adding the customer information");
				System.out.println("---------------------------------------------\n");
				intInputValidation();
				int cno = sc.nextInt();
				System.out.print("Enter the Customer Name: ");
				String cname = sc.next();
				System.out.print("Enter the Customer Address: ");
				String cadd = sc.next();
				System.out.println("---------------------------------------------\n");
				Customer cst = new Customer(cno, cname, cadd);
				cd.addCustomer(cst);

				break;

			// 2. View All Customer
			case 2:
				List<Customer> custAll = cd.viewAllCustomers();
				System.out.println("\n===========================");
				System.out.println("Displaying all Records: ");
				System.out.println("============================\n");
				System.out.println("     Customer Table");
				System.out.println("--------------------------------");
				System.out.println("cno\tcname\tcadd");
				System.out.println("--------------------------------");
				for (Customer cust : custAll) {
					System.out.println(cust.getCno() + "\t" + cust.getCname() + "\t" + cust.getCadd());
					System.out.println("--------------------------------");
				}
				System.out.println();

				break;

			// 3.View Customer
			case 3:
				intInputValidation();
				cno = sc.nextInt();
				Customer cs = new Customer();
				cs = cd.viewCustomer(cno);
				if (cs != null) {
					System.out.println("\n===============================");
					System.out.println("Information of Customer Id: " + cno);
					System.out.println("=================================");

					System.out.println();
					System.out.println("-------------------------");
					System.out.println("cid\tcname\tcadd");
					System.out.println("-------------------------");
					System.out.println(cs.getCno() + "\t" + cs.getCname() + "\t" + cs.getCadd());
					System.out.println("-------------------------");
					System.out.println();
				} else {
					System.out.println("\n====================");
					System.out.println("Record not found!!");
					System.out.println("======================");
				}
				break;

			// 4. Update Customer
			case 4:
				intInputValidation();
				cno = sc.nextInt();
				int status = cd.updateCustomer(cno);
				if (status == 1) {
					System.out.println("\n======================");
					System.out.println("Update Successful !!!");
					System.out.println("======================");
				} else {
					System.out.println("\n==================================");
					System.out.println("cid " + cno + " is not in the database");
					System.out.println("    Couldnot update record!!");
					System.out.println("===================================");
				}
				break;

			// 5. Delete Customer
			case 5:
				intInputValidation();
				cno = sc.nextInt();
				status = cd.deleteCustomer(cno);

				if (status == 1) {
					System.out.println("\n========================");
					System.out.println("Deletion Successful !!");
					System.out.println("========================");
				} else {
					System.out.println("\n========================================");
					System.out.println("cid " + cno + " is not found in the database. ");
					System.out.println("========================================");
				}

				break;

			// 5. Sign Out
			case 6:
				System.out.println("Exiting!!!!!!!");
				System.out.println("Thank you!!");
				System.exit(0);

			//Default to handle out of bound choice entry by the user
			default:

				System.out.println("   Invalid Choice!!!");
				System.out.println("Choice should be between [1-6]");

			}

		}

	}
}
