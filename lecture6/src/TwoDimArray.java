import java.util.Arrays;

public class TwoDimArray {

	public static void main(String[] args) {
		int[][] grid;

		// init
		grid = new int[4][4];

		int[] row = grid[0];
		String row1content = Arrays.toString(row);
		System.out.println(row1content);

		System.out.println(grid[3][3]);

		int[] column = grid[0];
		String column1content = Arrays.toString(column);
		System.out.println(column1content);

		int[][] table = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8, 9 } };
		for (int[] arrayRow : table) {
			System.out.println(Arrays.toString(arrayRow));
		}

		System.out.println("assign value to specific cell");
		table[2][0] = 1;

		for (int[] arrayRow : table) {
			System.out.println(Arrays.toString(arrayRow));
		}
		int[] specialRow = { 1, 1, 1 };
		table[1] = specialRow;
	}

}
