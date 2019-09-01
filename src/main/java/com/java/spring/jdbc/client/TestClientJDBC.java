package com.java.spring.jdbc.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.java.spring.jdbc.config.SpringJdbcConfig;
import com.java.spring.jdbc.service.CustomerManager;
import com.java.spring.jdbc.vo.Address;
import com.java.spring.jdbc.vo.Customer;

public class TestClientJDBC {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringJdbcConfig.class);
		
		CustomerManager customerManager = context.getBean(CustomerManager.class);
		//Run some tests for JDBC CRUD operations
				
			    Customer customer = createDummyCustomer();
				customerManager.createCustomer(customer);

				((AbstractApplicationContext) context).close();
				
	}
	
	public  static Customer createDummyCustomer()
	{
		Customer customer=new Customer();
		Address address =new Address();
		
		customer.setId(135);
		customer.setName("Ali Rahat");
		
		address.setId(135);
		address.setAddress("Head Manpur,Post-Buniyad Ganj, Dist - Gaya (Bihar)");
		address.setCountry("India");
		customer.setAddress(address);
		return customer;
		
	}
	
	
			

}
