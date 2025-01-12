 package day1;

public class Operators {

	public static void main(String[] args) {
		
		int a=5, b=9, c=5, x=5, y=6, z=10, j=8, k=10, l=10, m=8;
		boolean d=true, e=false, f=true, g=false;
		//System.out.println("Welcome to JAVA"); //
		
		/*System.out.println("HELLO...");  Multiple line comment 
		System.out.println("HELLO...");
		System.out.println("HELLO...");
		System.out.println("HELLO...");*/
		
	//Arithmatic Operators//
		
	    System.out.println(a+b);     //14
	    System.out.println(a-b);     //-4
	    System.out.println(a*b);     //45
	    System.out.println(a/b);     //0
	    System.out.println(a%b);     //5
	    System.out.println(++a);     //6
	    System.out.println(--a);     //5
	    
	    
    //Relational Operators//
	    
	    System.out.println(a==b);  //false
	    System.out.println(a!=b);  //true
	    System.out.println(a>b);   //false
	    System.out.println(a<b);   //true
	    System.out.println(c>=a);  //true
	    System.out.println(a<=b);  //true
	    
	   
	//Logical Operators//   
	    
	    System.out.println(d&&e);   //false
	    System.out.println(d&&f);   //true
	    System.out.println(d||e);   //true
	    System.out.println(e||g);   //false
	    System.out.println(!d);     //false
	    System.out.println(!e);     //true
	    
	    
	  //Assignment Operators//	    
	    
	    x+=5;   //x+5
	    y-=7;   //y-7
	    z*=3;   //z*3
	    j/=2;   //j/2
	    k%=5;   //k%5
	    System.out.println(x);      //10
	    System.out.println(y);      //-1
	    System.out.println(z);      //30
	    System.out.println(j);      //4
	    System.out.println(k);      //0
	    
	  //Conditional Operators//  
	    
	    
	    boolean n = (l>m) ? true:false;
	    
	    System.out.println(n);  //true    
	}

}
