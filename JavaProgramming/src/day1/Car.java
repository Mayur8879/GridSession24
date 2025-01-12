package day1;

//class is a template for creating objects

public class Car {

	String colour;
	String model;
	int mileage;
	int cost;
	
	public void startCar() {
		
		System.out.println(model+" Car Started");
	}
	
	public void StopCar() {
		
		System.out.println(model+" Car Stopped");
	}
	
	
	public void CarDetails() {
		
		System.out.println("Colour of the Car is:"+colour);
		System.out.println("Model of the Car is:"+model);
		System.out.println("Mileage of the Car is:"+mileage);
		System.out.println("Cost of the Car is:"+cost);
	
	
	
	}
	
}
