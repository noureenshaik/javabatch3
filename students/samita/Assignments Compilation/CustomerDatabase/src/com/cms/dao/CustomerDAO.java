package com.cms.dao;

import java.util.ArrayList;

import com.cms.pojo.Customer;

public interface CustomerDAO {
	  void addCustomer();
	  ArrayList<Customer> viewAllCustomers();
	  Customer viewCustomer(int cNo);

}
