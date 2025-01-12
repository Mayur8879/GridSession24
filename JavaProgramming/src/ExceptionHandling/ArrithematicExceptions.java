package ExceptionHandling;

public class ArrithematicExceptions {

	public static void main(String[] args) {
		
		System.out.println("Before dividing by zero");
		
		try {
			int a = 10/0;                   //Arithmetic Exception
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		System.out.println("Before dividing by zero");
	}

}