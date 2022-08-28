package com.takio.dao;
/*
 * @author Samita Shrestha
 * JDBC-3, Takeo
 * Assignment: Admin Customer Management System
 */
import java.util.List;

import com.takio.entity.Customer;

public interface CustomerDAO {
	void addCustomer(Customer cust);

	List<Customer> viewAllCustomers();

	Customer viewCustomer(int cno);

	int updateCustomer(int cno);

	int deleteCustomer(int cno);
}
