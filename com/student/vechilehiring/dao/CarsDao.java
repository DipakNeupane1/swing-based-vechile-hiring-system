package com.student.vechilehiring.dao;

import java.util.List;

import com.student.vechilehiring.dto.Cars;

public interface CarsDao {

	public int createCars(Cars cars);

	public void deleteCarsById(int carid);

	public List<Cars> getallCarInfo();

	public Cars getCarById(int carid);

	public int updateCarInfo(Cars cars);

}
