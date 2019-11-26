import java.util.Scanner;

class User {
	//fields
	String name;
	int age;
	boolean man;
	boolean married;
	
	void sayHi(){
		System.out.println("Hi, my name is " + name + " I am " + age + " old.");
		if (man == true){
			System.out.print("I am a man and");
		} else {
			System.out.print("I am a woman and");
		}
		if (married == true){
			System.out.print(" I am married.");
		} else {
			System.out.print(" I am not married.");
		}
		System.out.println();
		System.out.println();
	}
}

public class ClAndObjects {

	public static void main(String[] args) {
		User peter = new User();
		peter.name = "Peter";
		peter.age = 21;
		peter.man = true;
		peter.married = false;
		peter.sayHi();
		
		User anna = new User();
		anna.name = "Anna";
		anna.age = 20;
		anna.man = false;
		anna.married = true;
		anna.sayHi();
		
		User anyone = new User();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name: ");
		anyone.name = scanner.nextLine();
		System.out.println("Enter your age: ");
		anyone.age = scanner.nextInt();
		System.out.println("You are male (true / false)");
		anyone.man = scanner.nextBoolean();
		System.out.println("You are married (true / false)");
		anyone.married = scanner.nextBoolean();
		
		scanner.close();
		
		anyone.sayHi();
		
	}
}

