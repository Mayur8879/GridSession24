package modifiers;

public class Car1 {

	
	//Instance variables
	String model;
	String color;
	int cost;
	double mileage;
	
	//Static Variables
	static int wheels = 4;       //Common Variable
	
	//Instance methods
	
	public void startcar() {
		
		System.out.println(model+" Car will be started");
	}
	
    public void stopcar() {
		
		System.out.println(model+" Car will be started");
	}
    
    
    //Static Method
    public static void carwheels() {
		
		System.out.println("Number of wheels of the Car is:" +wheels);
	}    
}
