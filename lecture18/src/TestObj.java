import shop.Account;
import shop.Employee;
import geometry.Circle;

public class TestObj {

	public static void main(String[] args) {
//		Circle circle = new Circle();
//		System.out.println(circle);
//
//		Circle circle1 = new Circle(3.4);
//		System.out.println(circle1);
//
//		Circle circle2 = new Circle(3.4, "blue");
//		System.out.println(circle2);
//
//		Employee john = new Employee(241, "John", "Parker", 150);
//		System.out.println(john);
//		System.out.println("The annual salary for " + john.getName() + " is "
//				+ john.getAnnualSalary());
//		System.out.println(john.getName()
//				+ " got a raise and now his salary is " + john.raiseSalary(15));

		Account ginny = new Account("av34", "Ginny", 130);
		Account ron = new Account("hp33", "Ron", 150);

		System.out.println(ron);
		System.out.println(ginny);
		ron.transferTo(ginny, 30);
		System.out.println(ron);
		
		System.out.println(ginny);
	}

}
