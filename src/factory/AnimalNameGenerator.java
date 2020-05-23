package factory;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

public class AnimalNameGenerator {

	// Array of strings with '''some...''' different names for pets; ( it only took
	// 2 min to do, really. )
	protected String[] names = { "Abe", "Abbott", "Ace", "Aero", "AJ", "Albert", "Alden", "Alex", "Alfie", "Alvin",
			"Amos", "Andy", "Angus", "Apollo", "Archie", "Aries", "Artie", "Ash", "Austin", "Axel", "Bailey", "Bandit",
			"Barkley", "Barney", "Baron", "Baxter", "Bear", "Beau", "Benji", "Benny", "Bentley", "Billy", "Bingo",
			"Blake", "Blaze", "Blue", "Bo", "Boomer", "Brady", "Brody", "Brownie", "Bruce", "Bruno", "Brutus", "Bubba",
			"Buck", "Buddy", "Buster", "Butch", "Buzz", "Cain", "Captain", "Carter", "Cash", "Casper", "Champ",
			"Chance", "Charlie", "Chase", "Chester", "Chewy", "Chico", "Chief", "Chip", "CJ", "Clifford", "Clyde",
			"Coco", "Cody", "Colby", "Cooper", "Copper", "Damien", "Dane", "Dante", "Denver", "Dexter", "Diego",
			"Diesel", "Dodge", "Drew", "Duke", "Dylan", "Eddie", "Eli", "Elmer", "Emmett", "Evan", "Felix", "Finn",
			"Fisher", "Flash", "Frankie", "Freddy", "Fritz", "Gage", "George", "Gizmo", "Goose", "Gordie", "Griffin",
			"Gunner", "Gus", "Hank", "Harley", "Harvey", "Hawkeye", "Henry", "Hoss", "Huck", "Hunter", "Iggy", "Ivan",
			"Jack", "Jackson", "Jake", "Jasper", "Jax", "Jesse", "Joey", "Johnny", "Judge", "Kane", "King", "Kobe",
			"Koda", "Lenny", "Leo", "Leroy", "Levi", "Lewis", "Logan", "Loki", "Louie", "Lucky", "Luke", "Marley",
			"Marty", "Maverick", "Max", "Maximus", "Mickey", "Miles", "Milo", "Moe", "Moose", "Abby", "Addie", "Alexis",
			"Alice", "Allie", "Alyssa", "Amber", "Angel", "Anna", "Annie", "Ariel", "Ashley", "Aspen", "Athena",
			"Autumn", "Ava", "Avery", "Baby", "Bailey", "Basil", "Bean", "Bella", "Belle", "Betsy", "Betty", "Bianca",
			"Birdie", "Biscuit", "Blondie", "Blossom", "Bonnie", "Brandy", "Brooklyn", "Brownie", "Buffy", "Callie",
			"Camilla", "Candy", "Carla", "Carly", "Carmela", "Casey", "Cassie", "Chance", "Chanel", "Chloe", "Cinnamon",
			"Cleo", "Coco", "Cookie", "Cricket", "Daisy", "Dakota", "Dana", "Daphne", "Darla", "Darlene", "Delia",
			"Delilah", "Destiny", "Diamond", "Diva", "Dixie", "Dolly", "Duchess", "Eden", "Edie", "Ella", "Ellie",
			"Elsa", "Emma", "Emmy", "Eva", "Faith", "Fanny", "Fern", "Fiona", "Foxy" };

	// Array with some diffent illnesses for cats;
	protected String[] catIllness = { "Aspergillosis", "Avian influenza in cats", "Bladder cancer", "Bone cancer",
			"Cancer in cats", "Cat flu", "Feline calicivirus", "Toxoplasmosis caused by Toxoplasma gondii",
			"Tritrichomonas blagburni", "Tyzzer's disease", "Vaccine-associated sarcoma" };
	// Array with some diffent illnesses for dogs;
	protected String[] dogIllness = { "Canine Coronavirus", "Canine Distemper", "Canine Hepatitis", "Canine Influenza",
			"Canine Parainfluenza", "Kennel Cough", "Leptospirosis", "Parvovirus" };
	// Array with some diffent illnesses for rabbits;
	protected String[] rabbitIllness = { "Overgrown teeth", "Snuffles", "Hairballs", "Uterine tumours", "Myxomatosis",
			"Calicivirus" };

	// variable for animal age;
	protected double animalAge;

	// variable for the number of animal to be generated;
	public int numbAnimals = 1000;

	// class' constructor
	public AnimalNameGenerator() {

	}

	// Method generates 1000 random names, getting them from the 'names' list
	public ArrayList<String> getRandomName() {
		// ArrayList of strings to hold the names;
		ArrayList<String> nameList = new ArrayList<String>();
		// Instance of the class 'Random';
		Random r = new Random();

		// for loop gets 1000 random names from the 'names' list and adds it to the
		// 'nameList';
		for (int i = 0; i < numbAnimals; i++) {

			String animalName = names[r.nextInt(names.length)];

			nameList.add(animalName);

		}
		// Method returns the 'nameList';
		return (nameList);

	}

	// Method generates 1000 random dog illnesses, getting them from the
	// 'dogIllness' list
	public ArrayList<String> getRandomDogIllness() {
		// ArrayList of strings to hold the illnesses;
		ArrayList<String> dogIllnessList = new ArrayList<String>();
		// Instance of the class 'Random';
		Random r = new Random();

		// for loop gets 1000 random illnesses from the 'dogIllness' list
		// and adds it to the
		// 'dogIllnessList';
		for (int i = 0; i < numbAnimals; i++) {

			String illnessName = dogIllness[r.nextInt(dogIllness.length)];

			dogIllnessList.add(illnessName);

		}

		return (dogIllnessList);

	}

	public ArrayList<String> getRandomCatIllness() {
		// ArrayList of strings to hold the illnesses;
		ArrayList<String> catIllnessList = new ArrayList<String>();
		// Instance of the class 'Random';
		Random r = new Random();

		// for loop gets 1000 random illnesses from the 'catIllness' list
		// and adds it to the
		// 'catIllnessList';
		for (int i = 0; i < numbAnimals; i++) {

			String illnessName = catIllness[r.nextInt(catIllness.length)];

			catIllnessList.add(illnessName);

		}

		return (catIllnessList);

	}

	public ArrayList<String> getRandomRabbitIllness() {
		// ArrayList of strings to hold the illnesses;
		ArrayList<String> rabbitIllnessList = new ArrayList<String>();
		// Instance of the class 'Random';
		Random r = new Random();

		// for loop gets 1000 random illnesses from the 'rabbitIllness' list
		// and adds it to the
		// 'rabbitIllnessList';
		for (int i = 0; i < numbAnimals; i++) {

			String illnessName = rabbitIllness[r.nextInt(rabbitIllness.length)];

			rabbitIllnessList.add(illnessName);

		}

		return (rabbitIllnessList);

	}

	// Method responsible for generating a random animal age;
	public double animalAge() {
		// Creating an instance of the class DecimalFormat
		// in order to generate only ages in the format '0.0',
		// with one decimal place;
		DecimalFormat decimalAge = new DecimalFormat("#.#");

		// variable initial age, so minimum age generated is 0.1;
		double initialAge = 0.1;
		// instance of the random class;
		Random r = new Random();
		// initiating variables for ageInt (age integer), ageDouble and ageDoubleStr
		double ageInt = 0;
		double ageDouble = 0;
		String ageDoubleStr = " ";

		// age from integer place is a random value with maximum value being 12;
		ageInt = r.nextInt(12);

		// age from decimal part is a random value that has
		// the decimalAge format (0.0), and has a String format;
		ageDoubleStr = decimalAge.format(r.nextDouble());
		// transforms ageDoubleStr from 'String' to 'double';
		ageDouble = Double.parseDouble(ageDoubleStr);

		// final age is the sum between the integer part (0-12) + the decimal
		// (0.0 - 0.9);
		double age = ageInt + ageDouble;

		// if age generated is 0, the age then gets the initialAge value;
		if (age == 0) {

			age += initialAge;

		}
		// Method returns age generated
		return age;

	}

}
