package com.takio.logindetails;

/*
 * @author Samita Shrestha
 * JDBC-3, Takeo
 * Assignment: Login Management- Hibernate
 */
import java.util.List;
import java.util.Scanner;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.takio.client.UserClient;
import com.takio.entity.User;

// This method is invoked only when the username and password matches 
// from the record in user database

public class LoginDetails {
	public void userDetails(String uname, String pass) {

		Scanner sc = new Scanner(System.in);

		System.out.println("=================================");
		System.out.println("  : Welcome to USER PORTAL :");
		while (true) {
			// Main menu

			System.out.println("================================");
			System.out.println("\t1. View your Information");
			System.out.println("\t2. Signout");
			System.out.println("    Enter the choice: ");
			System.out.println("=================================");
			int choice = sc.nextInt();
			switch (choice) {

			// 1. View your Information
			case 1:
				System.out.println("\nPlease Wait.........\n");
				Configuration cfg = new Configuration();
				cfg.configure("com\\takio\\config\\hibernate.cfg.xml");
				SessionFactory factory = cfg.buildSessionFactory();

				Session sess = factory.openSession();
				Transaction tx = sess.beginTransaction();

				Query q = sess.createQuery("select u from User u where username=:uname AND password=:pass");
				q.setParameter("uname", uname);
				q.setParameter("pass", pass);

				List<User> userRecord = q.getResultList();

				for (User use : userRecord) {
					System.out.println("\n========================================");
					System.out.println("User ID:\t" + use.getUid());
					System.out.println("First Name:\t" + use.getFirstName());
					System.out.println("Last Name:\t" + use.getLastName());
					System.out.println("Email Address:\t" + use.getEmail());
					System.out.println("Username:\t" + use.getUsername());
					System.out.println("Password:\t" + use.getPassWord());
					System.out.println("=========================================\n");
				}

				break;

			// 2. Sign Out
			case 2:
				System.out.println("\nSigning Out.................!!\n");

				// Once signed out it doesnot close application
				// but goes to Main Menu
				UserClient.main(null);
				break;

			// default handles out of bound choice entry
			default:
				System.out.println("========================================");
				System.out.println("           Invalid choice");
				System.out.println("Please enter the choice 1 or 2");
				System.out.println("========================================");

			}
		}
	}
}