package returnType;

public class Oper {
	
	public static int max(int a, int b) {
		
		 if(a>b)
			return a;
		 else
			 return b;
	}

	public static void main(String[] args) {
	
		
		System.out.println(max(45,55));
		System.out.println(max(67,43));
		System.out.println(max(90,56));
		System.out.println(max(4,3));
		

	}

}
