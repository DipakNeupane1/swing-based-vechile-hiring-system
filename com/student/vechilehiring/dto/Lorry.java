package com.student.vechilehiring.dto;

public class Lorry {
	
	private int lid;
	private String make;
	private String model;
	private String topSpeed;
	private int registrationNumber;
	private String hireRate;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getTopSpeed() {
		return topSpeed;
	}
	public void setTopSpeed(String topSpeed) {
		this.topSpeed = topSpeed;
	}
	public int getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(int registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public String getHireRate() {
		return hireRate;
	}
	public void setHireRate(String hireRate) {
		this.hireRate = hireRate;
	}
	public String getLoadCapacity() {
		return loadCapacity;
	}
	public void setLoadCapacity(String loadCapacity) {
		this.loadCapacity = loadCapacity;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	private String loadCapacity;
	private String status;
}
