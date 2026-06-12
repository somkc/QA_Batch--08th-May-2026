package returnType;

public class MathCal {
	
  public int add() {
		
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("addition of two numbers "+a+" and "+b+" is "+c);
	    return c;
  }

	public static void main(String[] args) {
		MathCal mat= new MathCal();
		int output=mat.add();
		
		System.out.println(output);
		//check if output is greater than 50
		
		  if(output>50) 
			  System.out.println("output is greater than 50"); 
		  else
		  System.out.println("output is lesser than 50");
		 
		
		

	}

}
