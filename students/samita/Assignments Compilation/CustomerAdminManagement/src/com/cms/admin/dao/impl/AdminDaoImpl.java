package com.cms.admin.dao.impl;

/*
 * @author Samita Shrestha
 * JDBC-3, Takeo
 * Assignment: Admin Customer Management System
 */
import java.util.Scanner;

import com.cms.admin.dao.AdminDao;
import com.cms.admin.pojo.Customer;

public class AdminDaoImpl implements AdminDao {
	// size of array kept as 3
	Customer[] c = new Customer[3];
	Scanner sc = new Scanner(System.in);

	@Override
	// Method to add the customer information
	public void addCustomer() {
		// TODO Auto-generated method stub
		for (int i = 0; i < c.length; ++i) {
			System.out.println((i + 1) + ". Customer details:");
			System.out.println("---------------------------\n");
			System.out.print("Enter the Customer ID:  ");
			int cID = sc.nextInt();
			System.out.print("Enter the Customer Name:  ");
			String cName = sc.next();
			System.out.print("Enter the Customer Address:  ");
			String cAdd = sc.next();
			Customer cstm = new Customer(cID, cName, cAdd);
			c[i] = cstm;
			System.out.println();

		}
	}

	@Override
	// Method to view all the information of customers
	public Customer[] viewAllCustomers() {
		// TODO Auto-generated method stub
		// checks if there is at least one entry of customer information
		if (c != null) {
			return c;
		}
		return null;
	}

	@Override
	public Customer viewCustomer(int cNo) {
		// TODO Auto-generated method stub
		// checks if there is at least one entry of customer information
		if (c[0] != null) {
			for (Customer cc : c) {
				if (cc.getcNo() == cNo) {
					return cc;

				}
			}
		}
		return null;
	}

	@Override
	public boolean deleteCustomer(int cNo) {
		// TODO Auto-generated method
		// checks if there is at least one entry of customer information
		if (c[0] != null) {
			for (Customer cc : c) {
				if (cc.getcNo() == cNo) {
					cc.setcNo(0);
					cc.setcName(null);
					cc.setcAdd(null);
					return true;

				}
			}
		}
		return false;
	}

}
