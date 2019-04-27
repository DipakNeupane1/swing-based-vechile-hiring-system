package com.student.vechilehiring.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.student.vechilehiring.dto.Cars;
import com.student.vechilehiring.util.DbUtil;

public class CarsDaoImpl implements CarsDao {

	PreparedStatement ps = null;
	Connection con = null;

	@Override
	public int createCars(Cars cars) {
String sql="insert into cars_table(make,model,no_of_doors,to_speed,registration_number,hire_rate,fuel_type,status)values(?,?,?,?,?,?,?,?)";
int carid=0;
try {
	ps=DbUtil.getConnection().prepareStatement(sql);
	ps.setString(1, cars.getMake());
	ps.setString(2, cars.getModel());
	ps.setInt(3, cars.getNoOfDoors());
	ps.setString(4, cars.getTopSpeed());
	ps.setInt(5, cars.getRegistrationNumber());
	ps.setString(6, cars.getHireRate());
	ps.setString(7, cars.getFuelType());
	ps.setString(8, cars.getStatus());
	carid=ps.executeUpdate();
} catch (ClassNotFoundException | SQLException e) {
	e.printStackTrace();
}
		return carid;
	}

	@Override
	public void deleteCarsById(int carid) {

	}

	@Override
	public List<Cars> getallCarInfo() {

		return null;
	}

	@Override
	public Cars getCarById(int carid) {

		return null;
	}

	@Override
	public int updateCarInfo(Cars cars) {

		return 0;
	}

}
