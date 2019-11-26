public class TaskStaticMethods {
	

	public static int sum(int arg1, int arg2, int arg3) {
		return arg1 + arg2 + arg3;
	}

	public static int sumArrayValues(int[] myArray) {
		int sum = 0;
		for (int item : myArray) {
			sum += item;
		}
		return sum;
	}

	public static void printOut(int[] myArray) {
		for (int item : myArray) {
			System.out.print(item + " ");
		}
		
	}

	public static void main(String[] args) {

		int sum = sum(1, 2, 3);
		System.out.println(sum);

		int[] data = new int[]{4,5,6};

		System.out.println(sumArrayValues(data));
		printOut(data);
		
//		System.out.println(sumArrayValues(args));
//		printOut(args);
	}
}
