package com.QuickRide.www;

abstract public class Vehicle {

	// fields
	private String driver_name;
	private String vehicle_no;
	private String vehicle_model;
	private boolean state = true;    // why here DRY (Don't repeat yourself)





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

	// setter	 
    public void setstate(boolean state) {
    	this.state = state;
    }





	//    Behaviors of child
	abstract void book();
	abstract void isAvaliable();
	abstract void completeRide();





}
