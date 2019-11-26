public class Homework1 {

	public static void main(String[] args) {
		int[][] dataSet = { 
				{ 1, -5, 98, 20 },
				{ 3, -68, 2 },
				{ 7, 29, 0, -1, -68 } };
		int sum = 0;

		for (int i = 0; i < dataSet.length; i++) {
			int[] row = dataSet[i];
			for (int j = 0; j < row.length; j++) {
				int cellValue = row[j];
				sum = sum + cellValue;
			}
		}
		System.out.println("The final sum is: " + sum);

	}

}
