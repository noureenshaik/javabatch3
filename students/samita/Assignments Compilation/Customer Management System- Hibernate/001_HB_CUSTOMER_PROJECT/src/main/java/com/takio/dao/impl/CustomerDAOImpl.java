package com.takio.dao.impl;
/*
 * @author Samita Shrestha
 * JDBC-3, Takeo
 * Assignment: Admin Customer Management System
 */
import java.util.List;
import java.util.Scanner;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.takio.client.CustomerClient;
import com.takio.dao.CustomerDAO;
import com.takio.entity.Customer;

public class CustomerDAOImpl implements CustomerDAO {

	// 1. Add Customer
	public void addCustomer(Customer cust) {
		// TODO Auto-generated method stub

		// Try- Catch to handle duplicate primary key exception and
		// inform user
		try {
			System.out.println("\nPlease Wait.........\n");

			Configuration cfg = new Configuration();
			cfg.configure("com\\takio\\config\\hibernate.cfg.xml");
			SessionFactory factory = cfg.buildSessionFactory();

			Session sess = factory.openSession();
			Transaction tx = sess.beginTransaction();

			Integer id = (Integer) sess.save(cust);
			tx.commit();

			System.out.println("\n===============================================");
			System.out.println("Customer Information is added, Successfully!!");
			System.out.println("=================================================\n");
		} catch (Exception e) {

			System.out.println("\n========================================");
			System.out.print("Duplicate Primary Key, Please TRY Again !! ");
			System.out.println("\n========================================");
		}
	}

	// 2. View All Customer
	public List<Customer> viewAllCustomers() {

		System.out.println("\nPlease Wait.........\n");

		Configuration cfg = new Configuration();
		cfg.configure("com\\takio\\config\\hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Session sess = factory.openSession();
		Transaction tx = sess.beginTransaction();

		Query q = sess.createQuery("from Customer");
		List<Customer> custRecords = q.getResultList();
		return custRecords;

	}

	// 3. View customer
	public Customer viewCustomer(int cno) {
		System.out.println("\nPlease Wait.........\n");

		Configuration cfg = new Configuration();
		cfg.configure("com\\takio\\config\\hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Session sess = factory.openSession();
		Transaction tx = sess.beginTransaction();

		Customer cs = sess.get(Customer.class, cno);
		return cs;
	}

	// 4. Update Customer
	public int updateCustomer(int cno) {
		System.out.println("\nPlease Wait.........\n");

		Configuration cfg = new Configuration();
		cfg.configure("com\\takio\\config\\hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Session sess = factory.openSession();
		Transaction tx = sess.beginTransaction();

		System.out.println("\n=============================");
		System.out.println("What would you want to update? ");
		System.out.println("1. cname");
		System.out.println("2. cadd");
		System.out.println("3. Both");
		System.out.println("4. Return to Main Menu");
		System.out.println("==============================");
		Scanner sc = new Scanner(System.in);

		while (!sc.hasNextInt()) {
			System.out.println("========================================");
			System.out.println("Only integer value is accepted");
			System.out.println("Please enter the choice, Again !");
			System.out.println("========================================");
			sc.next();
		}
		int choice = sc.nextInt();
		Customer cs = sess.get(Customer.class, cno);

		// status, a local variable is used to keep track if the update is
		// successful
		// if update is successful, status is update to 1 else, status remains 0
		int status = 0;
		if (cs != null) {
			switch (choice) {

			// 1. Updating only cname
			case 1:

				System.out.println("\n===================================================");
				System.out.print("Please enter the new value of cname for cid: " + cno);
				System.out.println("\n==================================================");
				System.out.println("Original value: " + cs.getCname());
				System.out.print("New Name: ");
				String cname = sc.next();
				System.out.println();
				cs.setCname(cname);
				sess.update(cs);
				tx.commit();
				status = 1;
				break;

			// 2. Updating only cadd
			case 2:

				System.out.println("\n====================================================");
				System.out.println("Please enter the new value of cadd for cid: " + cno);
				System.out.println("==================================================");
				System.out.println("Original value: " + cs.getCadd());
				System.out.print("New Address: ");
				String cadd = sc.next();
				System.out.println();
				cs.setCadd(cadd);
				sess.update(cs);
				tx.commit();
				status = 1;
				break;

			// Updating both cname and cadd
			case 3:

				System.out.println("\n===================================================");
				System.out.print("Please enter the new value of cname for cid: " + cno);
				System.out.println("=================================================");
				System.out.println("Original value: " + cs.getCname());
				System.out.print("New Name: ");
				cname = sc.next();
				System.out.println();
				cs.setCname(cname);
				sess.update(cs);
				System.out.println("=========================================-==========");
				System.out.print("Please enter the new value of cadd for cid: " + cno);
				System.out.println("\n==================================================");
				System.out.println("Original value: " + cs.getCadd());
				System.out.print("New Address: ");
				cadd = sc.next();
				cs.setCadd(cadd);
				sess.update(cs);
				tx.commit();
				status = 1;
				break;

			// 4. Sign Out
			case 4:
				System.out.println("\nReturning to Main Menu");
				CustomerClient.main(null);
				break;

			// Default to handle out of bound Choice entry
			default:
				System.err.println("Invalid Entry!!!");
				System.err.println("Choice should be either 1, 2 or 3");

			}
		}
		return status;
	}

	// 5. Delete Customer
	public int deleteCustomer(int cno) {
		System.out.println("\nPlease Wait.........\n");

		Configuration cfg = new Configuration();
		cfg.configure("com\\takio\\config\\hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Session sess = factory.openSession();
		Transaction tx = sess.beginTransaction();

		Customer cs = sess.get(Customer.class, cno);

		// cs is not null means there is a record for that particular cno.
		if (cs != null) {
			sess.delete(cs);
			tx.commit();
			return 1;
		} else {

			return 0;
		}
	}

}
