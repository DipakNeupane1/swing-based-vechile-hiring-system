package com.student.vechilehiring.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.student.vechilehiring.dto.MiniBuses;
import com.student.vechilehiring.util.DbUtil;

public class MiniBusesDaoImpl implements MiniBusesDao {

	PreparedStatement ps=null;
	Connection con=null;
	@Override
	public int createBus(MiniBuses miniBuses) {
		String sql="insert into bus_table(make,model,top_speed,registration_number,hire_rate,no_of_seats,status)values(?,?,?,?,?,?,?)";
		int busid=0;
		try {
			ps=DbUtil.getConnection().prepareStatement(sql);
			ps.setString(1, miniBuses.getMake());
			ps.setString(2, miniBuses.getModel());
			ps.setString(3, miniBuses.getTopSpeed());
			ps.setInt(4, miniBuses.getRegistrationNumber());
			ps.setString(5, miniBuses.getHireRate());
			ps.setInt(6, miniBuses.getNoOfSeats());
			ps.setString(7, miniBuses.getStatus());
			busid=ps.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return busid;
	}

	@Override
	public void deleteBusById(int busid) {
		
	}

	@Override
	public List<MiniBuses> getallBusInfo() {
		
		return null;
	}

	@Override
	public MiniBuses getBusById(int busid) {
		
		return null;
	}

	@Override
	public int updateBusInfo(MiniBuses miniBuses) {
		
		return 0;
	}

}
