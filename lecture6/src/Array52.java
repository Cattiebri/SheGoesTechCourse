import java.util.Scanner;

public class Array52 {

	public static void main(String[] args) {
		// Write a program to evaluate if an array contains a value entered by
		// user. Test data int[] myArray =
		// { 11, 22, 33, 44, 55, 66, 77, 88, 99}; User input 22. Output: number
		// 22 is inside of an array.

		int[] myArray = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a test number: ");
		int number = scanner.nextInt();
		boolean found = false;

		for (int value : myArray) {
			if (value == number) {
				found = true;
				break;
			}
		}

		if (found) {
			System.out.println(" Searched value " + number + " is found");
		} else {
			System.out.println(" Searched value " + number + " not found");
		}

		scanner.close();
	}
}
