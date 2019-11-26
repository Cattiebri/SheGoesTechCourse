package com.accenture;

class Employee {
	private String name;
	private String work;
	private int salary;
	private int totalMoney;

	private boolean leftJob = false;

	public Employee() {
		this.name = "New job position";
		this.work = "Free vacancy";
		this.salary = 0;
	}
	public Employee(String name) {
		this.name = name;
		this.work = "Junior Developer";
		this.salary = 200;
	}

	public Employee(String name, String work, int salary) {
		this.name = name;
		this.work = work;
		this.salary = salary;
		this.totalMoney = this.totalMoney + this.salary;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String printCurrentgetCurrentWork() {
		return this.work;
	}

	public void changeCurrentWork(String work) {
		this.work = work;
	}

	public int getSalary() {
		return this.salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	void receiveSalary() {
		if (!leftJob) {
			this.totalMoney = this.totalMoney + this.salary;
			System.out.println(this.name + " is receiving salary");
		} else {
			System.out.println(this.name
					+ " has left the job. Receiving salary is not possible.");
		}
	}

	void workForMonths(int amountOfMonths) {
		int salaryInThisPeriod = 0;
		for (int i = 1; i <= amountOfMonths; i++) {
			this.totalMoney = this.totalMoney + this.salary;
			salaryInThisPeriod = salaryInThisPeriod + this.salary;
		}
		System.out.println(this.name + " has now received salary for "
				+ amountOfMonths + " months and in this period received "
				+ salaryInThisPeriod + " euro.");
		System.out
				.println("Total money received until now: " + this.totalMoney);
	}

	public boolean leftJob() {
		this.work = this.name + " has left the job.";
		this.salary = 0;
		leftJob = true;
		return leftJob;
	}

	void getNewJob(String work, int salary) {

		this.work = work;
		this.salary = salary;
		if (!leftJob) {
			System.out.println(this.name + " is changing the work to "
					+ this.work + " and the new salary from now on is: "
					+ this.salary);
		} else {
			System.out.println(this.name
					+ " is being hired again. His new position is: "
					+ this.work + " and the new salary is: " + this.salary);
			leftJob = false;
		}
	}

	void printStatus() {
		if (!leftJob) {
			System.out.println("Name: " + this.name + ", work position: "
					+ this.work + ". The salary for the position: "
					+ this.salary + " euro.");
			System.out.println("Total money received until now: "
					+ this.totalMoney);

		} else {
			System.out.println(this.name + " has left the job.");
		}
	}
}

public class FactoryWithConstructor {
	public static void main(String[] args) {
		Employee employee1 = new Employee();
		employee1.printStatus();
		employee1.setName("Harry");
		employee1.changeCurrentWork("Teacher");
		employee1.setSalary(250);
		employee1.printStatus();
		employee1.receiveSalary();
		employee1.receiveSalary();
		employee1.receiveSalary();
		employee1.printStatus();
		employee1.leftJob();
		employee1.printStatus();
		employee1.receiveSalary();
		Employee employee2 = new Employee("Bobby", "Accountant", 350);
		employee2.printStatus();
		employee2.getNewJob("Developer", 567);
		employee2.printStatus();
		employee2.receiveSalary();
		employee2.printStatus();
		employee1.getNewJob("Secretary", 333);
		employee1.receiveSalary();
		employee1.printStatus();
		employee1.workForMonths(5);
	}
}