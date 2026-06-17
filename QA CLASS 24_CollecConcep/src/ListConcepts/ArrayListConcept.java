package ListConcepts;

import java.util.ArrayList;
import java.util.List;

public class ArrayListConcept {

	public static void main(String[] args) {
		//retrieval is faster
		List<String> stud= new ArrayList<>();
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
		
		System.out.println("****************");
		for(int i=0;i<stud.size();i++) {
			System.out.println(stud.get(i));
		}
	
	
	}
}
