package com.QuickRide.www;

public class Bike extends Vehicle {
       
	// specialized variables 
	private static int countid = 1000;
	final private int tax_percentage = 12;	
	private int rating;
	final private int rate_per_km = 15;
	 
	
	
	// constructor of bike 
 Bike(String driver_name  ,  String vehicle_model  ) {
		super( driver_name  , "QRB" + (++countid), vehicle_model);
	} 
	
	
}
