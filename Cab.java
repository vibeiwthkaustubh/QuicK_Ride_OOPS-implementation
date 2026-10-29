package com.QuickRide.www;

public class Cab extends Vehicle {
	
	// specialized variables for Cab
	private static int countid = 1000;
   private final int	tax_percentage = 16;
   private  int seater;
   private int rating;
   final private int rate_per_km = 30;
   
   int ac = 0;
   
   
   // Constructor for Cab
   Cab(String driver_name , String vehicle_model  ) {
		super( driver_name ,  "QRC" + (++countid) ,  vehicle_model);
	} 
   
   void acon() {
	   ac = 1;
   }
}
