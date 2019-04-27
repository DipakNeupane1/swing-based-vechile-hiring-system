package com.student.vechilehiring.dao;

import java.util.List;

import com.student.vechilehiring.dto.MiniBuses;



public interface MiniBusesDao {


	public int createBus(MiniBuses miniBuses);

	public void deleteBusById(int busid);

	public List<MiniBuses> getallBusInfo();

	public MiniBuses getBusById(int busid);

	public int updateBusInfo(MiniBuses miniBuses);
}
