package com.lti;

public class Calc {
	public static int add(int num1, int num2) {
		return num1+num2;
	}
	public static int subs(int num1, int num2) {
		return num1-num2;
	}
	public static int prod(int num1, int num2) {
		return num1*num2;
	}
	public static int div(int num1, int num2) {
		return num1/num2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Add is: "+add(10,20));
		System.out.println("Substract is: "+subs(40,20));
		System.out.println("prod is: "+prod(40,20));
		System.out.println("Quotient is: "+div(40,20));
	}

}
