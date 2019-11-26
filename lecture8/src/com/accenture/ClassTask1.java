package com.accenture;

class ForMethods {

	String arguments(boolean booleanArg, double doubleArg) {
		return "" + booleanArg + " " + doubleArg;
	}
}

public class ClassTask1 {

	public static void main(String[] args) {
		ForMethods forMethods = new ForMethods();
		System.out.println(forMethods.arguments(true, 22.5));
	}

}
