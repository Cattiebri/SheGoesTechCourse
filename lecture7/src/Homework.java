import java.util.Scanner;

class Circle {
		double radius;
	
	double getRadius(){
		return radius;
	}
	
	double getArea(){
		return radius*radius*Math.PI;
	}
		
}
//Class should have method which will return radius of circle getRadius()
//Class should have methods which will return area of circle getArea()
public class Homework {

	public static void main(String[] args) {
		Circle circle = new Circle();
		System.out.println("Please enter the radius:");
		Scanner scanner = new Scanner(System.in);
		circle.radius = scanner.nextDouble();
		System.out.println("The radius for the circle is: " + circle.getRadius());
		System.out.println("The area for the circle is: " + circle.getArea());
		
		scanner.close();
	}

}
