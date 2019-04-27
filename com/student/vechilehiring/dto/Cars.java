package com.student.vechilehiring.dto;

public class Cars {

	private int carid;
	public int getCarid() {
		return carid;
	}
	public void setCarid(int carid) {
		this.carid = carid;
	}
	private String make;
	private String model;
	public int getNoOfDoors() {
		return noOfDoors;
	}
	private String topSpeed;
	private int registrationNumber;
	private String hireRate;
	private String fuelType;
	public void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}
	private int noOfDoors;
	private String status;
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
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
