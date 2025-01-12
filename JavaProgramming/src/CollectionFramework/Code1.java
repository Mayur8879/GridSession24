package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Code1 {

	public static void main(String[] args) {
    
		//ArrayList<Integer> alist = new ArrayList<Integer>();
		List<Integer> alist = new ArrayList<Integer>();
		alist.add(1);
		alist.add(2);
		alist.add(3);
		alist.add(4);
		
		System.out.println("The Size of the ArrayList is:" +alist.size());
        
		
		//Using for Loop
		for (int i=0; i<alist.size(); i++) {
			
		System.out.println(alist.get(i));	
		}
	
	   //Using For Each loop
		
		for (Integer j : alist) {
			
			System.out.println(j);


	 }

	}
	
}
