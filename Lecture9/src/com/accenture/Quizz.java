package com.accenture;

public class Quizz {

	public static void main(String[] args) {
		System.out.println(true && false);
		System.out.println(!true && !true || true);
		System.out.println(!(false && true));
		System.out.println(!true && (!true || true));
		System.out.println(false || true || false );
		System.out.println(true || false );
		
		String abc = "abc";
		int value = 9;
		double doubleValue = 2.0;
		char charValue = 'a';
		char charValueb = 'c';
		
		System.out.println(abc + value + doubleValue);
		System.out.println(doubleValue + abc + value);
		System.out.println(value + doubleValue + abc); 
		System.out.println(charValue + value); 
		System.out.println(charValueb + 2); 
	}

}
