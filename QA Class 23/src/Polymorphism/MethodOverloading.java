package Polymorphism;

public class MethodOverloading {
	//methodoverloading- same method name but different argument/parameter
	//this occurs within the same class
	
	public void add() {
		System.out.println("addition");
	}

	public void add(int a, int b) {
		System.out.println("addition of two int numbers");
	}
	public void add(double a, double b) {
		System.out.println("addition of two double numbers");
	}
	public void add(String a, String b) {
		System.out.println("addition of two string");
	}
	public void add(char c) {
		System.out.println("addition of single char");
	}
	
	public static void main(String[] args) {
		MethodOverloading m= new MethodOverloading();
		m.add('J');
		m.add(56.77,90.12);
		m.add("lee","ddd");
	 //	m.add("peter");
	}

}
