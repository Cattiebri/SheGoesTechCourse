package com.accenture.lecture17;

public class Circle {
	protected double radius;
	protected String color;

	public Circle() {
		this(1.0);
	}

	public Circle(double radius) {
		this(radius, "red");
	}

	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}

	public double getArea() {
		return Math.PI * (this.radius * this.radius);
	}

}
