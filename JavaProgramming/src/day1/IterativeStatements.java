package day1;

public class IterativeStatements {

	public static void main(String[] args) {
		 
	int a=0, b=0,c,z=0, y=0;
	
	//while loop
		while(a<5) {
			System.out.println("Value of a is:"+a);
		++a;
		}
		     
	//Do while Loop
		do {
			System.out.println("Value of b is:"+b);
			++b;
		}while(b<6);
		
	//For Loop
		for (c=0;c<3;c++) {
		System.out.println("Value of C is:"+c);
		
		}
	
	//break
		while(z<5) {
			if(z==3) {
				break;
			}
			System.out.println("Value of z is:"+z);
		++z;
		}
	
		
	//Continue	
		while(y<5) {
			if(y==3) {
			y++;	
		continue;
			}
			System.out.println("Value of y is:"+y);
		++y;
		}
	}

}
 
