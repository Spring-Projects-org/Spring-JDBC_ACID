
package com.java.spring.jdbc.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.java.spring.jdbc.vo.Customer;


//CRUD operations
@Component
public interface CustomerDAO {
	
	//Create
	public void create(Customer customer);
	
}
