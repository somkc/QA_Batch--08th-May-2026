package ListConcepts;

import java.util.ArrayList;
import java.util.List;

public class HeteroEx {

	public static void main(String[] args) {
		
		List<Object> data= new ArrayList<>();
		data.add("Sam");
		data.add(10);
		data.add(4.8);
		data.add('B');
		for(int i=0;i<data.size();i++) {
			System.out.println(data.get(i));
		}

	}

}
