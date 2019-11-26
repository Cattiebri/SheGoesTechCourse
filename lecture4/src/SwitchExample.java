
public class SwitchExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int expression = 2;
		int result = 0;
		switch (expression) {
		case 1:
			result++;
			break;
		case 2:
			result++;
			break;
		case 3:
			result++;
			break;
		default:
			result++;
		}		if(expression == 1){
			result++;
		}else if(expression == 2){
			result++;
		}else if(expression == 3){
			result++;
		}else{
			result++;
		}
		System.out.println(result);
	}
}
