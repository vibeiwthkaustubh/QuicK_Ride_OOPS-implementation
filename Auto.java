package com.QuickRide.www;

public class Auto extends Vehicle {

	// specialized variable
	private static int countid = 1000;
	
	   

	// constructor for auto
	Auto(String driver_name , String vehicle_model  ) {
		super( driver_name ,  "QRA" + (++countid) ,  vehicle_model , 21);
	} 

		
		
		
		
	

	


}
