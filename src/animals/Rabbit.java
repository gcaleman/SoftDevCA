package animals;

import interfaces.Animal;
import main.AnimalClass;

public class Rabbit extends AnimalClass implements Animal {

	public Rabbit(String name, double age, String illness) {
		super(name, age, illness);
		this.age = age;
		this.name = name;
		this.illness = illness;
	}

	@Override
	public void draw() {
		System.out.println("Inside Rabit::draw() method.");

	}

}
