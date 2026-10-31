package com.QuickRide.www;

public class Cab extends Vehicle {

	// specialized variables for Cab
	private static int countid = 1000;
	
	private  int seater;
	private int rating;   // The Rating will be given as per first ride and then the average will be calculated.
	
	int ac = 0;


	// Constructor for Cab
	Cab(String driver_name , String vehicle_model  ) {
		super( driver_name ,  "QRC" + (++countid) ,  vehicle_model , 30);
	} 


	// Ac on off feature 
	void acon() {
		ac = 1;
	}




}
	




