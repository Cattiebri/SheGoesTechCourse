
public class ArrayBasics {

	public static void main(String[] args) {
//		int size = 6;
//		
//		int[] values = new int[4];
//		System.out.println(values[0]);
//		
//		values[0] = 9;
//		System.out.println(values[0]);
		
		int[] values2 = {1, 2, 3, 4};
//		System.out.println(values2[0]);
//		System.out.println(values2[1]);
//		System.out.println(values2[2]);
//		System.out.println(values2[3]);
//		values2[0] = 9;
//		System.out.println(values2[0]);
		
		for(int i=0; i<values2.length; i++){
			System.out.println(values2[i]);
		}

		System.out.println("Enhanced loops-----");
		for(int elem : values2){
			System.out.println(elem);
		}
	}

}
