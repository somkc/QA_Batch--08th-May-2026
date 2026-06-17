package MapConcept;

import java.util.HashMap;
import java.util.Map;

public class MapConcept {

	public static void main(String[] args) {
		//key value
		Map<String,Integer> subj= new HashMap<>();
		subj.put("phy", 70);
		subj.put("chem", 60);
		subj.put("bio", 80);
		
		System.out.println(subj.get("phy"));
		System.out.println(subj.containsKey("eco"));
		System.out.println(subj.containsValue(80));
		System.out.println(subj);
		
	}

}
