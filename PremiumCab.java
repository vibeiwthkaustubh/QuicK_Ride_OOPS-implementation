package com.QuickRide.www;

public class PremiumCab extends Vehicle {
	
	// specialized variables for PremiumCab
	private static int countid = 1000;
      private final int tax_percentage = 18;
      private int comfort_level ;
      private int seater;  
      private int rating = 4;
      final private int rate_per_km = 30;
      
      int ac = 0;
      
      
      
      
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
      
      
      // Ac ON/OFF feature 
      void acon() {
    	  ac = 1;
      }
      
      
//  	Behavior implementation
  	
  	// Booking method
  	@Override
  	void book() {
  		if(this.getstate()==true) {
                System.out.println("Premium Ride booked successfully");
                this.setstate(false);
  		}
  		else System.out.println("Ride is busy");
  	}
  	
  	//check availability
  	@Override
  	void isAvaliable() {
  		if(this.getstate())System.out.println("Premium Cab is avaliable");
		else System.out.println("Premium Cab is not avaliable");
  	}
  	
  	
  	// Ride complete the method
  	@Override
  	void completeRide() {
  		this.setstate(true);
  		System.out.println("Hope you enjoyed the ride please do rate the driver");
  	}
      
}
