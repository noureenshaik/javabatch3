package com.cms.dao.impl;

import java.util.ArrayList;
import java.util.Scanner;

import com.cms.dao.CustomerDAO;
import com.cms.pojo.Customer;

public class CustomerDAOImpl implements CustomerDAO {
	ArrayList<Customer> c = new ArrayList<Customer>();
	Scanner sc = new Scanner(System.in);

	@Override
	public void addCustomer() {

		System.out.print ("Enter Customer ID: ");
		int cNo = sc.nextInt();
		System.out.print ("Enter Customer Name: ");
		String cName = sc.next();
		System.out.print("Enter Customer Address: ");
		String cAdd = sc.next();
		c.add(new Customer(cNo, cName, cAdd));

	}

	@Override
	public ArrayList<Customer> viewAllCustomers() {
		return c;
	}

	@Override
	public Customer viewCustomer(int cNo) {
		for (int i = 0; i < c.size(); ++i) {
			if (c.get(i).getcNo() == cNo) {
				return c.get(i);

			}
		}
		return null;
	}

}
