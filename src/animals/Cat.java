package animals;

import main.AnimalClass;

// Class responsible for encapsulating the attributes for Cat;
// Extends the abstract class 'AnimalClass';
public class Cat extends AnimalClass {
	// Contructor of the class;
	// Receives the attributes name, age, ilness and type from
	// 'AnimalFactory' class;
	public Cat(String name, double age, String illness, String type) {
		super(name, age, illness, type);
		this.age = age;
		this.name = name;
		this.illness = illness;
		this.type = type;
	}

}
