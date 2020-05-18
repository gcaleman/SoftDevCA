package main;

public abstract class AnimalClass {
	
	protected String name;
	protected double age;
	protected String illness;
	
	public AnimalClass(String name, double age, String illness) {
		this.name = name;
		this.age = age;
		this.illness = illness;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getIllness() {
		return illness;
	}

	public void setIllness(String illness) {
		this.illness = illness;
	}
	
	@Override
	public String toString() {
		
		return "Name: " + this.name + " - Age: " + this.age + " - Illness: " + this.illness;
	}
	
}
