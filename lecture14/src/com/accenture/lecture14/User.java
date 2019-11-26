package com.accenture.lecture14;

public class User {
	private String name;
	private int bankAcc;

	public User(String name) {
		this(name, 0);
		this.name = name;
	}

	public User(String name, int bankAcc) {
		this.name = name;
		this.bankAcc = bankAcc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBankAcc() {
		return bankAcc;
	}

	public void setBankAcc(int bankAcc) {
		this.bankAcc = bankAcc;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", bankAcc=" + bankAcc + "]";
	}
	
	
}
