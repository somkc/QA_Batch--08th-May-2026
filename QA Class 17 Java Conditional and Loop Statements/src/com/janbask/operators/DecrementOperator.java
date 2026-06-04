package com.janbask.operators;

public class DecrementOperator {

	public static void main(String[] args) {
		int k=20;
		k=k-1;
		k--;
		k=k-2;//k--- this is not allowed
		System.out.println(k);
	}

}
