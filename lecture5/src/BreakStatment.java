public class BreakStatment {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				System.out.println("Reached break statment on iteration =" + i);
				break;
			}
			System.out.println("Iteration " + i);
		}
		System.out.println("Main app continue work");

	}

}
