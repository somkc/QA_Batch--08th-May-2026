package com.janbask.functions;

public class Operations {
	
	
	//methods or functions
	//reusable block of code
	
	//syntax  AcessModifier  returnType method/functionname
	public void add()
	{
	//code for addition
	int a =10;
	int b=20;
	int res=a+b;
	System.out.println("Addition of two numbers "+a+" and "+b+" is "+res);
	}
	
	public void sub(){
		
		//code for subtraction
				int j =50;
				int k=30;
				int r=j-k;
				System.out.println("Subtraction of two numbers "+j+" and "+k+" is "+r);

	}
	

	public static void main(String[] args) {

	//if we need access anything outside the main then we need create a object
		//Syntax
		// ClassName objectname = new ClassName()
		
		Operations op= new Operations();
		op.add();
		op.sub();
		
		

	}

}
