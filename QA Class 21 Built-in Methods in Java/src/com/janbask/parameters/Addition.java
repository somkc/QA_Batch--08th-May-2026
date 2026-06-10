package com.janbask.parameters;

public class Addition {
	
	//arguments or parameters
	public void add(int a, int b) {
		//code for addition

		int res=a+b;
		System.out.println("Addition of two numbers "+a+" and "+b+" is "+res);
	}
	public void addThree(double a, double b, int c) {
		
	}

	
	public static void main(String[] args) {
		
		Addition a= new Addition();
		a.add(10, 20);
		a.add(30,15);
		a.add(78,61);
	}

}
