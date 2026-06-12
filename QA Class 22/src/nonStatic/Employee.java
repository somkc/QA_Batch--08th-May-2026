package nonStatic;

public class Employee {
	String name="Patrick";
	int age=30;
	double height=6.1;
	

	public static void main(String[] args) {

     Employee emp = new Employee();
     System.out.println(emp.name);
     System.out.println(emp.age);
     System.out.println(emp.height);

	}

}
