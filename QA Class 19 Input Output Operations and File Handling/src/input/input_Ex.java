package input;

import java.util.Scanner;

public class input_Ex {

	public static void main(String[] args) {
		// to check if number is even or odd
		
		System.out.println("Enter the number to check if its even or odd? ");
		Scanner sc= new Scanner(System.in);
		
		int a=sc.nextInt();
		
		if(a%2==0)
			System.out.println(a+" is even number");
		else
			System.out.println(a+" is odd number");
		

	}

}
