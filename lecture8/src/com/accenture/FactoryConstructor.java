package com.accenture;

class Factory2 {
	private String name;
	private String location;
	private int workerAmount;

	private boolean isBankrupt = false;

	public Factory2 (String name, String location, int workerAmount){
		this.name = name;
		this.location = location;
		this.workerAmount = workerAmount;
	}
	
	public String getName() {
		return this.name;
	}

	public void changeName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getWorkerAmount() {
		return this.workerAmount;
	}

	public boolean isBankrupt() {
		return this.isBankrupt;
	}

	void hireNewWorker(String employeePosition) {
		if (!this.isBankrupt) {
			this.workerAmount++;
			System.out.println("Hired new employee: " + employeePosition
					+ ", now there are " + this.workerAmount + " workers.");
		} else {
			System.out.println(this.name
					+ " factory  is bankrupt. You cannot hire new workers");
		}
	}

	void fireWorker() {
		if (this.workerAmount > 0) {
			this.workerAmount--;
			System.out.println("There are now " + this.workerAmount
					+ " workers working there.");
		} else {
			System.out.println("There are no workers at the " + this.name
					+ " at this time. There is no one to fire.");
		}
	}

	void fireAll() {
		this.workerAmount = 0;
		System.out.println("There are no workers working there.");
	}

	void bankrupt() {
		this.fireAll();
		System.out.println(this.name + " is bankrupt.");
		this.isBankrupt = true;
	}

	void printStatus() {
		System.out.println("The name of the factory is " + this.name
				+ " located in " + this.location + " and has "
				+ this.workerAmount + " workers");
	}
}

public class FactoryConstructor {
	public static void main(String[] args) {
		Factory2 factory = new Factory2("Grow","Sigulda", 2);
		factory.printStatus();
		factory.hireNewWorker("Director");
		factory.printStatus();
		factory.hireNewWorker("Manager");
		factory.printStatus();
		factory.fireWorker();
		factory.printStatus();
		factory.fireAll();
		factory.printStatus();
		factory.hireNewWorker("Assistant");
		factory.hireNewWorker("Truck driver");
		factory.printStatus();
		factory.bankrupt();
		factory.hireNewWorker("PLumber");
		factory.fireWorker();
	}
}