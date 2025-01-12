package Inheritance;

public class InheritanceCode {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		
//Creating Object for Parent class
		
	    d.Breed = "Husky";
	    d.Colour= "White";
	    d.Size = "3.5";
	    
	    d.eat();
	    d.sleep();
	    d.bark();
	System.out.println("------------------");
	    
	    
//Creating Object for Child Class
	    
	    Pug p = new Pug();
	    
	    p.Breed = "Golden Retriver";
	    p.Colour= "Golden";
	    p.Size = "3.8";
	    p.Nature = "Friendly";
	    
	    p.eat();
	    p.sleep();
	    p.bark();
        p.bite();		
	}

}
