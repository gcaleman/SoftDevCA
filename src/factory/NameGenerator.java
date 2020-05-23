package factory;

import java.util.ArrayList;
import java.util.Random;

// Class responsible for generating random names, staff number and tasks;
public class NameGenerator {

	// Array of strings with 'some' different first names for Staff Members;
	protected String[] firstNames = { "James", "John", "Robert", "Michael", "William", "David", "Richard", "Joseph",
			"Thomas", "Charles", "Christopher", "Daniel", "Matthew", "Anthony", "Donald", "Mark", "Paul", "Steven",
			"Andrew", "Kenneth", "Joshua", "George", "Kevin", "Brian", "Edward", "Ronald", "Timothy", "Jason", "Emily",
			"Michelle", "Carol", "Amanda", "Melissa", "Deborah", "Stephanie", "Rebecca", "Laura", "Sharon", "Cynthia",
			"Charles" };

	// Array of strings with 'some' different surnames for Staff Members;
	protected String[] surnames = { "Smith", "Brown", "Wilson", "Thomson", "Robertson", "Campbell", "Stewart",
			"Anderson", "Macdonald", "Scott", "Reid", "Murray", "Taylor", "Clark", "Mitchell", "Ross", "Walker",
			"Paterson", "Young", "Watson", "Morrison", "Miller", "Fraser", "Davidson", "Gray", "Mcdonald", "Henderson",
			"Mcmillan", "Mcintosh", "Milne", "Munro", "Ritchie", "Dickson", "Bruce", "King", "Crawford", "Docherty",
			"Millar", "Cunningham", "Sinclair", "Williamson" };

	// Array of strings with some different tasks for receptionists;
	protected String[] receptionistTasks = { "On Holidays", "Filling", "Answering Phone", "Checking Schedules",
			"Doing nothing" };
	// Array of strings with some different tasks for IT techinicians;
	protected String[] ItTasks = { "Installing Software", "Cleaning PC", "On Holidays", "Doing nothing" };

	// variable for starting staff number for medical staff;
	protected int currentStaffNumberMed = 2019000;
	// variable for starting staff number for administrative staff;
	protected int currentStaffNumberAdm = 2019030;

	// class constructor
	public NameGenerator() {

	}

	// Method responsible for generating a list with random full names for staff;
	public ArrayList<String> getRandomName() {
		// ArrayList of strings to hold the random full names;
		ArrayList<String> nameList = new ArrayList<String>();
		// Instance of the class 'Random';
		Random r = new Random();

		// loop gets 40 first names from a random positions from the array of first
		// names 'firstNames',
		// and 40 surnames from 'surnames' list, putting them together;
		for (int i = 0; i < 40; i++) {

			String fname = firstNames[r.nextInt(firstNames.length)];
			String sname = surnames[r.nextInt(surnames.length)];
			String fullname = fname + " " + sname;

			// loop used to avoid fullname duplicates;
			do {
				fname = firstNames[r.nextInt(firstNames.length)];
				sname = surnames[r.nextInt(surnames.length)];
				fullname = fname + " " + sname;
			} while (nameList.contains(fullname));
			// add the fullname to the 'nameList' arraylist;
			nameList.add(fullname);

		}
		// Method returns the list 'nameList';
		return (nameList);

	}

	// Method responsible for generating a different staff number to each medical
	// staff member;
	public int staffNumberMed() {

		this.currentStaffNumberMed++;
		return this.currentStaffNumberMed;

	}

	// Method returns gets the staff number generated for medical staff and returns
	// it;
	public int getStaffNumberMed() {

		int nextNumber;
		nextNumber = staffNumberMed();
		return nextNumber;

	}

	// Method responsible for generating a different staff number to each adm staff
	// member;
	public int staffNumberAdm() {
		this.currentStaffNumberAdm++;
		return this.currentStaffNumberAdm;

	}

	// Method returns gets the staff number generated for adm staff and returns it;
	public int getStaffNumberAdm() {

		int nextNumber;
		nextNumber = staffNumberAdm();
		return nextNumber;

	}
	// Method generates a random task from the receptionistTasks array, and returns it;
	public String getRandomReceptionistTask() {

		Random r = new Random();

		String taskName = receptionistTasks[r.nextInt(receptionistTasks.length)];

		return (taskName);

	}
	// Method generates a random task from the ItTasks array, and returns it;
	public String getRandomItTask() {

		Random r = new Random();

		String taskName = ItTasks[r.nextInt(ItTasks.length)];

		return (taskName);

	}
}
