import java.util.Scanner;


class MyCreation {
	String building;
	int floor;
	String color;
	int cost;
	
	void colorBuilding(){
		System.out.println("The project will build " + color + building);
	}
	void fullInfo(){
		System.out.println("In order to build " + color + building + floor + "floors high" + " you need " + cost + " euro.");
	}
}

public class MyTask {

	public static void main(String[] args) {
		MyCreation any = new MyCreation();
		Scanner scanner = new Scanner(System.in);
		System.out.println("What kind of building do you want to build?");
		any.building = scanner.nextLine();
		System.out.println("How many floors you wish to build for it?");
		any.floor = scanner.nextInt();
		System.out.println("What color do you want it to be?");
		any.color = scanner.nextLine();
		System.out.println("How much money can you spend on the project?");
		any.cost = scanner.nextInt();
		
		scanner.close();
		any.colorBuilding();
		any.fullInfo();

	}

}
