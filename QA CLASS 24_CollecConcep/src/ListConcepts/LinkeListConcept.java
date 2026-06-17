package ListConcepts;

import java.util.LinkedList;
import java.util.List;

public class LinkeListConcept {

	public static void main(String[] args) {
		//insertion is faster
		List<String> stud= new LinkedList<>();
		stud.add("steve");
		stud.add("peter");
		stud.add("kevin");
		stud.add("Dean");
		stud.add(1, "bob");
		stud.remove(3000);
		System.out.println(stud.size());
		System.out.println(stud.get(0));
		System.out.println(stud.get(1));
		System.out.println(stud.get(2));
		System.out.println(stud.get(3));
		
	
	}

}
