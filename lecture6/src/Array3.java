public class Array3 {

	public static void main(String[] args) {
		int[] numbers = new int[10];
//		NEPAREIZI
//		for (int i = numbers.length - 1; i >= 0; i--) {
//			numbers[i] = i;
//			System.out.println(numbers[i]);
//		}
//
//		for (int i = 0; i <= 9; i++) {
//			System.out.println(numbers[i]);
//		}
		 for(int i=0; i<=9; i++){
		 numbers[i] = 9 - i;
		 System.out.println(numbers[i]);
		 }
	}

}
