package nonStatic;

public class MathOp {
	
	public void add() {
		
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("addition of two numbers "+a+" and "+b+" is "+c);
	}

	public static void main(String[] args) {
		MathOp mat= new MathOp();
		mat.add();
	}

}
