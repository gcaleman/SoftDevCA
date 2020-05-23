package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import factory.*;

// Class responsible for initiating the application;
// Instantiate the factory classes to create all the staff and animal;
// Create arraylists instance of StaffClass and AnimalClass
// to store the pets and staff members created;
// Instantiate the QueueGenerator class to create queues for the pets 
// of which each veterinarian is reponsible for;
// Create and add to a Map the vets and the queue of animals they are responsible for;
// Show the user the options to run the application and gets its input;
public class CLI {
	// ArrayList used to hold only the pets names;
	ArrayList<String> petNames = new ArrayList<String>();

	// Instances of the Factory classes;
	MedFactory myMedFactory = new MedFactory();
	AdmFactory myAdmFactory = new AdmFactory();
	AnimalFactory myPetFactory = new AnimalFactory();

	// ArrayLists of StaffClass used to hold the Staff members information;
	ArrayList<StaffClass> allStaffList = new ArrayList<StaffClass>();
	ArrayList<StaffClass> vetList = new ArrayList<StaffClass>();
	ArrayList<StaffClass> nurseList = new ArrayList<StaffClass>();
	ArrayList<StaffClass> treineeList = new ArrayList<StaffClass>();
	ArrayList<StaffClass> recepList = new ArrayList<StaffClass>();
	ArrayList<StaffClass> ITList = new ArrayList<StaffClass>();

	// ArrayLists of AnimalClass used to hold the pets information;
	ArrayList<AnimalClass> allPetList = new ArrayList<AnimalClass>();
	ArrayList<AnimalClass> dogList = new ArrayList<AnimalClass>();
	ArrayList<AnimalClass> catList = new ArrayList<AnimalClass>();
	ArrayList<AnimalClass> rabbitList = new ArrayList<AnimalClass>();

	// Instances of the class QueueGenerator, used to create queues for the animals;
	QueueGenerator animalQueue1 = new QueueGenerator(200);
	QueueGenerator animalQueue2 = new QueueGenerator(200);
	QueueGenerator animalQueue3 = new QueueGenerator(200);
	QueueGenerator animalQueue4 = new QueueGenerator(200);
	QueueGenerator animalQueue5 = new QueueGenerator(200);

	// ArrayLists of string used to hold a list of the animals which each vet is
	// responsible for;
	ArrayList<String> vetQueue1 = new ArrayList<String>();
	ArrayList<String> vetQueue2 = new ArrayList<String>();
	ArrayList<String> vetQueue3 = new ArrayList<String>();
	ArrayList<String> vetQueue4 = new ArrayList<String>();
	ArrayList<String> vetQueue5 = new ArrayList<String>();

	// Map to hold vets as key and the queue of animals as values;
	Map<String, QueueGenerator> petQueueOrderedMap = new HashMap<String, QueueGenerator>();
	// This map holds the arraylist with the animals each vet is responsible;
	Map<String, ArrayList<String>> petQueueUnorderedMap = new HashMap<String, ArrayList<String>>();

	// Array to hold the option that the user have to run the app;
	String[] options = { "List of all staff", "List of all staff by categories",
			"List of all Admin staff performing a certain task", "Search for a specific member of staff by name",
			"List of all animals", "List of animals by various types", "Search for a specific animal by name",
			"List of all the animals assigned to a member of medical staff",
			"List of the order in which pets will be looked after by a particular member of the medical staff",
			"For a given member of the medical staff, pass to the next pet" };
	// Array with the different occupations of the staff members;
	String[] staffCategories = { "Veterinarian", "Nurse", "Treinee", "IT Technician", "Receptionist" };
	// Array with the different animal types in the system;
	String[] animalTypes = { "Dog", "Cat", "Rabbit" };
	// Array with the possible tasks being ran by the adm staff;
	String[] tasks = { "On Holidays", "Filling", "Answering Phone", "Checking Schedules", "Installing Software",
			"Cleaning PC", "Doing nothing" };

	// Constructor of the class;
	public CLI() {
		// Calling the instances of the factory classes and running them to create the
		// staff;
		// Adding the staff member created to their respective arraylist;
		vetList.addAll(myMedFactory.createVetStaff());

		nurseList.addAll(myMedFactory.createNurseStaff());

		treineeList.addAll(myMedFactory.createTreineeStaff());

		recepList.addAll(myAdmFactory.createRecepStaff());

		ITList.addAll(myAdmFactory.createITStaff());

		// adding every staff created to the arraylist that holds all the staff members;
		allStaffList.addAll(vetList);
		allStaffList.addAll(nurseList);
		allStaffList.addAll(treineeList);
		allStaffList.addAll(recepList);
		allStaffList.addAll(ITList);

		// Calling the instances of the AnimalFactory class and running them to create
		// the animals;
		// Adding each animal created to their respective arraylist;
		dogList.addAll(myPetFactory.createDogs());

		catList.addAll(myPetFactory.createCats());

		rabbitList.addAll(myPetFactory.createRabbits());

		// adding every animal created to the arraylist that holds all animals;
		allPetList.addAll(dogList);
		allPetList.addAll(catList);
		allPetList.addAll(rabbitList);

		// Loop is running the instances of the QueueGenerator class to create
		// a queue with 200 animals from the arraylist 'allPetList';
		// Adding 200 animals from the 'allPetList' to the arraylist 'vetQueue';
		// The loop starts in +200 every time so never the same animals are
		// added to the same list or queue twice;
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

		// Getting a vet name from the 'vetList' and adding them to the map
		// 'petQueueOrderedMap' as value, together with the queues 'animalQueue'
		// inserted as value;
		petQueueOrderedMap.put(vetList.get(0).getName(), animalQueue1);
		petQueueOrderedMap.put(vetList.get(1).getName(), animalQueue2);
		petQueueOrderedMap.put(vetList.get(2).getName(), animalQueue3);
		petQueueOrderedMap.put(vetList.get(3).getName(), animalQueue4);
		petQueueOrderedMap.put(vetList.get(4).getName(), animalQueue5);

		// inserting the 'vetQueue' arraylist as value to the 'petQueueUnorderedMap'
		// and the vets names as keys;
		petQueueUnorderedMap.put(vetList.get(0).getName(), vetQueue1);
		petQueueUnorderedMap.put(vetList.get(1).getName(), vetQueue2);
		petQueueUnorderedMap.put(vetList.get(2).getName(), vetQueue3);
		petQueueUnorderedMap.put(vetList.get(3).getName(), vetQueue4);
		petQueueUnorderedMap.put(vetList.get(4).getName(), vetQueue5);

		// running the method 'selectOptions()';
		selectOptions();

	}

	// Method responsible for presenting the user with 11 options to run
	// 'displayOptions()';
	// Gets the user input 'userOptionInput()' as a number from (0-10);
	// Numbers 1-10 run different methods in the app, number 0 stops the app;
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

	// Method gets the options from the 'options' array, and print them;
	public void displayOptions() {
		System.out.println("Select one option for the system to run: ");
		for (int i = 0; i < options.length; i++) {
			System.out.println("Press " + (i + 1) + " to " + options[i] + ".");
		}
		System.out.println("Press 0 to exit.");
	}

	// Method uses BufferedReader to read the user input;
	// Gets the input and returns it as an option to run the methods;
	public int userOptionInput() {
		BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in));
		String optionString = null;
		int option = -1;

		// try-catch used to get any exception from the users type;
		try {

			optionString = myReader.readLine();
			option = Integer.parseInt(optionString);

		} catch (IOException | NumberFormatException e) {
			System.out.println("Thats is not a valid option (type from 0 to " + options.length + ".");
		}
		// Method returns the number inserted by the user;
		return option;
	}

	// Method uses BufferedReader to read the user input;
	// Returns the user input for the name (used for animal or staff seach);
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

	// Method uses BufferedReader to read the user input;
	// Returns the user input for the task (used to get the adm staff running that
	// particular task);
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

	// Method uses BufferedReader to read the user input;
	// Gets the input and returns the staff categorie selected by the user;
	// (used to get the list of staff members from a particular occupation;
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

	// Method uses BufferedReader to read the user input;
	// Gets the input and returns the animal type selected by the user;
	// (used to get the list of animals from that particular type;
	public int userAnimalTypeInput() {
		BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in));
		String optionString = null;
		int option = -1;

		try {

			optionString = myReader.readLine();
			option = Integer.parseInt(optionString);

		} catch (IOException | NumberFormatException e) {
			System.out.println("That is not a valid option (type from 0 to " + animalTypes.length + ".)");
		}
		return option;
	}

	// Methods used to check if the options entered by the user are valid;
	// Option is only valid from 0-10;
	private boolean validOption(int option) {
		return option >= 0 && option <= 10;
	}

	// Categories options valid from 0-5;
	private boolean validCategorieOption(int categorie) {
		return categorie >= 0 && categorie <= 5;
	}

	// Animal type options valid from 0-3;
	private boolean validAnimalTypeOption(int animalType) {
		return animalType >= 0 && animalType <= 3;
	}

	// Method responsible for removing the first animal of a selected veterinarian
	// queue,
	// and showing which is the next on the line;
	private void passNextPet() {
		String name = null;
		// Print the list of vets, so the user has to choose one;
		System.out.println("The Veterinarians responsibles for the animal care are: ");
		for (StaffClass cs : vetList) {

			System.out.println(cs.toString());

		}
		System.out.println("Type the name of one of them to pass to the next pet on the queue (type 'exit' to exit): ");
		// gets the input from 'userNameInput()' method;
		name = userNameInput();
		// If the user types 'exit' the method stops and returns to the options menu;
		// If the 'name' typed is present in the map with the vets name as key,
		// the method removes the first animal in the queue and print the next;
		// If name is incorrect starts the method again;
		if (name.equalsIgnoreCase("exit")) {
			selectOptions();
		} else if (petQueueOrderedMap.containsKey(name)) {
			System.out.println("The next animal in " + name + " list is: ");
			petQueueOrderedMap.get(name).removeFromQueue();

		} else {
			System.out.println("Name is incorrect, try it again. The name is case sensitive, it has to be identical.");
			listAnimalCare();
		}

	}

	// Method responsible for showing the queue order of a selected vet;
	private void listAnimalCareOrder() {
		String name = null;
		// Prints the list of vets to the user;
		System.out.println("The Veterinarians responsibles for the animal care are: ");
		for (StaffClass cs : vetList) {

			System.out.println(cs.toString());

		}
		System.out.println(
				"Type the name of one of them to check which animals they are responsible for (type 'exit' to exit): ");
		name = userNameInput();
		// If the user types 'exit' the method stops and returns to the options menu;
		// If the 'name' typed is present in the map with the vets name as key,
		// the method prints the queue inside the map 'petQueueOrderedMap';
		// If name is incorrect starts the method again;
		if (name.equalsIgnoreCase("exit")) {
			selectOptions();
		} else if (petQueueOrderedMap.containsKey(name)) {
			System.out.println("The order of the queue for " + name + " is: ");
			petQueueOrderedMap.get(name).display();

		} else {
			System.out.println("Name is incorrect, try it again. The name is case sensitive, it has to be identical.");
			listAnimalCare();
		}
	}

	// Method responsible for showing the list of animals in responsibility of a
	// selected vet;
	private void listAnimalCare() {
		String name = null;
		// Prints the list of vets to the user;
		System.out.println("The Veterinarians responsibles for the animal care are: ");
		for (StaffClass cs : vetList) {

			System.out.println(cs.toString());

		}
		System.out.println(
				"Type the name of one of them to check which animals they are responsible for (type 'exit' to exit): ");
		name = userNameInput();
		// If the user types 'exit' the method stops and returns to the options menu;
		// If the 'name' typed is present in the map with the vets name as key,
		// the method prints the arraylist inside the map 'petQueueUnorderedMap';
		// If name is incorrect starts the method again;
		if (name.equalsIgnoreCase("exit")) {
			selectOptions();
		} else if (petQueueUnorderedMap.containsKey(name)) {
			System.out.println("The vet " + name + " is reponsible for: ");
			for (int i = 0; i < vetQueue1.size(); i++) {
				System.out.println(petQueueUnorderedMap.get(name).get(i).toString());
			}
		} else {
			System.out.println("Name is incorrect, try it again. The name is case sensitive, it has to be identical.");
			listAnimalCare();
		}
	}

	// Method responsible for showing the list of animals of a input name;
	private void searchAnimalName() {
		System.out.println("Type name, or type 'exit' to exit: ");
		String target = userNameInput();
		// Reads the user input for the animal name 'userNameInput()';
		// If user input 'exit', goes back to the option's menu;
		// Adds the names of the pets inside 'allPetList' to the 'petNames' list;
		if (target.equalsIgnoreCase("exit")) {
			selectOptions();
		} else {
			for (AnimalClass cs : allPetList) {
				petNames.add(cs.getName());

			}
			// Initiate the searchAnimal method, sending the name input as 'target' and the
			// 'petNames' list as parameters;
			ArrayList<Integer> position = searchAnimal(target, petNames);
			// Gets the return of the method as 'position', and checks if the list returned
			// has positive indexes;
			// If it has indexes, a for loop gets every index inside 'position' list, send
			// the index to get the pet information from 'allPetList';
			// Prints all the result in lines;
			if (position.contains(-1)) {
				System.out.println("Not there.");
				searchAnimalName();
			} else {
				for (int i = 0; i < position.size(); i++) {
					int index = position.get(i);
					System.out.println(allPetList.get(index).toString());
				}

			}
		}
	}

	// Method responsible for printing the animals of a particular type entered by
	// the user;
	private void listAllAnimalsTypes() {
		// Initial value for animalType = -1;
		int animalType = -1;
		// Loops keeps going until user types 0;
		do {
			// Inside loop keeps going until the input is valid (0-3);
			// Prints the animals type from the 'animalTypes' array;
			do {
				System.out.println("Select a animal type: ");
				for (int i = 0; i < animalTypes.length; i++) {
					System.out.println("Press " + (i + 1) + " to " + animalTypes[i] + ".");
				}
				System.out.println("Press 0 to exit.");
				// Reads user input as animalType;
				animalType = userAnimalTypeInput();
				// If not valid prints a invalid option message;
				if (!validAnimalTypeOption(animalType)) {
					System.out.println("Invalid option.");
				}
			} while (!validAnimalTypeOption(animalType));

			// Checks for which input user entered, and prints the respective list of
			// animals using a for loop that
			// goes throught the particar animal list ('dogList',
			// 'catList, or 'rabbitList')
			// and prints each animal according to the toString()
			// method inside the 'AnimalClass';
			if (animalType == 1) {
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
			} else if (animalType == 3) {
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
		selectOptions();
	}

	// Method responsible for printing every animal in the system;
	private void listAllAnimals() {
		// The for loop goes throught the 'allPetList' and prints each animal according
		// to the toString() method inside the 'AnimalClass';
		System.out.println("The current list of animals in the system is: ");
		System.out.println(" ");
		for (AnimalClass cs : allPetList) {

			System.out.println(cs.toString());

		}
		System.out.println(" ");
		System.out.println("Number total: " + allPetList.size());
		System.out.println(" ");
		System.out.println("*********************************************************");
		// goes back to the options menu after printing the animals;
		selectOptions();
	}

	private void searchStaffName() {
		// Reads the user input for the staff name 'userNameInput()';
		// If user input 'exit', goes back to the option's menu;
		System.out.println("Type name, or type 'exit' to exit: ");
		String target = userNameInput();
		if (target.equalsIgnoreCase("exit")) {
			selectOptions();
		} else {
			// Initiate the searchStaff method, sending the name input as 'target' and the
			// 'allStaffList' list as parameters;
			int position = searchStaff(target, allStaffList);
			// Gets the return of the method as 'position', and checks if the method
			// returned-1 (means that the name is not in the list)
			// or returned the index where the name is;
			// If it has index, prints the staff member that is in the same index of the
			// 'allStaffList';
			if (position == -1) {
				System.out.println("Not there");
				searchStaffName();
			} else {
				System.out.println(allStaffList.get(position).toString());
			}
		}
	}

	// Method responsible for printing the staff member who is running a certain
	// task (entered by the user);
	private void listAdminStaffTask() {
		// ArrayList to hold the names of the staff members running a particular task;
		ArrayList<String> AdmTaskNames;
		String task = null;
		System.out.println(
				"Type in one of the tasks to see which member of the ADM Staff is running it, type 'exit' to exit: ");
		// Running the instance of the AdmFactory 'myAdmFactory' to get the taskMap from
		// the class;
		Map<String, String> taskMap = myAdmFactory.getAdmTask();
		System.out.println("Tasks being ran currently: ");
		// Print the values inside the 'taskMap' - the tasks being ran;
		System.out.println(taskMap.values());
		// Reads the input of the user 'userTaskInput()';
		task = userTaskInput();
		// If user types 'exit' goes back to the options menu;
		if (task.equalsIgnoreCase("EXIT")) {
			selectOptions();
		} else {
			// checks if the task entered by the user is inside the map;
			// If it is, it runs the getKey method, sending the 'taskMap' map and 'task' as
			// parameters;
			if (taskMap.containsValue(task)) {
				AdmTaskNames = getKey(taskMap, task);
				// It gets the list of names returned by the getKey() method;
				// The for loop goes throught the 'AdmTaskNames' list;
				// A string variable 'name' gets the value of each name in the list and runs the
				// searchStaff() method to search for the staff name;
				// It prints the names found;
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
				// If user input is not equal to the tasks being ran, returns the method;
				System.out.println("Type another task.");
				listAdminStaffTask();
			}
			// Runs the method again (until user types 'exit');
			listAdminStaffTask();
		}
	}

	// Method responsible for printing the staff members of a particular occupation
	// (entered by the user);
	private void listAllStaffCategorie() {
		// Initial value for categorie = -1;
		int categorie = -1;
		// Loops keeps going until user types 0;
		do {
			// Loops keeps going until categorie selected is valid;
			do {
				// Prints the categories inside the 'staffCategories' array, so the user has to
				// select one of them;
				System.out.println("Select a categorie: ");
				for (int i = 0; i < staffCategories.length; i++) {
					System.out.println("Press " + (i + 1) + " to " + staffCategories[i] + ".");
				}
				System.out.println("Press 0 to exit.");

				categorie = userCategorieInput();
				// Reads user input 'userCategorieInput()';
			} while (!validCategorieOption(categorie));
			// Checks for which option the user has input;
			// Prints the staff members of the selected categorie, going throught the
			// particular list (vetList, nurseList, treineeList, recepList, ITList) and
			// printing the staff member according to the toString() method inside
			// 'StaffClass';
			if (categorie == 1) {
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
			} else if (categorie == 5) {
				System.out.println("The current Receptionists in the Staff are: ");
				for (StaffClass cs : recepList) {

					System.out.println(cs.toString());

				}
				System.out.println("Number total: " + recepList.size());
				System.out.println("*********************************************************");
				listAllStaffCategorie();
			}
		} while (categorie != 0);
		selectOptions();
	}

	// Method responsible for printing every staff member;
	public void listAllStaff() {
		System.out.println("The current list of names in the Staff is: ");
		// The for loop goes throught the 'allStaffList' and prints each staff member
		// according to the toString() method inside the 'StaffClass';
		for (StaffClass cs : allStaffList) {

			System.out.println(cs.toString());

		}
		System.out.println("Number total: " + allStaffList.size());
		System.out.println("*********************************************************");
		selectOptions();
	}

	// Method responsible for searching the staff name in the StaffClass list sent
	// as parameter;
	public static int searchStaff(String name, List<StaffClass> list) {
		// Initial value of boolean variable 'found';
		boolean found = false;
		// index value i=0, so the search starts from the index 0 of the arraylist;
		int i = 0;
		// Loop keeps going until variable found = true, and the index 'i' gets to the
		// end of the 'list';
		do {
			// If the list 'list' has the name sent in the parameter 'name', it returns the
			// index 'i';
			if (list.get(i).getName().equalsIgnoreCase(name)) {
				found = true;
				return i;
			}
			// Sum the index 'i' so the loops goes throught the entire 'list';
			i++;
		} while (!found && i < list.size());
		// Returns -1 if nothing is found;
		return -1;
	}

	// Method responsible for searching the animal name in the petName list sent
	// as parameter;
	public static ArrayList<Integer> searchAnimal(String name, List<String> list) {
		// index value i=0, so the search starts from the index 0 of the arraylist;
		int i = 0;
		// ArrayList of integers to hold the indexes of all names found, necessary
		// because it will be duplicates;
		ArrayList<Integer> indexArray = new ArrayList<Integer>();
		// Loop keeps going until the index 'i' gets to the
		// end of the 'list';
		do {
			// If the list 'list' has the name sent in the parameter 'name', it adds the
			// index 'i' to the 'indexArray';
			if (list.get(i).equalsIgnoreCase(name)) {
				indexArray.add(i);
			}
			// Sum the index 'i' so the loops goes throught the entire 'list';
			i++;
		} while (i < list.size());
		// If nothing is found, it adds a value -1 to the arraylist;
		if (indexArray.size() == 0) {
			indexArray.add(-1);
			return indexArray;
		}
		// Returns the array with all the indexes found;
		return indexArray;
	}

	public static <Key, Value> ArrayList<String> getKey(Map<Key, Value> map, Value task) {
		// ArrayList to hold the list of names (key of the 'map' parameter) of staff
		// members that are running the particular task ('task' parameter);
		ArrayList<String> listNameTasks = new ArrayList<String>();

		// for loop goes throught the 'map' to check if the it has the 'task' as a
		// value, if it has adds the key (staff name) linked to that value to the
		// 'listNameTasks' list;
		for (Key key : map.keySet()) {
			if (task.equals(map.get(key))) {
				listNameTasks.add((String) key);
			}
		}
		// If 'listNameTasks' is empty after the loop, means that no one is running that
		// task;
		if (listNameTasks.size() == 0) {
			return null;
		}
		// Method returns the 'listNameTasks';
		return listNameTasks;
	}

}
