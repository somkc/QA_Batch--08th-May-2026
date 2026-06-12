package Polymorphism;

public class MethodOverloadingEx1 {
	
	public void method1() {
		System.out.println("calling method");
	}
	
	public void method1(int a) {
		System.out.println("calling second method");
	}
	
	public void method1(int a,int b) {
		System.out.println("calling second method");
	}
	public void method1(double a) {
		System.out.println("calling second method");
	}

	public static void main(String[] args) {
		
		MethodOverloadingEx1 me = new  MethodOverloadingEx1();
		me.method1(10);

	}

}
