package HandlingFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class PageReader {

	public static void main(String[] args) throws IOException {
		
		//Representing the File
		File file = new File("Sample\\demo.txt");
		
		//Reading Text from the File
		//Predefined class required are FileReader, BufferedReader
		
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		String str;
		while((str = br.readLine())!=null) {
		
		System.out.println(str);
		}
		
		//To release memory 
		br.close();
	}
}

