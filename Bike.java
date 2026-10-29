package com.QuickRide.www;

public class Bike extends Vehicle {
       
	// specialized variables 
	final private int tax_percentage = 12;	
	private int rating;
	final private int rate_per_km = 15;
	
	
	
	// constructor of bike 
 Bike(String driver_name , String vehicle_no , String vehicle_model  ) {
		super( driver_name ,  vehicle_no ,  vehicle_model);
	} 
	
	
}
