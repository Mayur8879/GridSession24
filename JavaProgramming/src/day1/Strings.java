package day1;

public class Strings {

	public static void main(String[] args) {
	
		/* Actual Representation of String
		
		       String name = new String("Mayur Mandaliya");
		       
		Shorcut Representation of String
		
		       String name = "Mayur Mandaliya";              */
		
		String firstname = "Mayur";
		String space = " ";
		String lastname = "Mandaliya";
		
		String fullname = firstname+space+lastname;     //Concatenation operator
		
		System.out.println(fullname);
		
		
	 //Equals method
		
		System.out.println("Mayur".equals(firstname));   //true
	    System.out.println("Mayur".equals(lastname));    //false
		
	    
	 //Lenght Method
	
        System.out.println(fullname.length());	       //15
        
        
     //Substrings
        
        System.out.println(fullname.substring(6));
        System.out.println(fullname.substring(6, 10));
	
	   
     //Trim
        
        String name = "       Max       ";
        
        System.out.println(name.length());
        String trimmedname = name.trim();
        
        System.out.println(trimmedname.length());
              
	
      //Index
	    
        String para = "Selenium is the automation tool used for testing";
        
        String[] a = para.split(" ");
        
        for (String i:a) {
        	
        	System.out.println(i);
        }
        
        
        String y = "100";
        
        
	//Converting String text into number
        
        int num  = Integer.parseInt(y);
        
        System.out.println(num+50);
        
    //Converting String+Number into number
        
        String z = "123ABC";
        
        String j = z.substring(0,3);  //123
        
        int number = Integer.parseInt(j);
        
        System.out.println(number+50);
            
	} 

}
