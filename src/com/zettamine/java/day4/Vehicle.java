package com.zettamine.java.day4;

public class Vehicle implements Loan,Insurance{
	private String vehicleNumber;
	private String modelName;
	private String vehicleType;
	private double price;
	
	public Vehicle(String vehicleNumber, String modelName, String vehicleType, double price) {
		super();
		this.vehicleNumber = vehicleNumber;
		this.modelName = modelName;
		this.vehicleType = vehicleType;
		this.price = price;
	}

	@Override
	public double takeInsurance() {
		if(price <= 150000) {
			return 3500.00;
		}else if(price > 150000 && price <= 300000) {
			return 4000;
		}else {
			return 5000;
		}
		
	}

	@Override
	public double issueLoan() {
		if(vehicleType.equalsIgnoreCase("2 wheeler")) {
			return price * 0.80f;
		}else if(vehicleType.equalsIgnoreCase("3 wheeler")) {
			return price * 0.75f;
		}else if(vehicleType.equalsIgnoreCase("4 wheeler")) {
			return price * 0.50f;
		}else {
		    return 0.0;
		}
	}
	
	

}
