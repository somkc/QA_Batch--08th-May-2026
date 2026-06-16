package A;

 public class ProtectedExample {
	 
	protected String name="Bruce";
	protected char grade='A';
	
	 protected void method1() {
		System.out.println("calling method1");
	}
	protected void method2() {
		System.out.println("calling method 2");
	}


	public static void main(String[] args) {
		ProtectedExample p= new ProtectedExample();
		p.method1();
		p.method2();
		System.out.println(p.name);
		System.out.println(p.grade);

	}

}
