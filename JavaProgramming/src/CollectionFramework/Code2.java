package CollectionFramework;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Code2 {

	public static void main(String[] args) {
		
		HashSet<Integer> ahset = new HashSet<Integer>();
		//Collection<Integer> ahset = new HashSet<Integer>();
		ahset.add(1);
		ahset.add(2);
		ahset.add(3);
		ahset.add(4);
		
		System.out.println("The Size of the Hashset is:" +ahset.size());
	
	   //Using For Each loop
		
		for (Integer i : ahset) {
			
			System.out.println(i);

		}
	}

}
