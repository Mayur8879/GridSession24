package Inheritance;

public class Overriding extends Pug {

	
//Overriding the same method from the different Class
//Constructors cannot be Overrided because it has there own Class name and due to this it cannot be same
	 
	public void bite() {
		System.out.println(Breed+" Dog is Biting");
	}

}
