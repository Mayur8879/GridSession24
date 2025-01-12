package ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptions {

	public static void main(String[] args) throws FileNotFoundException {

		File file = new File("C:\\DumpStack.txt");
		
		FileReader fr = new FileReader (file);
		
		System.out.println("End of the Program");

	}

}
