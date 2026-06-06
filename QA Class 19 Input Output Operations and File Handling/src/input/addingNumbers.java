package input;

import java.util.Scanner;

public class addingNumbers {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first number ");
		int k=sc.nextInt();
		System.out.println("Enter the second number");
		int j=sc.nextInt();
		
		int res=k+j;
		System.out.println("Addition of two numbers -> "+k+" and "+j+" is -> "+res);
		

	}

}
