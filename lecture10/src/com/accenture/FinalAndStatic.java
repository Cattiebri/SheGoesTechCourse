package com.accenture;

class DrivingRule1 {
	private final String name;
	private String description;
	static String country = "Latvia";
	static int amountOfRules;

	public DrivingRule1(String name, String description) {
		this.name = name;
		this.description = description;
		amountOfRules++;
		System.out.println("Region: " + country + ". The rule: " + this.name
				+ ". It states: " + this.description);
	}

	public String getName() {
		return name;
	}

	void printAmount() {
		System.out.println("Currently there are " + amountOfRules
				+ " rules in action in " + country);
	}
}

public class FinalAndStatic {

	private static final int MAX_SPEED_CITY = 50;
	private static final int MAX_SPEED_COUNTRY = 90;

	public static void main(String[] args) {
		DrivingRule1 rule1 = new DrivingRule1("Speed",
				"Do not drive faster than allowed!");
		DrivingRule1 rule2 = new DrivingRule1("Attention",
				"Do not look away from road!");
		DrivingRule1 rule3 = new DrivingRule1("No food",
				"Do not eat while driving!");
		DrivingRule1 rule4 = new DrivingRule1("Lights",
				"Keep the lights on at all times!");
		DrivingRule1 rule5 = new DrivingRule1("Speed in city",
				"The speed limit in the city is: " + MAX_SPEED_CITY + ".");
		DrivingRule1 rule6 = new DrivingRule1("Speed outside city",
				"The speed limit outside the city is: " + MAX_SPEED_COUNTRY
						+ ".");
		System.out.println("Currently there are " + DrivingRule1.amountOfRules
				+ " rules in action in " + DrivingRule1.country);
	}
}
