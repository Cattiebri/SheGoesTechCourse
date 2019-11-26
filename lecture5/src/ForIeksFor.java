import java.util.Scanner;

public class ForIeksFor {

	public static void main(String[] args) {
		for (int i = 1; i <= 6; i++) { // Do 6 times
			System.out.println();
			for (int x = 1; x <= i; x++) { // Do i times
				System.out.print(i);
			}
		}
		for (int i = 1; i <= 6; i++) { // Do 6 times
			System.out.println();
			for (int x = 1; x <= i; x++) { // Do i times
				System.out.print(x);
			}
		}
		System.out.println();
		Scanner crab = new Scanner(System.in);
		System.out.println("What is your number");
		int number = crab.nextInt();
		int u = 1;
		for (int i = 1; i <= number; i++) { // Do 6 times
			System.out.println();
			for (int p = 1; p <= i; p++) {
				System.out.print(u++);
			}
		}
		crab.close();
	}
}
