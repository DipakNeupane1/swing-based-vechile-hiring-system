/**
 * 
 */
package com.student.vechilehiring.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.student.vechilehiring.dto.Lorry;
import com.student.vechilehiring.util.DbUtil;

public class LorryDaoImpl implements LorryDao {

	PreparedStatement ps=null;
	Connection con=null;
	@Override
	public int createLorry(Lorry lorry) {
String sql="insert into lorry_table(make,model,top_speed,registration_number,hire_rate,load_capacity,status)values(?,?,?,?,?,?,?)";
int lid=0;
try {
	ps=DbUtil.getConnection().prepareStatement(sql);
	ps.setString(1, lorry.getMake());
	ps.setString(2,lorry.getModel());
	ps.setString(3, lorry.getTopSpeed());
	ps.setInt(4,lorry.getRegistrationNumber());
	ps.setString(5, lorry.getHireRate());
	ps.setString(6, lorry.getLoadCapacity());
	ps.setString(7, lorry.getStatus());
	lid=ps.executeUpdate();
} catch (ClassNotFoundException | SQLException e) {
	e.printStackTrace();
}
		return lid;
	}

	@Override
	public void deleteLorryById(int lid) {

	}

	@Override
	public List<Lorry> getallLorryInfo() {

		return null;
	}

	@Override
	public Lorry getLorryById(int lid) {

		return null;
	}

	@Override
	public int updateLorryInfo(Lorry lorry) {

		return 0;
	}

}
