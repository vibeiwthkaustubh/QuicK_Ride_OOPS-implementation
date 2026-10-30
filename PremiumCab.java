package com.QuickRide.www;

public class PremiumCab extends Vehicle {
	
	// specialized variables for PremiumCab
	private static int countid = 1000;
      private final int tax_percentage = 18;
      private int premium_charges = 30 ;
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
      
      
   // Fare calculation
  	@Override
  	float calculateFare() {
  		return ((rate_per_km * this.getCurrent_ride_km() + (this.getCurrent_ride_km() *premium_charges)));
  	}
      
      
//  	Behavior implementation
  	
  	// Booking method
  	@Override
  	void book() {
  		if(this.getState()==true) {
  			 setCurrent_ride_km();
                System.out.println("Premium Ride booked successfully and the fare is " + (int)calculateFare());
                this.setState(false);
  		}
  		else System.out.println("Ride is busy");
  	}
  	
  	//check availability
  	@Override
  	void isAvaliable() {
  		if(this.getState())System.out.println("Premium Cab is avaliable");
		else System.out.println("Premium Cab is not avaliable");
  	}
  	
  	
  	// Ride complete the method
  	
      
}
