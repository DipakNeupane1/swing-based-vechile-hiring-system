package com.student.vechilehiring.dao;

import java.util.List;

import com.student.vechilehiring.dto.Customers;

public interface CustomersDao {

	public int createCustomer(Customers customers);
	
	public int login(String userName,String password);
	
	public void deleteCustomerById(int cid);
	
	public List<Customers> getallCustomerInfo();
	
	public Customers getCustomerById(int cid);
	
}
