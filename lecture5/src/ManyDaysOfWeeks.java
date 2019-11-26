import java.util.Scanner;

public class ManyDaysOfWeeks {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number");
		int input = scanner.nextInt();

		System.out.println(input);

		if (input == 1) {
			System.out.println("Monday");
		} else if (input == 2) {
			System.out.println("Tuesday");
		} else if (input == 3) {
			System.out.println("Wednesday");

		} else {
			System.out.println("Wrong number");
		}
		scanner.close();
	}
}
