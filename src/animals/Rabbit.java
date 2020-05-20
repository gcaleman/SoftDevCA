package animals;

import interfaces.Animal;
import main.AnimalClass;

public class Rabbit extends AnimalClass implements Animal {

	public Rabbit(String name, double age, String illness, String type) {
		super(name, age, illness, type);
		this.age = age;
		this.name = name;
		this.illness = illness;
		this.type = type;
	}

	@Override
	public void draw() {
		System.out.println("Inside Rabit::draw() method.");

	}

}
