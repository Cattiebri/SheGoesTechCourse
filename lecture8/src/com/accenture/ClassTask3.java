package com.accenture;

class NewCar {
	private String brand;
	private int maxSpeed;
	private String color;

	void setBrand(String brand) {
		this.brand = brand;
	}

	String getBrand() {
		return this.brand;
	}

	void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	int getMaxSpeed() {
		return this.maxSpeed;
	}

	void setColor(String color) {
		this.color = color;
	}

	String getColor() {
		return this.color;
	}
}

public class ClassTask3 {

	public static void main(String[] args) {
		NewCar newCar = new NewCar();
		newCar.setBrand("Skoda");
		newCar.setColor("Dark blue");
		newCar.setMaxSpeed(110);
		System.out.println("The parameters for the car: Brand: "
				+ newCar.getBrand() + " Color: " + newCar.getColor()
				+ " Max Speed: " + newCar.getMaxSpeed());
	}

}
