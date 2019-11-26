import java.util.Arrays;

public class TwoDimTask1 {

	public static void main(String[] args) {
		int[][] twoDim = new int[4][4];
		int u = 0;
		for (int rowIndex = 0; rowIndex < twoDim.length; rowIndex++) {
			System.out.println(Arrays.toString(twoDim[rowIndex]));
			for (int colIndex = 0; colIndex < twoDim[rowIndex].length; colIndex++) {
				twoDim[rowIndex][colIndex] = u++;
			}
		}
		System.out.println("---------");
		for (int[] arrayRow : twoDim) {
			System.out.println(Arrays.toString(arrayRow));
		}
	}

}
