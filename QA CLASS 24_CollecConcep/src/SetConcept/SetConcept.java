package SetConcept;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetConcept {

	public static void main(String[] args) {
		//set doesnt store duplicate
		
		Set<String> colors= new HashSet<>();
		colors.add("black");
		colors.add("yellow");
		colors.add("green");
		colors.add("pink");
		colors.add("red");
		//colors.add("Black");
		colors.add("yellow");
		//colors.add("Pink");
		System.out.println(colors.size());
		
		Iterator<String> it =colors.iterator();
		/*
		 * System.out.println(it.next()); System.out.println(it.hasNext());
		 * System.out.println(it.next()); System.out.println(it.hasNext());
		 * System.out.println(it.next()); System.out.println(it.hasNext());
		 * System.out.println(it.next()); System.out.println(it.hasNext());
		 * System.out.println(it.next()); System.out.println(it.hasNext());
		 */
	
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	
	}

}
