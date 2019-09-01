package com.java.spring.jdbc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.java.spring.jdbc.dao.CustomerDAO;
import com.java.spring.jdbc.vo.Customer;

@Component
public class CustomerManagerImp implements CustomerManager {

	@Autowired
	private CustomerDAO customerDAO;
	
	public void setCustomerDAO(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}
	
	@Override
	@Transactional
	public void createCustomer(Customer cust) {
		customerDAO.create(cust);
		
	}

}
