package com.loginLogout.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loginLogout.dao.CustomerDao;
import com.loginLogout.dao.SessionDao;
import com.loginLogout.exceptions.CustomerException;
import com.loginLogout.model.CurrentUserSession;
import com.loginLogout.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao cDao;
	
	@Autowired
	private SessionDao sDao;
	
	
	@Override
	public Customer createCustomer(Customer customer)throws CustomerException {
		
		
		Customer existingCustomer= cDao.findByMobileNo(customer.getMobileNo());
		
		
		
		if(existingCustomer != null) 
			throw new CustomerException("Customer Already Registered with Mobile number");
			
		
		
		
			return cDao.save(customer);
			
			
		}

	@Override
	public Customer updateCustomer(Customer customer, String key) throws CustomerException{
	
		CurrentUserSession loggedInUser= sDao.findByUuid(key);
	
		if(loggedInUser == null) {
			throw new CustomerException("Please provide a valid key to update a customer");
		}
		
		
	
		
		if(customer.getCustomerId() == loggedInUser.getUserId()) {
			//If LoggedInUser id is same as the id of supplied Customer which we want to update
			return cDao.save(customer);
		}
		else
			throw new CustomerException("Invalid Customer Details, please login first");
	
	}
		
		
		
	}


