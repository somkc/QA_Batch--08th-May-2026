package com.janbask.functions;

public class Employee {
	
	public void empinfo() {
		String name="John";
		int age=35;
		double salary=450.13;
		System.out.println("name : "+name+" age: "+age+" salary:"+salary);
		
	}
	

	public static void main(String[] args) {
		
		//create object
		
		Employee emp = new Employee();
		emp.empinfo();
		

	}

}
