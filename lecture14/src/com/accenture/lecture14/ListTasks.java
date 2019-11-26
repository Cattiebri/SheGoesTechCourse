package com.accenture.lecture14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListTasks {

	public static void main(String[] args) {
		List<String> listArr = new ArrayList<>();

		listArr.add("3");
		listArr.add("6");
		listArr.add("8");
		listArr.add("4");
		listArr.add("1");

		System.out.println("The size of the List is: " + listArr.size());

//		 listArr.forEach(item -> { System.out.println(item);});

		Iterator<String> iterator = listArr.iterator();
		while (iterator.hasNext()) {
			String lisToString = iterator.next();
			System.out.println("List element to cons: " + lisToString);
		}

		System.out.println("/////////////");

		List<Integer> listArrInt = new ArrayList<>();
		listArrInt.add(34);
		listArrInt.add(27);
		listArrInt.add(11);
		listArrInt.add(82);
		
		Collections.sort(listArrInt);

		Iterator<Integer> iteratorName = listArrInt.iterator();
		while (iteratorName.hasNext()) {
			Integer lisToString = iteratorName.next();
			System.out.println("List element to cons: " + lisToString);
		}

		Collections.sort(listArrInt);

		while (iteratorName.hasNext()) {
			Integer lisToString = iteratorName.next();
			System.out.println("List element to cons: " + lisToString);
		}
	}

}
