import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] days = { "Monday", "Tuesday", "Wednesday", "Thursday",
				"Friday", "Saturday", "Sunday" };
		boolean test = false;
		do {
			System.out.print("Please enter index for the day you need: ");
			int dayIndex = scanner.nextInt();

			if (dayIndex > 0 && dayIndex < 8) {

				System.out.println("The day you are looking for is: "
						+ days[dayIndex-1]);
				test = true;
				break;
			} else {
				System.out
						.println("The index you entered does not refer to any day. Please, try again!");
			}
		} while (test == false);

		scanner.close();
	}

}
