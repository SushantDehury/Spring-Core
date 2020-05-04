package com.nt.service;

public class ArithmeticOpreation {
	
	public int add(int a, int b) {
		System.out.println("Calculator.add()");
		return a + b;
	}

	public int sub(int a, int b) {
		System.out.println("Calculator.sub()");
		return a - b;
	}

	public int mul(int a, int b) {
		System.out.println("Calculator.mul()");
		return a * b;
	}

	public int dev(int a, int b) {
		System.out.println("Calculator.dev()");
		return a / b;
	}
}
