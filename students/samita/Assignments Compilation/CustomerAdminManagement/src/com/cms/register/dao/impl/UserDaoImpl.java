package com.cms.register.dao.impl;

/*
 * @author Samita Shrestha
 * JDBC-3, Takeo
 * Assignment: Admin Customer Management System
 */
import java.util.Scanner;

import com.cms.register.dao.UserDAO;
import com.cms.register.pojo.User;;

public class UserDaoImpl implements UserDAO {

	User[] addUsers = new User[3];
	Scanner sc = new Scanner(System.in);

	@Override
	public void register() {
		// TODO Auto-generated method stub

		for (int i = 0; i < addUsers.length; ++i) {
			System.out.println();

			System.out.println("User ID " + (i + 1));
			System.out.println("============");
			System.out.print("Enter the User ID: ");
			int uID = sc.nextInt();
			System.out.print("Enter the First Name: ");
			String fName = sc.next();
			System.out.print("Enter the Last Name: ");
			String lName = sc.next();
			System.out.print("Enter the email ID: ");
			String email = sc.next();
			System.out.print("Enter the User Name: ");
			String uName = sc.next();
			System.out.print("Enter the password: ");
			String pass = sc.next();

			User u = new User(uID, fName, lName, email, uName, pass);
			addUsers[i] = u;

		}

	}

	@Override
	// Check for login credential Verification
	public boolean verifyUserNameAndPassword(String uName, String passw) {
		boolean flag = false;
		// Checks if there is at least one user information
		if (addUsers[0] != null) {
			for (User usr : addUsers) {
				if (usr.getUserName().equals(uName) && usr.getPassword().equals(passw)) {
					flag = true;
				}
			}

		}
		return flag;

		// TODO Auto-generated method stub

	}

	@Override
	// I used extra method to retrieve the user information of the particular
	// user when the login credential matches
	public User viewUserInfo(String uName) {

		for (User usr : addUsers) {
			if (usr.getUserName().equals(uName)) {
				return usr;
			}
		}

		return null;

	}

}
