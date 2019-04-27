package com.student.vechilehiring.dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.student.vechilehiring.dto.Staffs;

public class StaffsDaoImpl implements StaffsDao {
	String file = ClassLoader.getSystemResource("staff.txt").getFile();

	@Override
	public int registerStaffInfo(Staffs staffs) {
		System.out.println(file);
		int saved = 0;
		try (FileWriter fw = new FileWriter(file, true); PrintWriter out = new PrintWriter(fw);) {
			String Line = staffs.getStaffName() + " " + staffs.getPassword();
			out.println(Line);
		} catch (IOException ie) {
			ie.printStackTrace();
		}
		return saved;
	}

	@Override
	public int login(String staffName, String password) {
		int staffid = 0;
		try (BufferedReader read = new BufferedReader(new FileReader(file));) {
			String len;
			while ((len = read.readLine()) != null) {
				if (len.contains(staffName) && len.contains(password)) {
					staffid = 1;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return staffid;
	}
}