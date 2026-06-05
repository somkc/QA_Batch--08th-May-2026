package com.janbask.loops;

public class WhileLoopEx2 {

	public static void main(String[] args) {
		int i=1;
		boolean flag=true;
		while(flag) {
			
			if(i>10)//1>10 2>10 3>10 ... 10>10
			flag=false;
			System.out.println(i);
			i++;
		}

	}

}
