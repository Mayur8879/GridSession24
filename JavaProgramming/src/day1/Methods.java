package day1;

public class Methods {

	public static void main(String[] args) {
		
	methodZero();       //method calling statement
	methodOne(10);
    methodTwo(15,11);
    methodFive(1,2,3,4,5);
	}

	public static void methodZero() {
		
		System.out.println("Inside methodZero");
	
	//	methodTwo();       method calling statement	from Non main method
	}
	
	public static void methodOne(int a) {
		
		System.out.println("Inside methodOne - Parameter value is:"+a);
	}
	
    public static void methodTwo(int b, int c) {
		
		System.out.println("Inside methodTwo - Parameter value is:"+(b+c));
	}
 public static void methodFive(int d, int e, int f, int g, int h) {
		
		System.out.println("Inside methodFive - Parameter value is:"+(d+e+f+g+h));
	}             
	
	
//Return type Methods
 
/* 1:  public static void main(String[] args) {
	 
	 int result = add(10,5);
	 
	 System.out.println(result);
	 
 }
	public static int add(int x,int y) {
		
		int sum = x+y;
		return sum;
		
	}                                                               
2:  public static void main(String[] args) {
	 
	 String result = methodSample();
	 
	 System.out.println(result);
	 
 }
	public static String methodSample() {
		
		
		return "Mayur Mandaliya";    
		 }                                      */
 
}


