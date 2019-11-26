package com.accenture.lecture14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Starter {

	public static void main(String[] args) {
		int[] array = new int[3];

		System.out.println("Array length: " + array.length);

		array[0] = 2;
		// array[4] = 30;

		System.out.println(Arrays.toString(array));

		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Volvo");
		arrayList.add("Skoda");
		arrayList.add("Tesla");
		arrayList.add("Volkswagen");
		arrayList.add("BMW");
		arrayList.add("Nissan");
		
		System.out.println("Search Volvo: " + arrayList.contains("Volvo"));

		System.out.println(arrayList.toString());
		System.out.println("ArrayList size: " + arrayList.size());

		arrayList.remove(1);

		System.out.println(arrayList.toString());
		System.out.println("ArrayList size: " + arrayList.size());

		String element4 = arrayList.get(4);
		System.out.println("ELement 4 is : " + element4);

		arrayList.set(3, "New BMW");
		System.out.println("ArrayList size: " + arrayList.size());
		System.out.println(arrayList.toString());

		User user = new User("Janis", 399833);

		System.out.println(user.getName());

		ArrayList<User> userArrayList = new ArrayList<>();
		userArrayList.add(new User("Anna", 43455));
		userArrayList.add(user);
		userArrayList.add(new User("Denis", 2222));

		System.out.println(userArrayList.size());
		loopArraysUserToString(userArrayList);
		
		

		
	}

	public static void loopArraysUserToString(ArrayList<User> arrays) {
		for (User arr : arrays) {
			System.out.println("This is the name " + arr.getName()
					+ " and this is the bank account: " + arr.getBankAcc());
		}
		for (User arr : arrays) {
			System.out.println(arr);
		}
	}

}