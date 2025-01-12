package day1;

public class ObjectReference {

	//Object should not created outside the methods
	
	public static void main(String[] args) {
		
	//object creation statement
		
		Car bmw = new Car();
		Car audi = new Car();
		
	//Initializing the object
		
		bmw.colour = "Black";
		bmw.model = "X7";
		bmw.mileage = 20;
		bmw.cost = 10000000;
		
		audi.colour = "White";
		audi.model = "A8";
		audi.mileage = 25;
		audi.cost = 15000000;
		
	//Accessing the methods
		
		bmw.startCar();
		bmw.StopCar();
		bmw.CarDetails();
		
		System.out.println("---------------------");
		
		audi.startCar();
		audi.StopCar();
		audi.CarDetails();
		
		System.out.println("---------------------");
		
       //Accessing the variables
		
		System.out.println(bmw.colour);
		
		System.out.println(audi.colour);
	}

}
