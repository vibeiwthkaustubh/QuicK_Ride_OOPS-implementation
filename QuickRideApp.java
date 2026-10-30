package com.QuickRide.www;

public class QuickRideApp {
   public static void main(String[] args) {
	 

	Vehicle b1 = new Bike("kaustubh" , "pulsar");
//    Vehicle b2 = new Bike("kaustubh1" , "pulsar1");
//    Vehicle b3 = new Bike("kaustubh2" , "pulsar2");
//    Vehicle b4 = new Bike("kaustubh3" , "pulsar3");
//    Vehicle b5 = new Bike("kaustubh4" , "pulsar4");
	Vehicle a1 = new Auto("Savik " , "piaggo");
//	Vehicle a2 = new Auto("Savik1 " , "piaggo1");
//	Vehicle a3 = new Auto("Savik2 " , "piaggo2");
//	Vehicle a4 = new Auto("Savik3 " , "piaggo3");
//	Vehicle a5 = new Auto("Savik4 " , "piaggo4");
	Vehicle c1 = new Cab("Som" , "piaggo");
//	Vehicle c2 = new Cab("Som1" , "piaggo1");
//	Vehicle c3 = new Cab("Som2" , "piaggo2");
//	Vehicle c4 = new Cab("Som3" , "piaggo3");
//	Vehicle c5 = new Cab("Som4" , "piaggo4");
	Vehicle pc1 = new PremiumCab("Utkarsh" , "Rangrover");
//	Vehicle pc2 = new PremiumCab("Utkarsh1" , "Rangrover1");
//	Vehicle pc3 = new PremiumCab("Utkarsh2" , "Rangrover2");
//	Vehicle pc4 = new PremiumCab("Utkarsh3" , "Rangrover3");
//	Vehicle pc5 = new PremiumCab("Utkarsh4" , "Rangrover4");
	
//	b1.book();
//	Payment p1 = new Upi();
//	b1.payment(p1, 180);
	
	pc1.book();
	Payment p2 = new Upi();
	pc1.payment(p2, 60);
	
	
	
	
}
} 
