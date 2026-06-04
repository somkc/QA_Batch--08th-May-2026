package com.janbask.concat;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ConcatEx1 {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		String name="Lee";
		System.out.println(a+b+name);
		System.out.println(b+a+name);
		System.out.println(a+name+b);
		System.out.println(b+name+a);
		System.out.println(name+a+b);
		System.out.println(name+(a+b));
		
	}

}
