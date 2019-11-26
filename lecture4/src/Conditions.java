
public class Conditions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		boolean isWithinTown = true;
		boolean isHighway = true;		
		int maxSpeed;
		
		if (isWithinTown) {
			maxSpeed = 50;
		}else if(isHighway){
			maxSpeed = 110;
		}else{
			maxSpeed = 90;
		}
		System.out.println ("Max speed="+ maxSpeed);
		}
	}

