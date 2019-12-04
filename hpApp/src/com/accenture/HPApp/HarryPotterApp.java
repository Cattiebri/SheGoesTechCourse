package com.accenture.HPApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class HarryPotterApp {
	static List<Object> allCharacters = new ArrayList<Object>();
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Wizards harry = new Wizards("Harry Potter", "school", 34, 15, true);
		Wizards drako = new Wizards("Drako Malfoy", "diagonally", 77, 12, true);
		Muggles janka = new Muggles("Janka", "Plavnieki", 77, 19, false);

		allCharacters.add(harry);
		allCharacters.add(drako);
		allCharacters.add(janka);

		Menu();

		// janka.fight(drako);
		// harry.fight(janka);
		// drako.fight(harry);
		//
		// harry.info();
		// drako.info();
		// janka.info();
		//
		// harry.goTo(drako);
		// harry.goTo(drako);
		// drako.summon(janka);
		//
		// harry.info();
		// drako.info();
		// janka.info();

	}

	public static void Menu() {
		printListNames();
		characterSelection(chooseCharacter());
		seeOptions();
		chooseAction();
//		doMethod();
	}

	public static void printListNames() {
		System.out.println("Please choose a character: ");
		for (int i = 0; i < allCharacters.size(); i++) {
			Muggles muggle = (Muggles) allCharacters.get(i);
			System.out.println("Press " + (i + 1) + " for " + muggle.getName());
		}
	}

	public static int chooseCharacter() {
		int characterChoiceIndex = 0;
		do {
			System.out.println("Please enter a number from 1 to "
					+ allCharacters.size());
			while (!scanner.hasNextInt()) {
				System.out.println("This is not a number!");
				scanner.next();
			}
			characterChoiceIndex = scanner.nextInt();
		} while (characterChoiceIndex < 1 || characterChoiceIndex > allCharacters.size());

		Muggles printName = (Muggles) allCharacters.get(characterChoiceIndex - 1);
		System.out.println("You chose " + printName.getName());
		return characterChoiceIndex - 1;
	}

	public static void characterSelection(int charIndex) {
		if (allCharacters.get(charIndex) instanceof Wizards) {
			Wizards character = (Wizards) allCharacters.get(charIndex);
			processWizard(character);
		} else {
			Muggles character = (Muggles) allCharacters.get(charIndex);
			processMuggle(character);
		}
	}

	public static void processWizard(Wizards wizard) {
		
	}

	public static void processMuggle(Muggles muggle) {
	}

	public static String[] optionList() {
		String[] options = new String[] { "Rename character",
				"Move character to a different location",
				"Summon another character to this characters location",
				"Invite another character to go to a new location together",
				"See where the character spent the schooltime at",
				"Fight another character", "See full info of the character" };
		return options;
	}

	public static void seeOptions() {
		System.out.println("What would you like to do?");
		String[] options = optionList();
		for (int i = 0; i < options.length; i++) {
			System.out.println("Press " + (i + 1) + " for " + options[i]);
		}
	}

	public static int chooseAction() {
		int chosenOption = 0;
		String[] options = optionList();
		int length = options.length;
		do {
			System.out.println("Please enter a number from 1 to " + length);
			while (!scanner.hasNextInt()) {
				System.out.println("This is not a number!");
				System.out.println(scanner.next());
			}
			chosenOption = scanner.nextInt();
		} while (chosenOption < 1 || chosenOption > length);

		for (int i = 0; i < length; i++) {
			if (chosenOption-1 == i) {
				System.out.println("You chose: " + options[i] + ".");
			}
		}
		return chosenOption;
	}
	public static void doMethod(Object character, int chosenOption){
		if (character instanceof Wizards) {
			Wizards wizard = (Wizards) character;
		switch(chosenOption){
	case 1:
		System.out.println("You have chosen to Rename a character");
		System.out.println("Enter the new name for the character: ");
		String newName = scanner.nextLine();
		((Wizards) character).rename(newName);
		break;
	case 2:
		
		break;
	case 3:
		
		break;
	case 4:
		
		break;
	default:
		
	}
	
	return ;
	}

	// public static Muggles createByUser() {
	// Scanner scanner = new Scanner(System.in);
	// System.out
	// .println("You have chosen to create a new character of Harry Potter App!");
	// System.out.println("Please, enter the name of the character: ");
	// String inputName = scanner.nextLine();
	// System.out.println("Please, enter the tower: ");
	// int inputTower = scanner.nextInt();
	// System.out.println("Enter the location " + inputName
	// + " will be created in: ");
	// String inputLocation = scanner.nextLine();
	// System.out
	// .println("Is "
	// + inputName
	// +
	// " going to be a wizard or muggle? (type 'w' for wizard and 'm' for muggle)");
	// String inputIsWizard = "";
	// while (!(inputIsWizard == "w" || inputIsWizard == "m")) {
	// if (!(inputIsWizard == "")) {
	// System.out
	// .println("Your wish is not clear! Please, tell, if "
	// + inputName
	// +
	// " is going to be a wizard or muggle? (type 'w' for wizard and 'm' for muggle)");
	// }
	// inputIsWizard = scanner.nextLine();
	// }
	// boolean isWizard = inputIsWizard == "w" ? true : false;
	// scanner.close();
	// Muggles creation = new Muggles(inputName, inputTower, inputLocation,
	// isWizard);
	// return creation;}
	}
}