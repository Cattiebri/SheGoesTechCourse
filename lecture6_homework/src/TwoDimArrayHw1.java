import java.util.Arrays;


public class TwoDimArrayHw1 {

	public static void main(String[] args) {
		int[][] dataSet = new int[4][4];
		
		int ordinal = 0;
		
		for (int i = 0; i < dataSet.length; i++) {
			int[] row = dataSet[i];
			for (int j = 0; j < row.length; j++) {
				row[j] = ordinal;
				ordinal++;
			}
		}
		for (int[] row : dataSet) {
			System.out.println(Arrays.toString(row));
		}
	}

}
