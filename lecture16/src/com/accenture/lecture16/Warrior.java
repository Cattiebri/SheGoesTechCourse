package com.accenture.lecture16;

public class Warrior {

	private String name;
	private int health;
	private int damagePower;

	public Warrior(String name, int initialHealth, int damagePower) {
		this.name = name;
		if (initialHealth > 100) {
			initialHealth = 100;
		} else if (initialHealth < 1) {
			initialHealth = 1;
		}
		this.health = initialHealth;
		if (damagePower > 100) {
			damagePower = 100;
		} else if (damagePower < 1) {
			damagePower = 1;
		}
		this.damagePower = damagePower;
	}

	public String getName() {
		return name;
	}

	public int getHealth() {
		return health;
	}

	public int getDamagePower() {
		return damagePower;
	}

	private boolean isAlive() {
		if (this.health > 0) {
			return true;
		} else {
			return false;
		}
	}

	public void receivedDamage(int damage) {
		if (isAlive() && damage > 0) {
			if (this.health - damage > 0) {
				this.health -= damage;
				isAlive();
			} else {
				this.health = 0;
				isAlive();
			}
		} else {
			System.out.println("The planned damage is not valid.");
		}
	}

	public void restoreHealth(int health) {
		if (isAlive() && health > 0) {
			if ((this.health += health) < 100) {
				this.health += health;
			} else {
				this.health = 100;
				System.out.print("The maximum health of " + this.name
						+ " is now set to maximum value: 100");
			}
			isAlive();
		} else {
			System.out.println("The planned action is not valid.");
		}
	}

	public void fight(Warrior anotherWarrior) {
		System.out.println("This is fight is between " + this.name + " and " + anotherWarrior.getName() + ".");
		System.out.println(this);
		System.out.println(anotherWarrior);
		while (this.isAlive() && anotherWarrior.isAlive()) {
			System.out.println(this.name + " attacked "
					+ anotherWarrior.getName());
			anotherWarrior.receivedDamage(this.damagePower);
			System.out.println(anotherWarrior);
			if (this.isAlive() && anotherWarrior.isAlive()) {
				System.out.println(anotherWarrior.getName() + " attacked "
						+ this.name);
				receivedDamage(anotherWarrior.getDamagePower());
				System.out.println(toString());
			}
		}
		if (!isAlive()) {
			System.out.println("Fight is finished! " + anotherWarrior.getName()
					+ " is victorious and has " + anotherWarrior.getHealth() + " HP left.");
		} else {
			System.out.println("Fight is finished! " + this.name
					+ " is victorious and has " + this.health + " HP left.");
		}
	}

	public String toString() {
		if (isAlive()) {
			return "Warrior: " + this.name + ", health: " + this.health
					+ " damage: " + this.damagePower;
		} else {
			return "Warrior: " + this.name + " is dead";
		}
	}
}
