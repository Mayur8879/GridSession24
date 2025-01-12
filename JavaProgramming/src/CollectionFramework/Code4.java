package CollectionFramework;

import java.util.HashMap;

public class Code4 {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hmap = new HashMap<Integer,String>();
		
		hmap.put(101, "Mayur");
		hmap.put(102, "Mandaliya");
		hmap.put(103, "Selenium");
		hmap.put(104, "Java");
		
		System.out.println(hmap.get(101));
		
		//for each loop
		for (Integer i: hmap.keySet()) {
			
			System.out.println(hmap.get(i));
		}
	}

}
