package com.accenture.lecture15;

public class ArrayRewritingApp {

	public static void main(String[] args) {
		MyArray array = new MyArray(new int[] { 3, 4, 12 });

		array.printArray();
		array.getSum();
		array.getAverage();
		array.getMaxValue();
		array.getAvaregeDouble();
		array.printResults();
	}

}
