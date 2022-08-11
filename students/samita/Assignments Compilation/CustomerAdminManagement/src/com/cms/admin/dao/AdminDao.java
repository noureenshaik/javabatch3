package com.cms.admin.dao;

/*
 * @author Samita Shrestha
 * JDBC-3, Takeo
 * Assignment: Admin Customer Management System
 */
import com.cms.admin.pojo.Customer;

public interface AdminDao {

	void addCustomer();

	Customer[] viewAllCustomers();

	Customer viewCustomer(int cNo);

	boolean deleteCustomer(int cNo);

}
