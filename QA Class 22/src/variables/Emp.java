package variables;

public class Emp {
	//global variables
	String manager="Jack";
	char grade='A';
	
	public void info() {
		
		//local variables- scope is limited to only inside the function
		String name="Kevin";
		double salary=564.12;
		System.out.println(name);
		System.out.println(salary);
		System.out.println(manager);
		System.out.println(grade);
		
		
	}
	
	public void display() {
		String name="Peter";
		double salary=123.45;
		System.out.println(name);
		System.out.println(salary);
		System.out.println(manager);
		System.out.println(grade);
		
	}

	public static void main(String[] args) {
		
		Emp emp= new Emp();
		System.out.println(emp.manager);
		System.out.println(emp.grade);
		System.out.println("*********************************");
		emp.display();
		emp.info();

	}

}
