package com.accenture.lecture17;

public class FigureApp {

	public static void main(String[] args) {
		Circle circle = new Circle();
		Circle circle1 = new Circle(3,"blue");

		System.out.println(circle);
		System.out.println(circle1);
		
		Cylinder cylinder = new Cylinder();
		Cylinder cylinder2 = new Cylinder();
		
		System.out.println(cylinder);
		System.out.println(cylinder2);
		
		System.out.println(cylinder.getRadius());
		System.out.println(cylinder.getArea());
	}

}
