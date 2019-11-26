package com.accenture.lecture14;

import java.util.ArrayList;

public class ArrayListTask {

	public static void main(String[] args) {
		ArrayList<String> myArrayList = new ArrayList<>();
		myArrayList.add("Volvo");
		myArrayList.add("Skoda");
		myArrayList.add("Tesla");
		myArrayList.add("Volkswagen");
		myArrayList.add("BMW");
		myArrayList.add("Nissan");
		loopArraysToString(myArrayList);

		myArrayList.remove(2);
		loopArraysToString(myArrayList);

		ArrayList<Double> arrayTest = new ArrayList<>();
		arrayTest.add(234.4);
		loopArraysDoubleToString(arrayTest);

	}

	public static void loopArraysToString(ArrayList<String> arrays) {

		for (int i = 0; i < arrays.size(); i++) {
			System.out.println("This is an element of my ArrayList: "
					+ arrays.get(i) + " index is : " + i);
		}
	}
	
	public static void loopArraysDoubleToString(ArrayList<Double> arrays) {

		for (int i = 0; i < arrays.size(); i++) {
			System.out.println("This is an element of Test ArrayList: "
					+ arrays.get(i) + " index is : " + i);
		}
	}

}
