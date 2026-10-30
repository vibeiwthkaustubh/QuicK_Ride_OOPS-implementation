package com.QuickRide.www;
import java.util.Scanner;
abstract public class Vehicle {

	Scanner sc = new Scanner(System.in);
	
	// fields
	private String driver_name;
	private String vehicle_no;
	private String vehicle_model;
	private boolean state = true;    // why here DRY (Don't repeat yourself)
	private float current_ride_km ;



 // getter  and setter for ride_per_km

	public float getCurrent_ride_km() {
		return current_ride_km;
	}



	public void setCurrent_ride_km() {
		System.out.println("Enter the Distance in KMS for current ride");
		this.current_ride_km = sc.nextFloat();
	}



	// Parent class constructor	
	Vehicle (String driver_name , String vehicle_no , String vehicle_model){
		this.driver_name = driver_name;
		this.vehicle_model = vehicle_model;
		this.vehicle_no = vehicle_no;    				
	}



	// getter for state
	public boolean getstate()
	{
		return state;
	}

	// setter	for state 
	public void setstate(boolean state) {
		this.state = state;
	}





	// Behaviors of child booking related
	abstract void book();
	abstract void isAvaliable();
	abstract void completeRide();
	
	
	
	
	// Behavior of the child payment related
		
	abstract float calculateFare();
	
	void payment(Payment ref , int amount_paid) {
		if(ref.paying((int)this.calculateFare() , amount_paid)) {
			IO.print("payment successfull");
			this.completeRide();
		}
		else System.out.println("Try again payment failed");
	}









}
