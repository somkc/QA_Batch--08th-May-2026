package StaticKeyword;

public class Employee {
	static String name="Patrick";
	static int age=30;
	static double height=6.1;
	
	public static void add() {
		System.out.println("calling add in employee class");
	}

	public static void main(String[] args) {

 
     System.out.println(name);
     System.out.println(age);
     System.out.println(height);
     add();

	}

}
