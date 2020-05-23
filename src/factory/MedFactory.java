package factory;

import java.util.ArrayList;

import main.StaffClass;
import medicalStaff.*;

//Class responsible for creating the Medical Staff (Vet, Nurse and Treinee);
public class MedFactory {

	// ArrayLists instances of StaffClass class for vets, nurses and treinee staff;
	ArrayList<StaffClass> vetStaff = new ArrayList<StaffClass>();
	ArrayList<StaffClass> nurseStaff = new ArrayList<StaffClass>();
	ArrayList<StaffClass> treineeStaff = new ArrayList<StaffClass>();

	// Instance of the class NameGenerator;
	// Used to get random names and staff number;
	NameGenerator myNG = new NameGenerator();

	// variables for salary level;
	int salary1 = 250;
	int salary4 = 420;
	int salary5 = 500;

	// Method responsible for creating veterinarians;
	public ArrayList<StaffClass> createVetStaff() {
		// variable for occupation;
		String occupation = "Veterinarian";
		// for loop gets 5 random names and staff numbers from NameGenerator
		// class,
		// and creates 5 vets using the Vet class, adding them
		// to 'vetStaff' list
		for (int i = 0; i < 5; i++) {

			ArrayList<String> listStaffName = myNG.getRandomName();
			int staffNumber = myNG.getStaffNumberMed();

			String staffName = listStaffName.get(i);

			StaffClass someVet = new Vet(staffName, staffNumber, salary5, occupation);

			vetStaff.add(someVet);

		}
		// Method returns the 'vetStaff' list;
		return vetStaff;
	}

	// Method responsible for creating receptionist staff;
	public ArrayList<StaffClass> createNurseStaff() {
		// variable for occupation;
		String occupation = "Nurse";
		// for loop gets 16 random names and staff numbers from NameGenerator
		// class, (starting from i=5 so it doesn't get the same staff number from vets)
		// and creates 16 nurses using the Nurse class, adding them
		// to 'nurseStaff' list
		for (int i = 5; i < 21; i++) {

			ArrayList<String> listStaffName = myNG.getRandomName();
			int staffNumber = myNG.getStaffNumberMed();

			String staffName = listStaffName.get(i);

			StaffClass someNurse = new Nurse(staffName, staffNumber, salary4, occupation);

			nurseStaff.add(someNurse);

		}
		// Method returns the 'nurseStaff' list;
		return nurseStaff;
	}

	// Method responsible for creating receptionist staff;
	public ArrayList<StaffClass> createTreineeStaff() {
		// variable for occupation;
		String occupation = "Treinee";
		// for loop gets 9 random names and staff numbers from NameGenerator
		// class, (starting from i=21 so it doesn't get the same staff number from vets
		// or nurses),
		// and creates 9 treinee using the Treinee class, adding them
		// to 'treineeStaff' list
		for (int i = 21; i < 30; i++) {

			ArrayList<String> listStaffName = myNG.getRandomName();
			int staffNumber = myNG.getStaffNumberMed();

			String staffName = listStaffName.get(i);

			StaffClass someTreinee = new Treinee(staffName, staffNumber, salary1, occupation);

			treineeStaff.add(someTreinee);

		}
		// Method returns the 'treineeStaff' list;
		return treineeStaff;

	}

}
