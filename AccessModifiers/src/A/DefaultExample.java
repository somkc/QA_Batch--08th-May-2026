package A;

 class DefaultExample {
	String name="Bruce";
	char grade='A';
	
	void method1() {
		System.out.println("calling default function");
	}
	

	public static void main(String[] args) {
	
		DefaultExample d= new DefaultExample();
		System.out.println(d.name);
		System.out.println(d.grade);
		d.method1();


	}

}
