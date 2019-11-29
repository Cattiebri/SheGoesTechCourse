package geometry;

public class Circle {
	private double radius;
	private String color = "red";

	public Circle() {
		this.radius = 2.0;
//		this.color = "red";
	}

	public Circle(double radius) {
		this.radius = radius;
//		this.color = "red";
	}

	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}

	public double getRadius() {
		return radius;
	}

	public String getColor() {
		return color;
	}

	public double getArea() {
		return radius * radius * Math.PI;
	}

	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";

	}
}
