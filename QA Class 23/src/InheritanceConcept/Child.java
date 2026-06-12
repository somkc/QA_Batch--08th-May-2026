package InheritanceConcept;

//extends keyword is used for inheritance
//or to establish a relationship

public class Child extends Parent  {
	
	public void factory() {
		System.out.println("factory belongs to child");
	}

	public static void main(String[] args) {
		Child c = new Child();
		c.factory();
		System.out.println(c.lname);
		System.out.println(c.grade);
		System.out.println(c.income);
		c.house();
		c.car();
	


	}

}
