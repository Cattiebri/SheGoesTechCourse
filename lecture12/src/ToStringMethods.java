class Student {
	String name;
	static String school = "BankuAugstskola";

	public void getUserInfo() {
		System.out.println("Name: " + name);
	}

	public void whatIsYourSchool() {
		System.out.println("I`m not a student yet.");
	}

	public static int sum (int arg1, int arg2) {
		return arg1 + arg2;
	}
}

public class ToStringMethods {

	public static void main(String[] args) {
		
		for(String arg : args){
			System.out.println(arg);
		}
		
		Student student = new Student();

//		System.out.println(Student.name);
		System.out.println(Student.school);
		System.out.println(Student.sum(4, 6));
		student.getUserInfo();
	}

}
