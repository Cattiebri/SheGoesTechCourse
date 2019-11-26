import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int value = scanner.nextInt();
		while (value != 5) {
			System.out.println("Enter a number:  ");
			value = scanner.nextInt();
		}
		scanner.close();
	}
}
