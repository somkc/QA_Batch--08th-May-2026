package com.janbask.parameters;

public class Student_Parameters {
	
	public void info(String name) {
		System.out.println("converting name to upper case");
		System.out.println(name.toUpperCase());
		System.out.println("converting name to lower case");
		System.out.println(name.toLowerCase());
		System.out.println("***************************");
		
	}
	public static void main(String[] args) {
		Student_Parameters st= new Student_Parameters();
		st.info("Dennis");
		st.info("peTer");
		st.info("heNRY");
		
	}

}
