package day1;

public class OneDimensionalArray {

	public static void main(String[] args) {
		
//Type 1:		
		int[] a = new int[3];   //Declaration and Creation of array
		
		//Assigning the values to array elements
		a[0] = 5;
		a[1] = 4;
		a[2] = 6;
		
		//Accessing the Array element
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
	
//Type 2:
		
       int[] b = {5,4,6};
		
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
	
	
//Find Size of array:
		
		System.out.println("Size of the Array:"+b.length);            
		
		
//Applying For loop with Array
		int[] c = {1,2,3,4,5,6,7,8};
		
		for (int i=0; i<c.length;i++) {
			
		System.out.println(c[i]);	
		}                                                  
		
//Applying For each loop with array
		int[] d = {4,9,5,3,8,1,7,10};
		
		for (int i:d) {
			
			if(i==3) {
				
				break;
			}
			System.out.println(i);
		}
		
	}

}

/*  int[] a= new int[3];
     a[0] = 1;
     a[1] = 2;
     a[2] = 3;
     a[3] = 4;      Array Index Out of Bounds Ex ceptions*/    