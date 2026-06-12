package PolyMethodOverriding;

public class B extends A {
	//Method Overriding requires two classes and should have a is a relationship
	//changing the implementation of parent method in the child class
	
	public void factory() {
		System.out.println("factory belongs to child");
	}
	
	public void house() {
		System.out.println("modified by child for house method");
	}
	public static void main(String[] args) {
		
		B b= new B();
		b.house();
		b.car();
		b.factory();
	
	}

}
