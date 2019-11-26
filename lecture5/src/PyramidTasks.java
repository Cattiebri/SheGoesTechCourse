import java.util.Scanner;

public class PyramidTasks {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the pyramid");
		int size = scanner.nextInt();
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

		for (int i = 1; i <= size; i++) {
			String row = "";
			for (int j = 1; j <= i; j++) {
				row = row + "" + i;
				// System.out.print(i);
			}
			System.out.println(row);
		}

		scanner.close();

	}

}
