package ExceptionHandling;

public class ArrayBondExceptionn {

	public static void main(String[] args) {
		
		
		System.out.println("Before dividing by zero");
		
		try {
			
			int[] a = new int [3];        //ArrayBondExceptions
			
			a[0] = 9;
			a[1] = 4;
			a[2] = 3;
			a[3] = 7;
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		System.out.println("Before dividing by zero");
	}

}