package com.accenture.HPApp;

import java.util.Random;

public class Muggles {
	private String name;
	private String location;
	public boolean isWizard;
	private int attitudeTrait;
	private int happinessLevel;

	public Muggles(String name, String location, boolean isWizard) {
		this.name = name;
		this.location = location;
		this.isWizard = isWizard;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public String goTo(Muggles muggle) {
		if (!(this.location == muggle.location)) {
			this.location = muggle.location;
		} else {
			System.out.println(this.name + "and" + muggle.name
					+ "are already on the same place.");
		}
		return this.location;
	}

	public String summon(Muggles muggle) {
		muggle.goTo(this);
		return muggle.location;
	}

	private int makeDamage(Muggles muggle) {

		return 1;
	}

	public int restoreHealth(int health) {
		return 15;
	}

	public int getAttitudeTrait() {
		return attitudeTrait;
	}

	private void setAttitudeTrait(int attitudeTrait) {
		this.attitudeTrait = attitudeTrait;
	}

	public int getHappinessLevel() {
		return happinessLevel;
	}

	private void setHappinessLevel(int happinessLevel) {
		this.happinessLevel = happinessLevel;
	}

	public String sortRandomTower() {
		String tower = "";
		Random r = new Random();
		int test = r.nextInt((4 - 1) + 1) + 1;
		switch (test) {
		case 1:
			tower = "Gryffindor";
			break;
		case 2:
			tower = "Ravenclaw";
			break;
		case 3:
			tower = "Hufflepuff";
			break;
		case 4:
			tower = "Slytherin";
			break;
		default:
			tower = "No such tower available";
		}
		return tower;
	}

	// public String changeTower(int towerNr){
	//
	// return tower;
	// }

	public void fight(Muggles muggle) {

	}

	public void doGoodTo(Muggles muggle2) {
		muggle2.setHappinessLevel(muggle2.happinessLevel + 1);
		this.attitudeTrait++;
	}

	public void doBadTo(Muggles muggle2) {
		muggle2.setHappinessLevel(happinessLevel - 1);
		this.attitudeTrait--;
	}

	private String infoHappinessLevel() {
		String happinessInfo = (happinessLevel > 5) ? "" + this.name
				+ " is very happy"
				: (happinessLevel <= 5 && happinessLevel > 0) ? "" + this.name
						+ " is OK" : "" + this.name + " is feeling bad";
		return happinessInfo;
	}

	private String infoAttitudeTrait() {
		String attitudeInfo = (this.attitudeTrait > 5) ? "" + this.name
				+ " is a hero"
				: (this.attitudeTrait <= 5 && this.attitudeTrait > 0) ? ""
						+ this.name + " is a normal person" : "" + this.name
						+ " is a villain";
		return attitudeInfo;
	}

	public String inviteTo(Muggles muggle, String location) {
		return "school";

	}

	public String infoIsWizard() {
		String answer = isWizard ? " is a wizard " : " is a muggle ";
		return answer;
	}

	public String info() {
		return this.name + infoIsWizard() + " and is at " + this.location + "."
				+ infoAttitudeTrait() + " " + infoHappinessLevel();
	}
}
