package com.accenture;

class Car {
	String color;
	int speed;
	String name;
	
	void drive(){
		System.out.println("Drive, " + this.name + " !  ");
	}
}

public class Repeating {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.name = "Jadviga";
		myCar.drive();
		
		Car anotherCar = new Car();
		anotherCar.name = "Dzintra";
		anotherCar.drive();
		
	}

}
