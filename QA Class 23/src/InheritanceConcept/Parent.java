package InheritanceConcept;

public class Parent {
	//GLOBAL VARIABLE
	
	String lname="Xavier";
	char grade='B';
	double income=456.89;
	
	public void house() {
		
		System.out.println("house belongs to parent");
	}
	public void car() {
		System.out.println("car belongs to parent");
	}

	public static void main(String[] args) {
	
		Parent p = new Parent();
		System.out.println(p.lname);
		System.out.println(p.grade);
		System.out.println(p.income);
		//p.factory; cannot access child function

	}

}
