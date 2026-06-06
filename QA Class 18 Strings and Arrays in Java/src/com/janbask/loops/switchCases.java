package com.janbask.loops;

public class switchCases {

	public static void main(String[] args) {
		char grade='Z';
		
		switch(grade) {
		case 'A':
			System.out.println("FIRST CLASS");
			break;
		case 'B':
			System.out.println("SECOND CLASS");
			break;
		case 'C':
			System.out.println("THIRD CLASS");
			break;
		case 'D':
			System.out.println("FAIL");
			break;
		default:
			System.out.println("INVALID GRADE");
		
		}

		
	}

}
