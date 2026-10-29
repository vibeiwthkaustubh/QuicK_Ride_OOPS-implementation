package com.QuickRide.www;

 abstract public class Vehicle {
	private String driver_name;
	private String vehicle_no;
	private String vehicle_model;
	
	
	// Parent class constructor
	
	Vehicle (String driver_name , String vehicle_no , String vehicle_model){
		this.driver_name = driver_name;
		this.vehicle_model = vehicle_model;
		this.vehicle_no = vehicle_no;    
		
	}
	
}
