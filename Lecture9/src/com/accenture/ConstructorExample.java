package com.accenture;

class Pupil {
	private int age;
	private int form;
	private String name;

	public Pupil() {
		this("", 7, 1);
	}

	public Pupil(String name) {
		this(name, 7, 1);
	}

	public Pupil(String name, int age, int form) {
		this.age = age;
		this.form = form;
		this.name = name;
		System.out.println("Pupil goes to school");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getForm() {
		return form;
	}

	public void setForm(int form) {
		this.form = form;
	}

	public String toString() {
		return "name:" + name + " age:" + age + " form:" + form;
	}
}

public class ConstructorExample {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Pupil pupil1 = new Pupil("Peter", 7, 1);
		Pupil pupil1 = new Pupil("Peter");
		// pupil1.setAge(7);
		// pupil1.setForm(1);
		// pupil1.setName("Peter"); System.out.println(pupil1.toString()); Pupil
		// pupil2 = new Pupil();
		// pupil2.setName("Anna");
		// System.out.println(pupil2.toString());
		Pupil pupil3 = new Pupil("John", 8, 1);
		System.out.println(pupil3.toString());
		System.out.println(pupil1.toString());
	}
}
