package modifiers;

public class StaticModifiers {

	public static void main(String[] args) {
		
	

    Car1 honda = new Car1();
    
    honda.model = "Civic";
    honda.color = "Grey";
    honda.cost = 2500000;
    honda.mileage = 15.5;
    
    Car1 hyundai = new Car1();
    
    hyundai.model = "i20";
    hyundai.color = "Black";
    hyundai.cost = 1500000;
    hyundai.mileage = 17.5;
    
    
    
    System.out.println(honda.model);
    System.out.println(Car1.wheels);
    
    
    hyundai.startcar();
    hyundai.stopcar();
    
    Car1.carwheels();
    
   }
}

