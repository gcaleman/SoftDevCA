package animals;

import interfaces.Animal;
import main.AnimalClass;

public class Cat extends AnimalClass implements Animal {

	public Cat(String name, double age, String illness) {
		super(name, age, illness);
		this.age = age;
		this.name = name;
		this.illness = illness;
	}

	@Override
	public void draw() {
		System.out.println("Inside Cat::draw() method.");
		
	}

}
