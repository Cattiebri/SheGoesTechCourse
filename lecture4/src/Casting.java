
public class Casting {
	
	public static void main(String[] args) {
		/*byte smallValue = 6;
		int biggerDataType;
		biggerDataType = smallValue;
		System.out.println(biggerDataType);*/		
		
		long bigAmount = 9999999999L;
		
		byte smallVariableDataType = (byte)bigAmount;
		System.out.println(smallVariableDataType);	
		
	}
}
