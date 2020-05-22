package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import factory.*;

public class CLI {

	ArrayList<String> petNames = new ArrayList<String>();

	MedFactory myMedFactory = new MedFactory();
	AdmFactory myAdmFactory = new AdmFactory();
	AnimalFactory myPetFactory = new AnimalFactory();

	ArrayList<StaffClass> allStaffList = new ArrayList<StaffClass>();
	ArrayList<StaffClass> vetList = new ArrayList<StaffClass>();
	ArrayList<StaffClass> nurseList = new ArrayList<StaffClass>();
	ArrayList<StaffClass> treineeList = new ArrayList<StaffClass>();
	ArrayList<StaffClass> recepList = new ArrayList<StaffClass>();
	ArrayList<StaffClass> ITList = new ArrayList<StaffClass>();

	ArrayList<AnimalClass> allPetList = new ArrayList<AnimalClass>();
	ArrayList<AnimalClass> dogList = new ArrayList<AnimalClass>();
	ArrayList<AnimalClass> catList = new ArrayList<AnimalClass>();
	ArrayList<AnimalClass> rabbitList = new ArrayList<AnimalClass>();

	QueueGenerator animalQueue1 = new QueueGenerator(200);
	QueueGenerator animalQueue2 = new QueueGenerator(200);
	QueueGenerator animalQueue3 = new QueueGenerator(200);
	QueueGenerator animalQueue4 = new QueueGenerator(200);
	QueueGenerator animalQueue5 = new QueueGenerator(200);

	ArrayList<String> vetQueue1 = new ArrayList<String>();
	ArrayList<String> vetQueue2 = new ArrayList<String>();
	ArrayList<String> vetQueue3 = new ArrayList<String>();
	ArrayList<String> vetQueue4 = new ArrayList<String>();
	ArrayList<String> vetQueue5 = new ArrayList<String>();

	Map<String, QueueGenerator> petQueueOrderedMap = new HashMap<String, QueueGenerator>();
	Map<String, ArrayList<String>> petQueueUnorderedMap = new HashMap<String, ArrayList<String>>();

	String[] options = { "List of all staff", "List of all staff by categories",
			"List of all Admin staff performing a certain task", "Search for a specific member of staff by name",
			"List of all animals", "List of animals by various types", "Search for a specific animal by name",
			"List of all the animals assigned to a member of medical staff",
			"List of the order in which pets will be looked after by a particular member of the medical staff",
			"For a given member of the medical staff, pass to the next pet" };
	String[] staffCategories = { "Veterinarian", "Nurse", "Treinee", "IT Technician", "Receptionist" };
	String[] animalTypes = { "Dog", "Cat", "Rabbit" };
	String[] tasks = { "On Holidays", "Filling", "Answering Phone", "Checking Schedules", "Installing Software",
			"Cleaning PC", "Doing nothing" };

	public CLI() {

		vetList.addAll(myMedFactory.createVetStaff());

		nurseList.addAll(myMedFactory.createNurseStaff());

		treineeList.addAll(myMedFactory.createTreineeStaff());

		recepList.addAll(myAdmFactory.createRecepStaff());

		ITList.addAll(myAdmFactory.createITStaff());

		allStaffList.addAll(vetList);
		allStaffList.addAll(nurseList);
		allStaffList.addAll(treineeList);
		allStaffList.addAll(recepList);
		allStaffList.addAll(ITList);

		dogList.addAll(myPetFactory.createDogs());

		catList.addAll(myPetFactory.createCats());

		rabbitList.addAll(myPetFactory.createRabbits());

		allPetList.addAll(dogList);
		allPetList.addAll(catList);
		allPetList.addAll(rabbitList);

		for (int i = 0; i < 200; i++) {
			animalQueue1.insertToQueue(allPetList.get(i).toString());
			vetQueue1.add(allPetList.get(i).toString());
		}

		for (int i = 200; i < 400; i++) {
			animalQueue2.insertToQueue(allPetList.get(i).toString());
			vetQueue2.add(allPetList.get(i).toString());
		}

		for (int i = 400; i < 600; i++) {
			animalQueue3.insertToQueue(allPetList.get(i).toString());
			vetQueue3.add(allPetList.get(i).toString());
		}

		for (int i = 600; i < 800; i++) {
			animalQueue4.insertToQueue(allPetList.get(i).toString());
			vetQueue4.add(allPetList.get(i).toString());
		}

		for (int i = 800; i < 1000; i++) {
			animalQueue5.insertToQueue(allPetList.get(i).toString());
			vetQueue5.add(allPetList.get(i).toString());
		}

		petQueueOrderedMap.put(vetList.get(0).getName(), animalQueue1);
		petQueueOrderedMap.put(vetList.get(1).getName(), animalQueue2);
		petQueueOrderedMap.put(vetList.get(2).getName(), animalQueue3);
		petQueueOrderedMap.put(vetList.get(3).getName(), animalQueue4);
		petQueueOrderedMap.put(vetList.get(4).getName(), animalQueue5);

		petQueueUnorderedMap.put(vetList.get(0).getName(), vetQueue1);
		petQueueUnorderedMap.put(vetList.get(1).getName(), vetQueue2);
		petQueueUnorderedMap.put(vetList.get(2).getName(), vetQueue3);
		petQueueUnorderedMap.put(vetList.get(3).getName(), vetQueue4);
		petQueueUnorderedMap.put(vetList.get(4).getName(), vetQueue5);

		selectOptions();

	}

	public void selectOptions() {
		int option = -1;
		do {
			do {
				displayOptions();
				option = userOptionInput();
			} while (!validOption(option));
			if (option == 1) {
				listAllStaff();
			} else if (option == 2) {
				listAllStaffCategorie();
			} else if (option == 3) {
				listAdminStaffTask();
			} else if (option == 4) {
				searchStaffName();
			} else if (option == 5) {
				listAllAnimals();
			} else if (option == 6) {
				listAllAnimalsTypes();
			} else if (option == 7) {
				searchAnimalName();
			} else if (option == 8) {
				listAnimalCare();
			} else if (option == 9) {
				listAnimalCareOrder();
			} else if (option == 10) {
				passNextPet();
			}

		} while (option != 0);
		System.exit(0);
	}

	public void displayOptions() {
		System.out.println("Select one option for the system to run: ");
		for (int i = 0; i < options.length; i++) {
			System.out.println("Press " + (i + 1) + " to " + options[i] + ".");
		}
		System.out.println("Press 0 to exit.");
	}

	public int userOptionInput() {
		BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in));
		String optionString = null;
		int option = -1;

		try {

			optionString = myReader.readLine();
			option = Integer.parseInt(optionString);

		} catch (IOException | NumberFormatException e) {
			System.out.println("Thats is not a valid option (type from 0 to " + options.length + ".");
		}
		return option;
	}

	public int userCategorieInput() {
		BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in));
		String optionString = null;
		int option = -1;

		try {

			optionString = myReader.readLine();
			option = Integer.parseInt(optionString);

		} catch (IOException | NumberFormatException e) {
			System.out.println("Thats is not a valid option (type from 0 to " + staffCategories.length + ".");
		}
		return option;
	}

	public int userAnimalTypeInput() {
		BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in));
		String optionString = null;
		int option = -1;

		try {

			optionString = myReader.readLine();
			option = Integer.parseInt(optionString);

		} catch (IOException | NumberFormatException e) {
			System.out.println("That is not a valid option (type from 0 to " + animalTypes.length + ".");
		}
		return option;
	}

	public String userNameInput() {
		BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in));
		String name = null;

		try {

			name = myReader.readLine();

		} catch (IOException e) {
			System.out.println("That is not a valid name.");
		}
		return name;
	}

	public String userTaskInput() {
		BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in));
		String task = null;

		try {

			task = myReader.readLine();

		} catch (IOException e) {
			System.out.println("That is not a valid task.");
		}
		return task;
	}

	private boolean validOption(int option) {
		return option >= 0 && option <= 10;
	}

	private boolean validCategorieOption(int categorie) {
		return categorie >= 0 && categorie <= 5;
	}

	private boolean validAnimalTypeOption(int animalType) {
		return animalType >= 0 && animalType <= 3;
	}

	private void passNextPet() {
		String name = null;
		System.out.println("The Veterinarians responsibles for the animal care are: ");
		for (StaffClass cs : vetList) {

			System.out.println(cs.toString());

		}
		System.out.println("Type the name of one of them to pass to the next pet on the queue (type 'exit' to exit): ");
		name = userNameInput();
		if (name.equalsIgnoreCase("exit")) {
			selectOptions();
		} else if (petQueueOrderedMap.containsKey(name)) {

			petQueueOrderedMap.get(name).removeFromQueue();

		} else {
			System.out.println("Name is incorrect, try it again. The name is case sensitive, it has to be identical.");
			listAnimalCare();
		}

	}

	private void listAnimalCareOrder() {
		String name = null;
		System.out.println("The Veterinarians responsibles for the animal care are: ");
		for (StaffClass cs : vetList) {

			System.out.println(cs.toString());

		}
		System.out.println(
				"Type the name of one of them to check which animals they are responsible for (type 'exit' to exit): ");
		name = userNameInput();
		if (name.equalsIgnoreCase("exit")) {
			selectOptions();
		} else if (petQueueOrderedMap.containsKey(name)) {

			petQueueOrderedMap.get(name).display();

		} else {
			System.out.println("Name is incorrect, try it again. The name is case sensitive, it has to be identical.");
			listAnimalCare();
		}
	}

	private void listAnimalCare() {
		String name = null;
		System.out.println("The Veterinarians responsibles for the animal care are: ");
		for (StaffClass cs : vetList) {

			System.out.println(cs.toString());

		}
		System.out.println(
				"Type the name of one of them to check which animals they are responsible for (type 'exit' to exit): ");
		name = userNameInput();
		if (name.equalsIgnoreCase("exit")) {
			selectOptions();
		} else if (petQueueUnorderedMap.containsKey(name)) {
			for (int i = 0; i < vetQueue1.size(); i++) {
				System.out.println(petQueueUnorderedMap.get(name).get(i).toString());
			}
		} else {
			System.out.println("Name is incorrect, try it again. The name is case sensitive, it has to be identical.");
			listAnimalCare();
		}
	}

	private void searchAnimalName() {
		System.out.println("Type name, or type 'exit' to exit: ");
		String target = userNameInput();
		if (target.equalsIgnoreCase("exit")) {
			selectOptions();
		} else {
			for (AnimalClass cs : allPetList) {
				petNames.add(cs.getName());

			}
			ArrayList<Integer> position = searchAnimal(target, petNames);
			if (position.contains(-1)) {
				System.out.println("Not there.");
			} else {
				for (int i = 0; i < position.size(); i++) {
					int index = position.get(i);
					System.out.println(allPetList.get(index).toString());
				}

			}
		}
	}

	private void listAllAnimalsTypes() {
		int animalType = -1;

		do {
			do {
				System.out.println("Select a animal type: ");
				for (int i = 0; i < animalTypes.length; i++) {
					System.out.println("Press " + (i + 1) + " to " + animalTypes[i] + ".");
				}
				System.out.println("Press 0 to exit.");

				animalType = userAnimalTypeInput();
			} while (!validAnimalTypeOption(animalType));

			if (animalType == 0) {
				selectOptions();
			} else if (animalType == 1) {
				System.out.println("The current list of dogs in the system is: ");
				System.out.println(" ");
				for (AnimalClass cs : dogList) {

					System.out.println(cs.toString());

				}
				System.out.println(" ");
				System.out.println("Number total: " + dogList.size());
				System.out.println(" ");
				System.out.println("*********************************************************");
				listAllAnimalsTypes();
			} else if (animalType == 2) {
				System.out.println("The current list of cats in the system is: ");
				System.out.println(" ");
				for (AnimalClass cs : catList) {

					System.out.println(cs.toString());

				}
				System.out.println(" ");
				System.out.println("Number total: " + catList.size());
				System.out.println(" ");
				System.out.println("*********************************************************");
				listAllAnimalsTypes();
			} else {
				System.out.println("The current list of rabbits in the system is: ");
				System.out.println(" ");
				for (AnimalClass cs : rabbitList) {

					System.out.println(cs.toString());

				}
				System.out.println(" ");
				System.out.println("Number total: " + rabbitList.size());
				System.out.println(" ");
				System.out.println("*********************************************************");
				listAllAnimalsTypes();
			}

		} while (animalType != 0);
	}

	private void listAllAnimals() {
		System.out.println("The current list of animals in the system is: ");
		System.out.println(" ");
		for (AnimalClass cs : allPetList) {

			System.out.println(cs.toString());

		}
		System.out.println(" ");
		System.out.println("Number total: " + allPetList.size());
		System.out.println(" ");
		System.out.println("*********************************************************");
		selectOptions();
	}

	private void searchStaffName() {
		System.out.println("Type name, or type 'exit' to exit: ");
		String target = userNameInput();
		if (target.equalsIgnoreCase("exit")) {
			selectOptions();
		} else {
			int position = searchStaff(target, allStaffList);
			if (position == -1) {
				System.out.println("Not there");
			} else {
				System.out.println(allStaffList.get(position).toString());
			}
		}
	}

	private void listAdminStaffTask() {
		ArrayList<String> AdmTaskNames;
		String task = null;
		System.out.println(
				"Type in one of the tasks to see which member of the ADM Staff is running it, type 'exit' to exit: ");
		Map<String, String> taskMap = myAdmFactory.getAdmTask();
		System.out.println("Tasks being ran currently: ");

		System.out.println(taskMap.values());

		task = userTaskInput();
		if (task.equalsIgnoreCase("EXIT")) {
			selectOptions();
		} else {
			if (taskMap.containsValue(task)) {
				AdmTaskNames = getKey(taskMap, task);
				for (int i = 0; i < AdmTaskNames.size(); i++) {
					String name = AdmTaskNames.get(i);
					int position = searchStaff(name, allStaffList);
					if (position == -1) {
						System.out.println("Not there.");
					} else {
						int index = position;
						System.out.println(allStaffList.get(index).toString());
					}

				}

			} else {
				System.out.println("Type another task.");
				listAdminStaffTask();
			}
			listAdminStaffTask();
		}
	}

	private void listAllStaffCategorie() {

		int categorie = -1;

		do {
			do {
				System.out.println("Select a categorie: ");
				for (int i = 0; i < staffCategories.length; i++) {
					System.out.println("Press " + (i + 1) + " to " + staffCategories[i] + ".");
				}
				System.out.println("Press 0 to exit.");

				categorie = userCategorieInput();
			} while (!validCategorieOption(categorie));
			if (categorie == 0) {
				selectOptions();
			} else if (categorie == 1) {
				System.out.println("The current Veterinarians in the Staff are: ");
				for (StaffClass cs : vetList) {

					System.out.println(cs.toString());

				}
				System.out.println("Number total: " + vetList.size());
				System.out.println("*********************************************************");
				listAllStaffCategorie();
			} else if (categorie == 2) {
				System.out.println("The current Nurses in the Staff are: ");
				for (StaffClass cs : nurseList) {
					System.out.println(cs.toString());

				}
				System.out.println("Number total: " + nurseList.size());
				System.out.println("*********************************************************");
				listAllStaffCategorie();
			} else if (categorie == 3) {
				System.out.println("The current Treinees in the Staff are: ");
				for (StaffClass cs : treineeList) {

					System.out.println(cs.toString());

				}
				System.out.println("Number total: " + treineeList.size());
				System.out.println("*********************************************************");
				listAllStaffCategorie();
			} else if (categorie == 4) {
				System.out.println("The current IT professionals in the Staff are: ");
				for (StaffClass cs : ITList) {

					System.out.println(cs.toString());

				}
				System.out.println("Number total: " + ITList.size());
				System.out.println("*********************************************************");
				listAllStaffCategorie();
			} else {
				System.out.println("The current Receptionists in the Staff are: ");
				for (StaffClass cs : recepList) {

					System.out.println(cs.toString());

				}
				System.out.println("Number total: " + recepList.size());
				System.out.println("*********************************************************");
				listAllStaffCategorie();
			}
		} while (categorie != 0);

	}

	public void listAllStaff() {
		System.out.println("The current list of names in the Staff is: ");
		for (StaffClass cs : allStaffList) {

			System.out.println(cs.toString());

		}
		System.out.println("Number total: " + allStaffList.size());
		System.out.println("*********************************************************");
		selectOptions();
	}

	public static int searchStaff(String target, List<StaffClass> pool) {

		boolean found = false;
		int i = 0;
		do {
			if (pool.get(i).getName().equalsIgnoreCase(target)) {
				found = true;
				return i;
			}
			i++;
		} while (!found && i < pool.size());
		return -1;
	}

	public static ArrayList<Integer> searchAnimal(String target, List<String> pool) {

		int i = 0;
		ArrayList<Integer> indexArray = new ArrayList<Integer>();

		do {
			if (pool.get(i).equalsIgnoreCase(target)) {
				indexArray.add(i);
			}
			i++;
		} while (i < pool.size());
		if (indexArray.size() == 0) {
			indexArray.add(-1);
			return indexArray;
		}
		return indexArray;
	}

	public static <Key, Value> ArrayList<String> getKey(Map<Key, Value> map, Value value) {

		ArrayList<String> listNameTasks = new ArrayList<String>();

		for (Key key : map.keySet()) {
			if (value.equals(map.get(key))) {
				listNameTasks.add((String) key);
			}
		}
		if (listNameTasks.size() == 0) {
			return null;
		}
		return listNameTasks;
	}

}
