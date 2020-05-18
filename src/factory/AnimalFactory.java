package factory;

import java.util.ArrayList;

import animals.Cat;
import animals.Dog;
import animals.Rabbit;
import main.AnimalClass;

public class AnimalFactory {

	ArrayList<AnimalClass> dog = new ArrayList<AnimalClass>();
	ArrayList<AnimalClass> cat = new ArrayList<AnimalClass>();
	ArrayList<AnimalClass> rabbit = new ArrayList<AnimalClass>();

	AnimalNameGenerator myANG = new AnimalNameGenerator();
	

	public ArrayList<AnimalClass> createDogs() {

		for (int i = 0; i < 400; i++) {

			ArrayList<String> listPetName = myANG.getRandomName();
			ArrayList<String> listDogIllness = myANG.getRandomDogIllness();
			double dogAge = myANG.animalAge();

			String dogName = listPetName.get(i);
			String dogIllness = listDogIllness.get(i);

			AnimalClass someDog = new Dog(dogName, dogAge, dogIllness);

			dog.add(someDog);

		}
		return dog;
	}

	public ArrayList<AnimalClass> createCats() {

		for (int i = 0; i < 400; i++) {

			ArrayList<String> listPetName = myANG.getRandomName();
			ArrayList<String> listCatIllness = myANG.getRandomCatIllness();
			double catAge = myANG.animalAge();
	
			String catName = listPetName.get(i);
			String catIllness = listCatIllness.get(i);

			AnimalClass someCat = new Cat(catName, catAge, catIllness);

			cat.add(someCat);

		}
		return cat;
	}

	public ArrayList<AnimalClass> createRabbits() {

		for (int i = 0; i < 400; i++) {

			ArrayList<String> listPetName = myANG.getRandomName();
			ArrayList<String> listRabbitIllness = myANG.getRandomRabbitIllness();
			double rabbitAge = myANG.animalAge();

			String rabbitName = listPetName.get(i);
			String rabbitIllness = listRabbitIllness.get(i);

			AnimalClass someRabbit = new Rabbit(rabbitName, rabbitAge, rabbitIllness);

			rabbit.add(someRabbit);

		}
		return rabbit;
	}

}
