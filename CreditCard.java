package com.QuickRide.www;

public class CreditCard implements Payment{
	
	public boolean paying(int ride_fare , int paid_amt) {
    	if(ride_fare==paid_amt) {
    		return true;
    	}
    	else return false;
     }
	}

