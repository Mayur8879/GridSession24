package day1;

public class Bike {

	String colour;
	String model;
	int mileage;
	int cost;
	
	public Bike(String clr, String mdl, int mil, int cst) {
		
	colour = clr;
	model = mdl;
	mileage = mil;
	cost = cst;
			
	}
	public void startBike() {
		
		System.out.println(model+" Bike Started");
	}
	
	public void StopBike() {
		
		System.out.println(model+" Bike Stopped");
	}
	
	
	public void BikeDetails() {
		
		System.out.println("Colour of the Bike is:"+colour);
		System.out.println("Model of the Bike is:"+model);
		System.out.println("Mileage of the Bike is:"+mileage);
		System.out.println("Cost of the Bike is:"+cost);
	
	
	
	}
	
}
