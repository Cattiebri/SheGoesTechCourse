package com.accenture;

public class DrivingRule {

	private final String name;
	private String description;

	private static String country = "Latvia";

	private static final int MAX_SPEED_IN_CITY = 50;
	private static final int MAX_SPEED_OUTSIDE_CITY = 90;

	static int amount;

	public DrivingRule(String name) {
		this(name, null);
	}
	public DrivingRule(String name, String description) {
		this.name = name;
		this.description = description;
		amount++;
		System.out.println("Driving rule: " + name + ", the description: " + description);
	}
	public String toString(){
		return "DrivingRule object";
	}

	public static void main(String[] args) {
		DrivingRule rule1 = new DrivingRule("Speed limit in city", "In city drivers should drive at the speed of " + MAX_SPEED_IN_CITY);
		DrivingRule rule2 = new DrivingRule("Speed limit outside city");
		DrivingRule rule3 = new DrivingRule("Speed penalties", "Penalty for breaching speed " + MAX_SPEED_IN_CITY + "km/h in city is 150 euro.");
		
		System.out.println("Total amount of driving rules: " + DrivingRule.amount);
		
		DrivingRule rule4 = new DrivingRule("Traffic lights", "desc");
		System.out.println(rule4);
		System.out.println(rule4.toString());
	}

}
