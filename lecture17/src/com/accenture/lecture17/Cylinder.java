package com.accenture.lecture17;

public class Cylinder extends Circle {

	private double height = 1.0;

	public Cylinder() {

	}

	public Cylinder(double height) {
		super();
	}

	public Cylinder(double height, double radius) {
		super();

	}

	public Cylinder(double height, double radius, String color) {
		super(radius, color);
		this.height = height;
		
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String toString() {
		return "Cylinder [height=" + height + ", radius=" + radius + ", color="
				+ color + "]";
	}

	public double getVolume() {

		return super.radius * this.height;
	}
}
