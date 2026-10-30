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



	//	Behavior implementation

	// Booking method
	@Override
	void book() {
		if(this.getState()==true) {
			 setCurrent_ride_km();
			System.out.println("Auto ride booked successfully and the fare is " + (int)calculateFare());
			this.setState(false);
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
		if(this.getState())System.out.println("Auto is avaliable");
		else System.out.println("Auto is not avaliable");
	}


	


}
