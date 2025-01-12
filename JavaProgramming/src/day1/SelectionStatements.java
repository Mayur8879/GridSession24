package day1;

public class SelectionStatements {

	public static void main(String[] args) {
		
		int a=5, b=3, c=5, d=7, e=2, f=4, g=6, i=10;
       
		//if Statement
		if(a>b) {                
       
       System.out.println("A is the Greater number");
       
       }
       
     
	//if..Else statement	
		if(c>d) {
           
           System.out.println("C is the Greater number");
           
           }
           else {
        	   
           System.out.println("D is the Greater number");   
           }
	
	//if..else if...else
		
		if(e>f) {
			
			System.out.println("E is the Greater number");
		}
		
		else if(f>g) {
			
			System.out.println("F is the Greater number");
		}
		
		else {
			
			System.out.println("H is the greater number");
		}
			
		
		//Switch
		
		switch (i) {
		
		case 0:
			System.out.println("Inside case 0");
			break;
		case 1:
			System.out.println("Inside case 1");
			break;
		case 2:
			System.out.println("Inside case 2");
			break;
		default :
			System.out.println("Default case will be executed");
		}	
	}
}