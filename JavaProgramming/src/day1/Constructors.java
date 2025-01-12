package day1;

public class Constructors {
	//Object should not created outside the methods
	
	public static void main(String[] args) {
		
	//object creation statement
		
		Bike bmw = new Bike("Black","X7",20,10000000);
		Bike audi = new Bike("White","A8",25,15000000);
		
	//Accessing the methods
		
		bmw.startBike();
		bmw.StopBike();
		bmw.BikeDetails();
		
		System.out.println("---------------------");
		
		audi.startBike();
		audi.StopBike();
		audi.BikeDetails();
		
		System.out.println("---------------------");
		
	}

}
