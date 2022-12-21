package com.loginLogout.service;

import com.loginLogout.exceptions.CustomerException;
import com.loginLogout.model.Customer;

public interface CustomerService {
	
	
	public Customer createCustomer(Customer customer)throws CustomerException;
	
	public Customer updateCustomer(Customer customer,String key)throws CustomerException;

}
