package com.student.vechilehiring.dao;

import java.util.List;

import com.student.vechilehiring.dto.Lorry;



public interface LorryDao {


	public int createLorry(Lorry lorry);

	public void deleteLorryById(int lid);

	public List<Lorry> getallLorryInfo();

	public Lorry getLorryById(int lid);

	public int updateLorryInfo(Lorry lorry);
}
