package com.QuickRide.www;

public class Bike extends Vehicle {
	
	
	

	// specialized variables 
	private static int countid = 1000;		
	
	
	


	// constructor of bike 
	Bike(String driver_name  ,  String vehicle_model  ) {
		super( driver_name  , "QRB" + (++countid), vehicle_model  , 15);  // those tax and rate per km are inaccessible 
	} 


}
