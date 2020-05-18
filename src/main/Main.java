package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import factory.*;

public class Main {

	public static void main(String[] args) {

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

		ArrayList<AnimalClass> allPetList = new ArrayList<AnimalClass>();
		ArrayList<AnimalClass> dogList = new ArrayList<AnimalClass>();
		ArrayList<AnimalClass> catList = new ArrayList<AnimalClass>();
		ArrayList<AnimalClass> rabbitList = new ArrayList<AnimalClass>();

		dogList.addAll(myPetFactory.createDogs());

		catList.addAll(myPetFactory.createCats());

		rabbitList.addAll(myPetFactory.createRabbits());

		allPetList.addAll(dogList);
		allPetList.addAll(catList);
		allPetList.addAll(rabbitList);

		QueueGenerator animalQueue1 = new QueueGenerator(allPetList.size()/3);
		QueueGenerator animalQueue2 = new QueueGenerator(allPetList.size()/3);
		QueueGenerator animalQueue3 = new QueueGenerator(allPetList.size()/3);
		
		for (int i = 0; i < allPetList.size()/3; i++) {
			String input = allPetList.get(i).getName();
			
			animalQueue1.insertToQueue(input);
			petQueue1.add(i, input);
		}
			animalQueue1.removeFromQueue();
			animalQueue1.removeFromQueue();
		
//		Trying to create a map with staffname as value and index as key;
//		Map<String, Integer> convertedMap = new HashMap<String, Integer>();
//
//		for (int i = 0; i < allPetList.size(); i++) {
//			int index = i;
//			AnimalClass model = allPetList.get(i);
//
//			convertedMap.put(model.getName(), index);
//		}

		
//		Transfering pet names from allPetList to petNames (as a string)
//		for (int i = 0; i < allPetList.size(); i++) {
//
//			petNames.add(i, allPetList.get(i).getName());
//
//			System.out.println(petNames.get(i));
//
//		}

//		System.out.println("The current list of names in the Staff is: ");
//		for (StaffClass cs : allStaffList) {
//
//			System.out.println(cs.toString());
//
//		}
//		System.out.println("Number total: " + allStaffList.size());
//		System.out.println("*********************************************************");
//
//		String target = "James Smith";
//
//		int position3 = linearSearch(target, allStaffList);
//		if (position3 == -1) {
//			System.out.println("Not there");
//		} else {
//			System.out.println(allStaffList.get(position3).toString());
//		}

//		System.out.println("The current Veterinarians in the Staff are: ");
//		for (StaffClass cs : vetList) {
//
//			System.out.println(cs.toString());
//
//		}
//		System.out.println("Number total: " + vetList.size());
//		System.out.println("*********************************************************");
//		System.out.println("The current Nurses in the Staff are: ");
//		for (StaffClass cs : nurseList) {
//			System.out.println(cs.toString());
//
//		}
//		System.out.println("Number total: " + nurseList.size());
//		System.out.println("*********************************************************");
//		System.out.println("The current Treinees in the Staff are: ");
//		for (StaffClass cs : treineeList) {
//
//			System.out.println(cs.toString());
//
//		}
//		System.out.println("Number total: " + treineeList.size());
//		System.out.println("*********************************************************");
//		System.out.println("The current Receptionists in the Staff are: ");
//		for (StaffClass cs : recepList) {
//
//			System.out.println(cs.toString());
//
//		}
//		System.out.println("Number total: " + recepList.size());
//		System.out.println("*********************************************************");
//		System.out.println("The current IT professionals in the Staff are: ");
//		for (StaffClass cs : ITList) {
//
//			System.out.println(cs.toString());
//
//		}
//		System.out.println("Number total: " + ITList.size());
//		System.out.println("*********************************************************");

//		System.out.println(" ");
//		System.out.println("The current list of animals in the system is: ");
//		System.out.println(" ");
//		for (AnimalClass cs : allPetList) {
//
//			System.out.println(cs.toString());
//
//		}
//		System.out.println(" ");
//		System.out.println("Number total: " + allPetList.size());
//		System.out.println(" ");
//		System.out.println("*********************************************************");
//		System.out.println(" ");
//		System.out.println("The current list of dogs in the system is: ");
//		System.out.println(" ");
//		for (AnimalClass cs : dogList) {
//
//			System.out.println(cs.toString());
//
//		}
//		System.out.println(" ");
//		System.out.println("Number total: " + dogList.size());
//		System.out.println(" ");
//		System.out.println("*********************************************************");
//		System.out.println(" ");
//		System.out.println("The current list of cats in the system is: ");
//		System.out.println(" ");
//		for (AnimalClass cs : catList) {
//
//			System.out.println(cs.toString());
//
//		}
//		System.out.println(" ");
//		System.out.println("Number total: " + catList.size());
//		System.out.println(" ");
//		System.out.println("*********************************************************");
//		System.out.println(" ");
//		System.out.println("The current list of rabbits in the system is: ");
//		System.out.println(" ");
//		for (AnimalClass cs : rabbitList) {
//
//			System.out.println(cs.toString());
//
//		}
//		System.out.println(" ");
//		System.out.println("Number total: " + rabbitList.size());
//		System.out.println(" ");
//		System.out.println("*********************************************************");

//		for (AnimalClass cs : allPetList) {
//
//			petNames.add(cs.getName());
//
//		}

		
//		Linear search working for animal names, getting the duplicates
//		String target = "Aero";
//
//		System.out.println("Linear Search Animal");
//		ArrayList<Integer> position2 = linearSearchAnimal(target, petNames);
//		if (position2.contains(-1)) {
//			System.out.println("Not there");
//		} else {
//			for (int i = 0; i < position2.size(); i++) {
//				int index = position2.get(i);
//				System.out.println(allPetList.get(index).toString());
//			}
//
//		}
		
//		Getting all adm staff name, staff number and salary, according to task
//		Map<String, String> taskMap = myAdmFactory.getAdmTask(); 
//		
//		String searchTask = "On Holiday";
//		
//		if(taskMap.containsValue(searchTask)) {
//			ArrayList<String> AdmTaskNames = getKey(taskMap, searchTask);
//			
//			for (int i = 0; i < AdmTaskNames.size(); i++) {
//				String name = AdmTaskNames.get(i);
//				int position2 = linearSearchStaff(name, allStaffList);
//				if (position2 == -1) {
//					System.out.println("Not there");
//				} else {					
//						int index = position2;
//						System.out.println(allStaffList.get(index).toString());					
//			}
//			
//		}
//		
//			
//	}
	}

//		System.out.println("Binary Search");
//		int position2 = binarySearch(target.toUpperCase(), petNames);
//		if (position2 == -1) {
//			System.out.println("Not there");
//		} else {
//			System.out.println(allPetList.get(position2).toString());
//		}
//
//	}

	public static int linearSearchStaff(String target, List<StaffClass> pool) {

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

	public static ArrayList<Integer> linearSearchAnimal(String target, List<String> pool) {

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

//	public static int binarySearch(String target, List<String> pool) {
//
//		int low = 0;
//		int high = pool.size();
//		int mid = 0;
//
//		// THis is the condition to stop the search
//		while (low < high) {
//
//			mid = (high + low) / 2;
//			System.out.println("low: " + low + " high: " + high + " mid: " + mid + " value: " + pool.get(mid));
//
//			if (pool.get(mid).equalsIgnoreCase(target)) {
//				return mid;
//			} else if (pool.get(mid).compareTo(target) < 0) {
//				low = mid + 1;
//
//			} else if (pool.get(mid).compareTo(target) > 0) {
//				high = mid - 1;
//			}
//
//		}
//
//		return -1;
//	}

//	public static ArrayList<Integer> binarySearch(String target, List<String> pool) {
//
//		int min = 0;
//		int max = pool.size() - 1;
//		int mid = 0;
//		ArrayList<Integer> indexArray = new ArrayList<Integer>();
//		ArrayList<Integer> findIndex = new ArrayList<Integer>();
//
//		// THis is the condition to stop the search
//
//		while (min <= max) {
//			mid = (min + max) / 2;
//			if (pool.get(mid).compareTo(target) < 0) {
//				min = mid + 1;
//			} else if (pool.get(mid).compareTo(target) > 0) {
//				max = mid - 1;
//			} else {
//				findIndex.add(mid);
//			}
//		}
//		if (findIndex.size() == 0) {
//			indexArray.add(-1);
//			return indexArray;
//		}
//		return findIndex;
//	}
	
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