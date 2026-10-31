package com.QuickRide.www;
import java.util.Scanner;
abstract public class Vehicle {
	private static final int MAX_KM = 5000;
	static Scanner sc = new Scanner(System.in);

	// fields
	private String driver_name;
	private String vehicle_no;
	private String vehicle_model;
	private int rate_per_km ;
	
	
	private boolean state = true;    // why here DRY (Don't repeat yourself)
	final private int tax_percentage = 12;
	
	private float current_ride_km ;
	
	// Rating field
	private int rating; // The Rating will be given as per first ride and then the average will be calculated.
	private int ratingcount;
	private int totalrating;	
	


	private void setRating() {
		System.out.println("Enter the rating between 1 to 5 or press Enter to skip");
		String s = sc.nextLine().trim();
		if (!s.isEmpty()) {
			int a;
			try {
				a = Integer.parseInt(s);
			} catch (NumberFormatException e) {
				System.out.println("Not a valid rating");
				return;
			}
			if (a > 0 && a <= 5) {
				this.ratingcount++;
				this.totalrating = totalrating + a;
				this.rating = this.totalrating / this.ratingcount;
				System.out.println("Thank you for the rating");
			}
			else System.out.println("Not a valid rating");
		}
	}




	// Parent class constructor	
	Vehicle (String driver_name , String vehicle_no , String vehicle_model ,int rate_per_km ){
		this.driver_name = driver_name;
		this.vehicle_model = vehicle_model;
		this.vehicle_no = vehicle_no; 
		this.rate_per_km = rate_per_km;
		;
	}



	// getter  and setter for ride_per_km

	public float getCurrent_ride_km() {
		return this.current_ride_km;
	}



//	public void setCurrent_ride_km() {
//		System.out.println("Enter the Distance in KMS for current ride");
//		
//	}






	// getter and setter for state for state
	private boolean getState() {	
		return state;
	}	 
	private void setState(boolean state) {
		this.state = state;
	}





	

// Booking method for bike, cab , and auto
	void book(int a) {
		if(a<=MAX_KM) {
		if(a>0) {
		if(this.getState()==true) {
			this.current_ride_km = a;	
			System.out.println("Ride is booked successfully and the fare for the ride is " + calculateFare());
			this.setState(false);
		}
		else System.out.println("Ride is busy");
	}
		else System.out.println("Please enter a valid distance");
		}
		else System.out.println("No booking can be made for distance greater than 5000");
	}


	
 // Getter for checking availability of the ride 
	 void checkAvailability() {
		 if(this.getState())System.out.println("Ride is avaliable");
			else System.out.println("Ride is not avaliable");
	 }





	// Follows DRY(Don't repeat yourself ) // Ride completion  method called by the payment only.
	private void completeRide() {
		if(!this.getState()) {
			this.setState(true);
		}

		else {
			System.out.println("Ride is already free");
		}


	}




	
// Fare calculation logic for Bike,car and auto
	int calculateFare() {
		float basefare = this.rate_per_km * this.getCurrent_ride_km();
		float total  =  + this.tax_percentage * (this.rate_per_km * this.getCurrent_ride_km())/100f;
		return ((int)(total + basefare) + 1);
	}




	
//payment logic for bike , car , and auto 
	void payment(Payment ref , int amount_paid) {
		if(!this.state) {
			if(ref!=null) {
			if(ref.paying((int)this.calculateFare() , amount_paid)) {
				IO.println("payment successfull");
				this.completeRide();
				this.setRating();
			}
			else System.out.println("Try again payment failed");
			}
			else System.out.println("Please select a valid payment method");
		}
		else System.out.println("No payment pending");
	}









}
