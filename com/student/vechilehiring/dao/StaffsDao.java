package com.student.vechilehiring.dao;


import com.student.vechilehiring.dto.Staffs;

public interface StaffsDao {

	public int registerStaffInfo(Staffs staffs);
	
	public int login(String staffName,String password);

}
