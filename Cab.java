package com.QuickRide.www;

public class Cab extends Vehicle {

	// specialized variables for Cab
	private static int countid = 1000;
	private final int	tax_percentage = 16;
	private  int seater;
	private int rating;   // The Rating will be given as per first ride and then the average will be calculated.
	final private int rate_per_km = 30;

	int ac = 0;


	// Constructor for Cab
	Cab(String driver_name , String vehicle_model  ) {
		super( driver_name ,  "QRC" + (++countid) ,  vehicle_model);
	} 


	// Ac on off feature 
	void acon() {
		ac = 1;
	}




	//	Behavior implementation

	// Booking method
	@Override
	void book() {
		if(this.getstate()==true) {
			 setCurrent_ride_km();
			System.out.println("Cab ride booked successfully and the fare is " + (int)calculateFare());
			this.setstate(false);
		}
		else System.out.println("Ride is busy");
	}
	
	// Fare calculation
		@Override
		float calculateFare() {
			return (rate_per_km * this.getCurrent_ride_km());
		}

	//check availability
	@Override
	void isAvaliable() {
		if(this.getstate())System.out.println("Cab is avaliable");
		else System.out.println("Cab is not avaliable");
	}


	// Ride complete the method
	@Override
	void completeRide() {
		this.setstate(true);
		System.out.println("Hope you enjoyed the ride please do rate the driver");
	}



}
