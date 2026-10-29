package com.QuickRide.www;

public class PremiumCab extends Vehicle {
	
	// specialized variables for PremiumCab
      private final int tax_percentage = 18;
      private int comfort_level ;
      private int seater;  
      private int rating;
      final private int rate_per_km = 30;
      
    //constructor for premium cab
      PremiumCab(String driver_name , String vehicle_no , String vehicle_model  ) {
  		super( driver_name ,  vehicle_no ,  vehicle_model);
  	} 
}
