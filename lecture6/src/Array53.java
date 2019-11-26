import java.util.Scanner;

public class Array53 {

	public static void main(String[] args) {
		int[] myArray = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
		Scanner scanner = new Scanner(System.in);
		int foundElementIndex = -1;
		do {
			System.out.println("Enter searched value:");
			int searchedValue = scanner.nextInt();
			for (int i = 0; i < myArray.length; i++) {
				if (myArray[i] == searchedValue) {
					foundElementIndex = i;
					break;
				}
			}
			if (foundElementIndex >= 0) {
				System.out.println("Searched value " + searchedValue
						+ " is found on index " + foundElementIndex);
			} else {
				System.out.println("Searched value " + searchedValue
						+ " not found");
			}
		} while (foundElementIndex < 0);
		scanner.close();

	}

}
