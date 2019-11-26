import java.util.Arrays;
import java.util.Scanner;


public class TwoDimTask2 {

	public static void main(String[] args) {
		int[][] myArray = new int[5][4];
		Scanner scanner = new Scanner(System.in);
		int userRow = 0;
		int userColumn = 0;
		do{
		System.out.println("Enter number for row (max 5): ");
		userRow = scanner.nextInt()-1;
		} while (userRow<0 || userRow>4);
		
		do{
		System.out.println("Enter number for column (max 4): ");
		userColumn = scanner.nextInt()-1;
		} while (userColumn<0 || userColumn>3);

		System.out.println("Enter number for value (any): ");
		int userValue = scanner.nextInt();
		
		myArray[userRow][userColumn] = userValue;
		
		System.out.println("---------");
		for (int[] arrayRow : myArray) {
			System.out.println(Arrays.toString(arrayRow));
		}
		
		scanner.close();

	}

}
