import java.util.Arrays;

public class TwoDimTaskExample {

	public static void main(String[] args) {
		String[][] content = new String[4][4];

		for (int rowIndex = 0; rowIndex < content.length; rowIndex++) {
			System.out.println(Arrays.toString(content[rowIndex]));

			for (int colIndex = 0; colIndex < content[rowIndex].length; colIndex++) {
				content[rowIndex][colIndex] = "hi ";
			}
		}
		for (String[] arrayRow : content) {
			System.out.println(Arrays.toString(arrayRow));
		}

	}

}
