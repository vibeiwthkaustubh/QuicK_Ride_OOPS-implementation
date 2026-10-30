package com.QuickRide.www;

public class Bike extends Vehicle {
	
	
	

	// specialized variables 
	private static int countid = 1000;
	final private int tax_percentage = 12;	
	private int rating;     // The Rating will be given as per first ride and then the average will be calculated.
	final private int rate_per_km = 15;
	




	// constructor of bike 
	Bike(String driver_name  ,  String vehicle_model  ) {
		super( driver_name  , "QRB" + (++countid), vehicle_model);
	} 




	//	Behavior implementation
	
	
	
	//check availability
		@Override
		void isAvaliable() {
			if(this.getState())System.out.println("Bike is avaliable");
			else System.out.println("Bike is not avaliable");
		}


		
		
	// Booking method
	@Override
	void book() {
		if(this.getState()==true) {
			
			 setCurrent_ride_km();
			 
			 
			
			System.out.println("Bike ride booked successfully and the fare for the ride is " + (int)calculateFare());
			this.setState(false);
		}
		else System.out.println("Ride is busy");
	}
	
	// Fare calculation
	@Override
	float calculateFare() {
		return (rate_per_km * this.getCurrent_ride_km());
	}

	

	// Ride complete the methodgit s
	
	






}
