package tryCatch;

public class tryCatcEx2 {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int resAdd=0;
		int resSub=0;
		int resDiv=0;
		try {
		 resAdd =a/b;
		 resSub=a-b;
		 resDiv=a/0;
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("cannot perform operations");
		}
		
		System.out.println("Addition of numbers "+a+" and "+b+" is "+resAdd);
		System.out.println("Subtraction of numbers "+a+" and "+b+" is "+resSub);
		System.out.println("Division of numbers "+a+" and "+b+" is "+resDiv);
		
	}

}
