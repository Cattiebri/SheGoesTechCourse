package com.accenture.lecture15;

import java.util.Arrays;

public class MyArray {
	private int[] myArray;

	public MyArray(int[] someArray) {
		this.myArray = someArray;
	}

	public void printArray() {
		int index = 0;
		for (int value : myArray) {
			System.out.println(index + " element is " + value);
			index++;
		}
	}

	public int getSum() {
		int sum = 0;
		for (int i = 0; i < myArray.length; i++) {
			sum += myArray[i];
		}
		return sum;
	}

	public int getAverage() {
		int sum = getSum() / myArray.length;
		return sum;
	}

	public int getMaxValue() {
		int myMaxValue = myArray[0];
		for (int i = 0; i < myArray.length; i++) {
			if (myMaxValue < myArray[i]) {
				myMaxValue = myArray[i];
			}
		}
		return myMaxValue;
	}

	public double getAvaregeDouble() {
		double doubleSum = (double) getSum();
		return doubleSum / myArray.length;
	}

	public void printResults() {
		System.out.println("The sum is: " + getSum()
				+ ", the average is: " + getAverage()
				+ ", the max value is: " + getMaxValue()
				+ " and the average Double is: " + getAvaregeDouble());
	}

}