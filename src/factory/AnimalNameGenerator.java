package factory;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

public class AnimalNameGenerator {

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

	protected String[] catIllness = { "Aspergillosis", "Avian influenza in cats", "Bladder cancer in cats and dogs",
			"Bone cancer in cats and dogs", "Cancer in cats", "Cat flu", "Feline calicivirus", "originating from swine",
			"Toxoplasmosis caused by Toxoplasma gondii", "Tritrichomonas blagburni", "Tyzzer's disease",
			"Vaccine-associated sarcoma" };

	protected String[] dogIllness = { "Canine Coronavirus", "Canine Distemper", "Canine Hepatitis", "Canine Influenza",
			"Canine Parainfluenza", "Kennel Cough", "Leptospirosis", "Parvovirus" };

	protected String[] rabbitIllness = { "Overgrown teeth", "Snuffles", "Hairballs", "Uterine tumours", "Myxomatosis",
			"Calicivirus" };

	protected double animalAge;

	public int numbAnimals = 1000;

	public AnimalNameGenerator() {

	}

	public ArrayList<String> getRandomName() {
		// return a random name
		ArrayList<String> nameList = new ArrayList<String>();
		Random r = new Random();

		// pick a firstname and surname based on length of array

		for (int i = 0; i < numbAnimals; i++) {

			String animalName = names[r.nextInt(names.length)];

			nameList.add(animalName);

		}

		return (nameList);

	}

	public ArrayList<String> getRandomDogIllness() {
		// return a random name
		ArrayList<String> dogIllnessList = new ArrayList<String>();
		Random r = new Random();

		// pick a firstname and surname based on length of array

		for (int i = 0; i < numbAnimals; i++) {

			String illnessName = dogIllness[r.nextInt(dogIllness.length)];

			dogIllnessList.add(illnessName);

		}

		return (dogIllnessList);

	}

	public ArrayList<String> getRandomCatIllness() {
		// return a random name
		ArrayList<String> catIllnessList = new ArrayList<String>();
		Random r = new Random();

		// pick a firstname and surname based on length of array

		for (int i = 0; i < numbAnimals; i++) {

			String illnessName = catIllness[r.nextInt(catIllness.length)];

			catIllnessList.add(illnessName);

		}

		return (catIllnessList);

	}

	public ArrayList<String> getRandomRabbitIllness() {
		// return a random name
		ArrayList<String> rabbitIllnessList = new ArrayList<String>();
		Random r = new Random();

		// pick a firstname and surname based on length of array

		for (int i = 0; i < numbAnimals; i++) {

			String illnessName = rabbitIllness[r.nextInt(rabbitIllness.length)];

			rabbitIllnessList.add(illnessName);

		}

		return (rabbitIllnessList);

	}

	public double animalAge() {

		DecimalFormat decimalAge = new DecimalFormat("#.#");

		double initialAge = 0.1;
		Random r = new Random();
		double ageInt = 0;
		double ageDouble = 0;
		String ageDoubleStr = " ";

		ageInt = r.nextInt(12);

		ageDoubleStr = decimalAge.format(r.nextDouble());
		ageDouble = Double.parseDouble(ageDoubleStr);

		double age = ageInt + ageDouble;

		if (age == 0) {

			age += initialAge;

		}

		return age;

	}

}
