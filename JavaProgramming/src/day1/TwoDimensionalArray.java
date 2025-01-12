package day1;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
//Type 1:		
				int[][] a = new int[2][3];   //Declaration and Creation of array
				
				//Assigning the values to array elements
				
   		    	a[0][0] = 5;
				a[0][1] = 4;
				a[0][2] = 6;
			    a[1][0]	= 8;
			    a[1][1] =10;
			    a[1][2] = 2;	
			    
				//Accessing the Array element
				
				System.out.println(a[0][0]);
				System.out.println(a[0][1]);
				System.out.println(a[0][2]);			
				System.out.println(a[1][0]);
				System.out.println(a[1][1]);
				System.out.println(a[1][2]);
			      
//Type 2:
				
				
int[][] b = {{5,4,6,7},{8,10,2,1}};   //Declaration and Creation of array //Assigning the values to array elements
				
				
			   //Accessing the Array element
				
				System.out.println(b[0][0]);
				System.out.println(b[0][1]);
				System.out.println(b[0][2]);
				System.out.println(b[0][3]);
				System.out.println(b[1][0]);
				System.out.println(b[1][1]);
				System.out.println(b[1][2]);
				System.out.println(b[1][3]);  
		
//Find Size of array:
		
		       System.out.println("Size of row is:"+a.length);
		       System.out.println("Size of column is:"+a[0].length);   
		       
//For Loop using Two Dimensional Array
		       
		       for (int row=0;row<a.length;row++) {
		    	   
		    	   for (int col=0;col<a[0].length;col++) {
		    		   
		    		   System.out.println(a[row][col]);
		    	   }	   
		    	   
		       }
		       
		       
// using the Parent class of java : object
		       
		       Object[] z = {9, "mayur",'s',true,1.55};
		       
		       for (Object i:z) {
		    	   
		    	   System.out.println(i);
		       }
	
		       
		       
	}

}
