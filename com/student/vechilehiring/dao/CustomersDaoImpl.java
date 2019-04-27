package com.student.vechilehiring.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.student.vechilehiring.dto.Customers;
import com.student.vechilehiring.util.DbUtil;

public class CustomersDaoImpl implements CustomersDao {

	PreparedStatement ps=null;
	Connection con=null;
	
	@Override
	public int createCustomer(Customers customers) {
		String sql="insert into customer_table(customer_name,customer_address,phone_no,email,dob,user_name,password)values(?,?,?,?,?,?,?)";
		int cid=0;
		try {
			ps=DbUtil.getConnection().prepareStatement(sql);
			ps.setString(1, customers.getName());
			ps.setString(2, customers.getAddress());
			ps.setString(3, customers.getPhoneNo());
			ps.setString(4, customers.getEmail());
			ps.setDate(5, new Date(customers.getDob().getTime()));
			ps.setString(6, customers.getUserName());
			ps.setString(7, customers.getPassword());
			cid=ps.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return cid;
	}

	@Override
	public int login(String userName, String password) {
	String sql="select cid from customer_table where user_name=? and password=?";
	int cid=0;
	try {
		ps=DbUtil.getConnection().prepareStatement(sql);
		ps.setString(1, userName);
		ps.setString(2, password);
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			cid=rs.getInt("cid");
		}
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
		return cid;
	}

	@Override
	public void deleteCustomerById(int cid) {
		
	}

	@Override
	public List<Customers> getallCustomerInfo() {
		
		return null;
	}

	@Override
	public Customers getCustomerById(int cid) {
		
		return null;

	}

}
