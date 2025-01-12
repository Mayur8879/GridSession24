package CollectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Code3 {

	public static void main(String[] args) {
	    
			//ArrayList<Integer> alist = new ArrayList<Integer>();
			List<Integer> alist = new ArrayList<Integer>();
			alist.add(1);
			alist.add(2);
			alist.add(3);
			alist.add(4);
			
			System.out.println("The Size of the ArrayList is:" +alist.size());
	        
			
		    //Using for Loop
		    //Using For Each loop
		    //Iterator and Iterator()
			
			Iterator<Integer> itr = alist.iterator();
			
			while (itr.hasNext()) {
				
				System.out.println(itr.next());
				
			}

		}
		
	}
