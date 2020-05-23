package factory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import admStaff.*;
import main.StaffClass;

// Class responsible for creating the ADM Staff (IT and Receptionist),
// populating an arraylist with each respective occupation, and
// create a task map, giving random tasks to each member of the ADM Staff.
public class AdmFactory {
	// ArrayLists instances of StaffClass class for receptionist and IT staffs, and
	// a
	// Map to hold the member of the staff name as key and the task
	// they are responsible for as value;
	ArrayList<StaffClass> recepStaff = new ArrayList<StaffClass>();
	ArrayList<StaffClass> ITStaff = new ArrayList<StaffClass>();
	Map<String, String> taskMap = new HashMap<String, String>();

	// Instance of the class NameGenerator;
	// Used to get random names, staff number and tasks;
	NameGenerator myNG = new NameGenerator();

	// variables for salary level;
	int salary2 = 350;
	int salary3 = 380;

	// Method responsible for creating receptionist staff;
	public ArrayList<StaffClass> createRecepStaff() {
		// variable for occupation;
		String occupation = "Receptionist";
		// for loop gets 5 random names, staff numbers and tasks from NameGenerator
		// class,
		// and creates 5 receptionists using the Receptionist class, adding them
		// to 'recepStaff' list and 'taskMap' map;
		for (int i = 0; i < 5; i++) {

			ArrayList<String> listStaffName = myNG.getRandomName();
			int staffNumber = myNG.getStaffNumberAdm();

			String staffName = listStaffName.get(i);

			StaffClass someRecep = new Receptionist(staffName, staffNumber, salary3, occupation);

			recepStaff.add(someRecep);
			taskMap.put(someRecep.getName(), myNG.getRandomReceptionistTask());

		}
		// Method returns the 'recepStaff' list;
		return recepStaff;
	}

	// Method responsible for creating IT staff;
	public ArrayList<StaffClass> createITStaff() {
		String occupation = "IT Technician";
		// for loop gets 5 random names, staff numbers and tasks from NameGenerator
		// class, (starting from i = 5 so it doesn't get the same staff number as
		// receptionists),
		// and creates 5 IT technicians using the IT class, adding them
		// to 'ITStaff' list and 'taskMap' map;
		for (int i = 5; i < 10; i++) {

			ArrayList<String> listStaffName = myNG.getRandomName();
			int staffNumber = myNG.getStaffNumberAdm();

			String staffName = listStaffName.get(i);

			StaffClass someIT = new IT(staffName, staffNumber, salary2, occupation);

			ITStaff.add(someIT);
			taskMap.put(someIT.getName(), myNG.getRandomItTask());
		}
		// Method returns 'ITStaff' list;
		return ITStaff;
	}

	// Method reponsible for sending the 'taskMap' map;
	public Map<String, String> getAdmTask() {
		return taskMap;
	}

}
