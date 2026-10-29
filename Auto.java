package com.QuickRide.www;

public class Auto extends Vehicle {
	
	// specialized variable
   private final int tax_percentage = 14;
   private int rating;
   final private int rate_per_km = 21;
   
   // constructor for auto
   Auto(String driver_name , String vehicle_no , String vehicle_model  ) {
		super( driver_name ,  vehicle_no ,  vehicle_model);
	} 
   
}
