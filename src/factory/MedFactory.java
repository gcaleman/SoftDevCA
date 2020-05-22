package factory;

import java.util.ArrayList;

import main.StaffClass;
import medicalStaff.*;

public class MedFactory {

	ArrayList<StaffClass> vetStaff = new ArrayList<StaffClass>();
	ArrayList<StaffClass> nurseStaff = new ArrayList<StaffClass>();
	ArrayList<StaffClass> treineeStaff = new ArrayList<StaffClass>();

	NameGenerator myNG = new NameGenerator();
	int salary1 = 250;
	int salary4 = 420;
	int salary5 = 500;

	public ArrayList<StaffClass> createVetStaff() {
		String occupation = "Veterinarian";
		for (int i = 0; i < 5; i++) {

			ArrayList<String> listStaffName = myNG.getRandomName();
			int staffNumber = myNG.getStaffNumberMed();

			String staffName = listStaffName.get(i);

			StaffClass someVet = new Vet(staffName, staffNumber, salary5, occupation);

			vetStaff.add(someVet);

		}
		return vetStaff;
	}

	public ArrayList<StaffClass> createNurseStaff() {
		String occupation = "Nurse";
		for (int i = 5; i < 21; i++) {

			ArrayList<String> listStaffName = myNG.getRandomName();
			int staffNumber = myNG.getStaffNumberMed();

			String staffName = listStaffName.get(i);

			StaffClass someNurse = new Nurse(staffName, staffNumber, salary4, occupation);

			nurseStaff.add(someNurse);

		}
		return nurseStaff;
	}

	public ArrayList<StaffClass> createTreineeStaff() {
		String occupation = "Treinee";
		for (int i = 21; i < 30; i++) {

			ArrayList<String> listStaffName = myNG.getRandomName();
			int staffNumber = myNG.getStaffNumberMed();

			String staffName = listStaffName.get(i);

			StaffClass someTreinee = new Treinee(staffName, staffNumber, salary1, occupation);

			treineeStaff.add(someTreinee);

		}
		return treineeStaff;

	}

}
