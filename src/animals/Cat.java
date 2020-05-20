package animals;

import interfaces.Animal;
import main.AnimalClass;

public class Cat extends AnimalClass implements Animal {

	public Cat(String name, double age, String illness, String type) {
		super(name, age, illness, type);
		this.age = age;
		this.name = name;
		this.illness = illness;
		this.type = type;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

}
