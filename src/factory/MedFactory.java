package factory;

import java.util.ArrayList;

import main.StaffClass;
import medicalStaff.*;

public class MedFactory {

	ArrayList<StaffClass> vetStaff = new ArrayList<StaffClass>();
	ArrayList<StaffClass> nurseStaff = new ArrayList<StaffClass>();
	ArrayList<StaffClass> treineeStaff = new ArrayList<StaffClass>();

	NameGenerator myNG = new NameGenerator();
	int salary = 1000;

	public ArrayList<StaffClass> createVetStaff() {

		for (int i = 0; i < 5; i++) {

			ArrayList<String> listStaffName = myNG.getRandomName();
			int staffNumber = myNG.getStaffNumberMed();

			String staffName = listStaffName.get(i);

			StaffClass someVet = new Vet(staffName, staffNumber, salary);

			vetStaff.add(someVet);

		}
		return vetStaff;
	}

	public ArrayList<StaffClass> createNurseStaff() {

		for (int i = 5; i < 21; i++) {

			ArrayList<String> listStaffName = myNG.getRandomName();
			int staffNumber = myNG.getStaffNumberMed();

			String staffName = listStaffName.get(i);

			StaffClass someNurse = new Nurse(staffName, staffNumber, salary);

			nurseStaff.add(someNurse);

		}
		return nurseStaff;
	}

	public ArrayList<StaffClass> createTreineeStaff() {

		for (int i = 21; i < 30; i++) {

			ArrayList<String> listStaffName = myNG.getRandomName();
			int staffNumber = myNG.getStaffNumberMed();

			String staffName = listStaffName.get(i);

			StaffClass someTreinee = new Treinee(staffName, staffNumber, salary);

			treineeStaff.add(someTreinee);

		}
		return treineeStaff;

	}


}
