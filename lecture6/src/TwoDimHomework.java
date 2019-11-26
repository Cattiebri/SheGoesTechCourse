import java.util.Arrays;

public class TwoDimHomework {

	public static void main(String[] args) {
		int[][] dataSet = { 
				{1,-5,98,20}, 
				{3,-68,2},
				{7,29,0,-1,-68} };

		for (int[] arrayRow : dataSet) {
			System.out.println(Arrays.toString(arrayRow));
		}

		System.out.println();

		int sum = 0;
		for (int i = 0; i < dataSet.length; i++) {
			for (int j = 0; j < dataSet[i].length; j++) {
				sum = sum + dataSet[i][j];
			}
		}
		System.out.println("The final sum is: " + sum);

		int smallest = dataSet[0][0];
		int smallestElRow = 0;
		int smallestElCol = 0;

		for (int i = 0; i < dataSet.length; i++) {
			for (int j = 0; j < dataSet[i].length; j++) {
				if (dataSet[i][j] < smallest) {
					smallest = dataSet[i][j];
					smallestElRow = i;
					smallestElCol = j;
				}
			}
		}
		System.out.println("The smallest element is: " + smallest);
		System.out.println("The coordinates of the smallest element: row= " + smallestElRow + " and column= " + smallestElCol);
	}

}
