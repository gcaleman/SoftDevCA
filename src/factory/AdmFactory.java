package factory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import admStaff.*;
import main.StaffClass;

public class AdmFactory {

	ArrayList<StaffClass> recepStaff = new ArrayList<StaffClass>();
	ArrayList<StaffClass> ITStaff = new ArrayList<StaffClass>();
	Map<String, String> taskMap = new HashMap<String, String>();

	NameGenerator myNG = new NameGenerator();

	int salary2 = 350;
	int salary3 = 380;

	public ArrayList<StaffClass> createRecepStaff() {
		String occupation = "Receptionist";
		for (int i = 0; i < 5; i++) {

			ArrayList<String> listStaffName = myNG.getRandomName();
			int staffNumber = myNG.getStaffNumberAdm();

			String staffName = listStaffName.get(i);

			StaffClass someRecep = new Receptionist(staffName, staffNumber, salary3, occupation);

			recepStaff.add(someRecep);
			taskMap.put(someRecep.getName(), myNG.getRandomReceptionistTask());

		}
		return recepStaff;
	}

	public ArrayList<StaffClass> createITStaff() {
		String occupation = "IT Techinician";
		for (int i = 5; i < 10; i++) {

			ArrayList<String> listStaffName = myNG.getRandomName();
			int staffNumber = myNG.getStaffNumberAdm();

			String staffName = listStaffName.get(i);

			StaffClass someIT = new IT(staffName, staffNumber, salary2, occupation);

			ITStaff.add(someIT);
			taskMap.put(someIT.getName(), myNG.getRandomItTask());
		}
		return ITStaff;
	}

	public Map<String, String> getAdmTask() {
		return taskMap;
	}

}
