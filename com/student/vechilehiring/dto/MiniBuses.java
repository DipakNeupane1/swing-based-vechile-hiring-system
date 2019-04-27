package com.student.vechilehiring.dto;

public class MiniBuses {
	
	
	public int getBusid() {
		return busid;
	}
	public void setBusid(int busid) {
		this.busid = busid;
	}
	private int busid;
	private String make;
	private String model;
	private String topSpeed;
	private int registrationNumber;
	private String hireRate;
	private int noOfSeats;
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
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
