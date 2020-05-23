package factory;

import java.util.ArrayList;

import animals.Cat;
import animals.Dog;
import animals.Rabbit;
import main.AnimalClass;

//Class responsible for creating the animals (dogs, cats and rabbits),
//populating an arraylist with each respective animal type;
public class AnimalFactory {

	// ArrayLists for dog, cat and rabbit;
	ArrayList<AnimalClass> dog = new ArrayList<AnimalClass>();
	ArrayList<AnimalClass> cat = new ArrayList<AnimalClass>();
	ArrayList<AnimalClass> rabbit = new ArrayList<AnimalClass>();

	// Instance of the class AnimalNameGenerator;
	// Used to get random names, illnesses and age;
	AnimalNameGenerator myANG = new AnimalNameGenerator();

	// Method responsible for creating dogs;
	public ArrayList<AnimalClass> createDogs() {

		// for loop gets 400 random names, illnesses and ages from AnimalNameGenerator
		// class, and
		// creates 400 dogs using the Dog class, populating the dog list with them;
		for (int i = 0; i < 400; i++) {
			// variable type for dog;
			String type = "Dog";

			ArrayList<String> listPetName = myANG.getRandomName();
			ArrayList<String> listDogIllness = myANG.getRandomDogIllness();
			double dogAge = myANG.animalAge();

			String dogName = listPetName.get(i);
			String dogIllness = listDogIllness.get(i);

			AnimalClass someDog = new Dog(dogName, dogAge, dogIllness, type);

			dog.add(someDog);

		}
		// Method returns the 'dog' list;
		return dog;
	}

	// Method responsible for creating cats;
	public ArrayList<AnimalClass> createCats() {

		// for loop gets 400 random names, illnesses and ages from AnimalNameGenerator
		// class, and
		// creates 400 cats using the cat class, populating the cat list with them;
		for (int i = 0; i < 400; i++) {
			// variable type for dog;
			String type = "Cat";

			ArrayList<String> listPetName = myANG.getRandomName();
			ArrayList<String> listCatIllness = myANG.getRandomCatIllness();
			double catAge = myANG.animalAge();

			String catName = listPetName.get(i);
			String catIllness = listCatIllness.get(i);

			AnimalClass someCat = new Cat(catName, catAge, catIllness, type);

			cat.add(someCat);

		}
		// Method returns the 'cat' list;
		return cat;
	}

	// Method responsible for creating rabbits;
	public ArrayList<AnimalClass> createRabbits() {

		// for loop gets 400 random names, illnesses and ages from AnimalNameGenerator
		// class, and
		// creates 400 rabbits using the rabbit class, populating the rabbit list with
		// them;
		for (int i = 0; i < 200; i++) {
			String type = "Rabbit";

			ArrayList<String> listPetName = myANG.getRandomName();
			ArrayList<String> listRabbitIllness = myANG.getRandomRabbitIllness();
			double rabbitAge = myANG.animalAge();

			String rabbitName = listPetName.get(i);
			String rabbitIllness = listRabbitIllness.get(i);

			AnimalClass someRabbit = new Rabbit(rabbitName, rabbitAge, rabbitIllness, type);

			rabbit.add(someRabbit);

		}
		// Method returns the 'rabbit' list;
		return rabbit;
	}

}
