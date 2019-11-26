import java.util.Scanner;

public class Array5 {

	public static void main(String[] args) {
		// Write a program to evaluate if an array contains a value entered by
		// user. Test data int[] myArray =
		// { 11, 22, 33, 44, 55, 66, 77, 88, 99}; User input 22. Output: number
		// 22 is inside of an array.

		int[] myArray = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
		Scanner scanner = new Scanner(System.in);
		boolean found = false;
		int number = 0;
		
		do {
			System.out.println("Please enter a test number: ");
			number = scanner.nextInt();
			for (int i = 0; i < myArray.length; i++) {
				if (number == myArray[i]) {
					found = true;
					break;
				} 
			}
			if (found == false) {
				System.out
						.println("The entered number is not inside the array. Try again!");
			}

		} while (found == false);

		System.out.println("The number " + number + " is inside the array");
		scanner.close();
	}
}
