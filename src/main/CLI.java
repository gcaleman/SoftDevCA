package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import factory.*;

public class CLI {

	ArrayList<String> petNames = new ArrayList<String>();
	ArrayList<String> petQueue1 = new ArrayList<String>();

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

	QueueGenerator animalQueue1 = new QueueGenerator(allPetList.size() / 3);
	QueueGenerator animalQueue2 = new QueueGenerator(allPetList.size() / 3);
	QueueGenerator animalQueue3 = new QueueGenerator(allPetList.size() / 3);

	String[] options = { "List of all staff", "List of all staff by categories",
			"List of all Admin staff performing a certain task", "Search for a specific member of staff by name",
			"List of all animals", "List of animals by various types", "Search for a specific animal by name",
			"List of all the animals assigned to a member of medical staff",
			"List of the order in which pets will be looked after by a particular member of the medical staff",
			"For a given member of the medical staff, pass to the next pet" };
	String[] staffCategories = { "Veterinarian", "Nurse", "Treinee", "IT Technician", "Receptionist" };
	String[] animalTypes = { "Dog", "Cat", "Rabbit" };
	String[] tasks = { "" };

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
			} else {
				passNextPet();
			}

		} while (option != 0);
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
			System.out.println("Thats is not a valid option (type from 0 to " + animalTypes.length + ".");
		}
		return option;
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
		// TODO Auto-generated method stub

	}

	private void listAnimalCareOrder() {
		// TODO Auto-generated method stub

	}

	private void listAnimalCare() {
		// TODO Auto-generated method stub

	}

	private void searchAnimalName() {
		// TODO Auto-generated method stub

	}

	private void listAllAnimalsTypes() {
		int animalType = -1;

		do {
			do {
				System.out.println("Select a categorie: ");
				for (int i = 0; i < staffCategories.length; i++) {
					System.out.println("Press " + (i + 1) + " to " + staffCategories[i] + ".");
				}
				System.out.println("Press 0 to exit.");

				animalType = userAnimalTypeInput();
			} while (!validAnimalTypeOption(animalType));

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
		selectOptions();
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
		// TODO Auto-generated method stub

	}

	private void listAdminStaffTask() {
		// TODO Auto-generated method stub

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
			}
			else if (categorie == 1) {
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

	public static int SearchStaff(String target, List<StaffClass> pool) {

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

	public static ArrayList<Integer> SearchAnimal(String target, List<String> pool) {

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

	public static <K, V> ArrayList<String> getKey(Map<K, V> map, V value) {

		ArrayList<String> listNameTasks = new ArrayList<String>();

		for (K key : map.keySet()) {
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
