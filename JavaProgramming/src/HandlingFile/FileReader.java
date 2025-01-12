package HandlingFile;

import java.io.File;

public class FileReader {

	public static void main(String[] args) {
		
	File file = new File("Sample\\demo.txt");

	
	if (file.exists()) {
		
		System.out.println("File exists in the provided path");
	
	    System.out.println(file.getAbsolutePath());
	}
	
	else {
		
		System.out.println("File does not exists in the provided path");
	}
		
	
	}
}
