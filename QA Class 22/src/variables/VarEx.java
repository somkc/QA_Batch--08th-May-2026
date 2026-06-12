package variables;

public class VarEx {
	int reg=456;
	boolean cond=true;
	String name="Steve";
	
	public void display() {
		int reg=876;
		String name="Dean";
		double id=345.6;
		System.out.println(reg);
		System.out.println(name);
		System.out.println(cond);
		System.out.println(id);
	}

	public static void main(String[] args) {
	
		VarEx v= new VarEx();
		System.out.println(v.name);
		//System.out.println(v.id); local variables cannot be accessed outside
		v.display();

	}

}
