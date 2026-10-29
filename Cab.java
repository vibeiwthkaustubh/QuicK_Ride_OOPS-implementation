package com.QuickRide.www;

public class Cab extends Vehicle {
	
	// specialized variables for Cab
   private final int	tax_percentage = 16;
   private  int seater;
   private int rating;
   final private int rate_per_km = 30;
   
   
   // Constructor for Cab
   Cab(String driver_name , String vehicle_no , String vehicle_model  ) {
		super( driver_name ,  vehicle_no ,  vehicle_model);
	} 
}
