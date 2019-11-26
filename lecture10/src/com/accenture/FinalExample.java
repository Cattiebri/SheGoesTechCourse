package com.accenture;

class User {
	private final String name;
	private static int totalUserAmount;

	public User(String name) {
		this.name = name;
		totalUserAmount++;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return "User [name=" + this.name + "] totalUsers=" + totalUserAmount;
	}
}

public class FinalExample {
	private static final double SPEED_IN_TOWN = 3.14;
	private static final double PI = 3.14;
	private static double someVariable = 3.14;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(PI); // changeing value of final variable is
								// prohibited
		// PI = 6.22;
		someVariable = 6.28;
		new User("Vasilij");
		new User("Vasilij");
		new User("Vasilij");
		User vasilij = new User("Vasilij");
		System.out.println(vasilij.toString());
		System.out.println("" + SPEED_IN_TOWN + " " + PI + " " + someVariable);
	}
}
