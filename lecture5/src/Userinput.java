import java.util.Scanner;

public class Userinput {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("What is your age?");

		int age = scanner.nextInt();
		System.out.println("User age is:" + age);
		scanner.close();
	}

}
