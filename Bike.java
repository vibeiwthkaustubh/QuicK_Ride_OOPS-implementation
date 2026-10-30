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

	// Booking method
	@Override
	void book() {
		if(this.getstate()==true) {
			System.out.println("Bike ride booked successfully");
			this.setstate(false);
		}
		else System.out.println("Ride is busy");
	}

	//check availability
	@Override
	void isAvaliable() {
		if(this.getstate())System.out.println("Bike is avaliable");
		else System.out.println("Bike is not avaliable");
	}


	// Ride complete the method
	@Override
	void completeRide() {
		this.setstate(true);
		System.out.println("Hope you enjoyed the ride please do rate the driver");
	}






}
