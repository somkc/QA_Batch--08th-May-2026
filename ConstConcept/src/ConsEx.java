
public class ConsEx {
	
	public ConsEx() {
		System.out.println("calling default constructor");
	}
	public void method1() {
		System.out.println("calling method1");
	}

	public static void main(String[] args) {
		
		ConsEx cons= new ConsEx();
		cons.method1();

	}

}
