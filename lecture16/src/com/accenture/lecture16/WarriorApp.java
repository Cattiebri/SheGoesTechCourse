package com.accenture.lecture16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WarriorApp {

	public static void main(String[] args) {
		Warrior ernie = new Warrior("Ernie", 64, 11);
		Warrior bobby = new Warrior("Bobby", 12, 22);
		Warrior jimmy = new Warrior("Jimmy", 32, 9);
		Warrior tommy = new Warrior("Tommy", 87, 4);
		Warrior ricky = new Warrior("Ricky", 97, 16);

		System.out.println("Test");

		List<Warrior> warriors = new ArrayList<>();
		warriors.add(bobby);
		warriors.add(ernie);
		warriors.add(jimmy);
		warriors.add(tommy);
		warriors.add(ricky);
		Scanner scanner = new Scanner(System.in);
		System.out.println("To create a warrior, enter his stats: ");
		System.out.println("Name: ");
		String name = scanner.nextLine();
		System.out.println("Health: ");
		int health = scanner.nextInt();
		System.out.println("Damage power: ");
		int damagePower = scanner.nextInt();
		Warrior created = new Warrior(name, health, damagePower);
		System.out.println("You have just created the following warrior: " + created);
		warriors.add(created);
		scanner.close();
		
		fightAll(warriors);

	}

	public static void fightAll(List<Warrior> anyList) {
		List<Warrior> losers = new ArrayList<>();
		while (anyList.size() > 1) {
			anyList.get(0).fight(anyList.get(anyList.size() - 1));
			if (anyList.get(0).isAlive()) {
				losers.add(anyList.get(anyList.size() - 1));
				anyList.remove(anyList.get(anyList.size() - 1));
			} else {
				losers.add(anyList.get(0));
				anyList.remove(anyList.get(0));
			}
		}
		System.out.println("The final victory goes to " + anyList.get(0));
		System.out.println("These are the dead warriors: ");
		for (Warrior warrior : losers) {
			System.out.println(warrior.getName());
		}
	}

}
