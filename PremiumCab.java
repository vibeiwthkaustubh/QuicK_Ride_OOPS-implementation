package com.QuickRide.www;

public class PremiumCab extends Vehicle {
	
	// specialized variables for PremiumCab
	private static int countid = 1000;
      private final int tax_percentage = 18;
      private int comfort_level ;
      private int seater;  
      private int rating = 4;
      final private int rate_per_km = 30;
      
    //constructor for premium cab
      PremiumCab(String driver_name  , String vehicle_model  ) {
  		super( driver_name ,  "QRPC" + (++countid) ,  vehicle_model);
  		
  	} 
      PremiumCab(String driver_name  , String vehicle_model , int rating ) {
    		super( driver_name ,  "QRPC" + (++countid) ,  vehicle_model);
    		if(rating>=1 && rating<=5) {
    			this.rating = rating;
    		}
    		else System.out.println("Pass a valid rating between 1 to 5");
    		
    	} 
      
}
