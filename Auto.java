package com.QuickRide.www;

public class Auto extends Vehicle {
	
	// specialized variable
	private static int countid = 1000;
   private final int tax_percentage = 14;
   private int rating ;   // The Rating will be given as per first ride and then the average will be calculated.
   final private int rate_per_km = 21;
   
   // constructor for auto
   Auto(String driver_name , String vehicle_model  ) {
		super( driver_name ,  "QRA" + (++countid) ,  vehicle_model);
	} 
   
}
