package com.accenture;

class Practice {
	int sumOfArray(int[] array) {
		int sum = 0;
		/*
		 * for(int value : sumOfArray){
		 * sum = sum + value;
		 * } 
		*/
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		return sum;
	}
}

public class ClassTask2 {

	public static void main(String[] args) {
		int[] testArray = { 3, 2, 3, 4, 6, 7, 4, 3 };
		Practice test = new Practice();
		System.out.println("The sum of the array is: "
				+ test.sumOfArray(testArray));
	}
}
