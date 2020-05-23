package main;

// Abstract class responsible for providing the attributes and methods 
// for the subclasses - Cat, Dog and Rabbit; 
public abstract class AnimalClass {

	protected String name;
	protected double age;
	protected String illness;
	protected String type;

	public AnimalClass(String name, double age, String illness, String type) {
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.type = type;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	// Method responsible for returning a String type of answer to the objects of
	// the class;
	@Override
	public String toString() {

		return "Name: " + this.name + " - Age: " + this.age + " - Illness: " + this.illness + " - Type: " + this.type;
	}

}
