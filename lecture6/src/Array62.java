import java.util.Arrays;

public class Array62 {

	public static void main(String[] args) {
		// Write a Java program to reverse an array of integer values. int[]
		// myArray = { 11, 22, 33, 44, 55, 66, 77, 88, 99};
		// -99,88,...,11
		// Take a look into Arrays.toString(array)

		int[] myArray = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
		String arrayContent = Arrays.toString(myArray);
		System.out.println(arrayContent);

		for (int i = 0; i < myArray.length / 2; i++) {
			int fromBeginning = myArray[i];
			int fromEnd = myArray[myArray.length - i -1];
			myArray[myArray.length - i - 1] = fromBeginning;
			myArray[i] = fromEnd;
		}

		String reversedArrayContent = Arrays.toString(myArray);
		System.out.println(reversedArrayContent);

	}
}

// System.out.print("This is the original array: ");
// for (int elem : myArray) {
// System.out.print(elem + " ");
// }
//
// System.out.println();
// int temp = 0;
// for (int i = 0; i <= myArray.length / 2; i++) {
// temp = myArray[i];
// myArray[i] = myArray[myArray.length - i - 1];
// myArray[myArray.length - i - 1] = temp;
// }
// System.out.print("This is the reversed array: ");
// for (int elem : myArray) {
// System.out.print(elem + " ");
// }
// System.out.println();
// }
//
// }
