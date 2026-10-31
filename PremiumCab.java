package com.QuickRide.www;

public class PremiumCab extends Vehicle {
	
	// specialized variables for PremiumCab
	private static int countid = 1000;
     
      private int premium_charges = 30 ;      
     
     
           
//       boolean  ac = false;
      
      
      
      
    //constructor for premium cab
      PremiumCab(String driver_name  , String vehicle_model  ) {
  		super( driver_name ,  "QRPC" + (++countid) ,  vehicle_model  ,30);
  		
  	} 
      
      @Override
      int calculateFare() {
      	return super.calculateFare() + (int)(getCurrent_ride_km() * premium_charges);
      }
      

  
    	
      
      
      
      
  	
      
}
