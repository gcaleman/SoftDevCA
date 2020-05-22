package factory;

import java.util.ArrayList;
import java.util.Random;

public class NameGenerator {

	protected String[] firstNames = { "James", "John", "Robert", "Michael", "William", "David", "Richard", "Joseph",
			"Thomas", "Charles", "Christopher", "Daniel", "Matthew", "Anthony", "Donald", "Mark", "Paul", "Steven",
			"Andrew", "Kenneth", "Joshua", "George", "Kevin", "Brian", "Edward", "Ronald", "Timothy", "Jason", "Emily",
			"Michelle", "Carol", "Amanda", "Melissa", "Deborah", "Stephanie", "Rebecca", "Laura", "Sharon", "Cynthia",
			"Charles" };

	protected String[] surnames = { "Smith", "Brown", "Wilson", "Thomson", "Robertson", "Campbell", "Stewart",
			"Anderson", "Macdonald", "Scott", "Reid", "Murray", "Taylor", "Clark", "Mitchell", "Ross", "Walker",
			"Paterson", "Young", "Watson", "Morrison", "Miller", "Fraser", "Davidson", "Gray", "Mcdonald", "Henderson",
			"Mcmillan", "Mcintosh", "Milne", "Munro", "Ritchie", "Dickson", "Bruce", "King", "Crawford", "Docherty",
			"Millar", "Cunningham", "Sinclair", "Williamson" };

	protected String[] receptionistTasks = { "On Holidays", "Filling", "Answering Phone", "Checking Schedules",
			"Doing nothing" };
	protected String[] ItTasks = { "Installing Software", "Cleaning PC", "On Holidays", "Doing nothing" };

	protected int currentStaffNumberMed = 2019000;
	protected int currentStaffNumberAdm = 2019030;

	public NameGenerator() {

	}

	public ArrayList<String> getRandomName() {
		ArrayList<String> nameList = new ArrayList<String>();
		Random r = new Random();

		// pick a firstname and surname based on length of array

		for (int i = 0; i < 40; i++) {

			String fname = firstNames[r.nextInt(firstNames.length)];
			String sname = surnames[r.nextInt(surnames.length)];
			String fullname = fname + " " + sname;

			do {
				fname = firstNames[r.nextInt(firstNames.length)];
				sname = surnames[r.nextInt(surnames.length)];
				fullname = fname + " " + sname;
			} while (nameList.contains(fullname));

			nameList.add(fullname);

		}

		return (nameList);

	}

	public int staffNumberMed() {

		this.currentStaffNumberMed++;
		return this.currentStaffNumberMed;

	}

	public int getStaffNumberMed() {

		int nextNumber;
		nextNumber = staffNumberMed();
		return nextNumber;

	}

	public int staffNumberAdm() {
		this.currentStaffNumberAdm++;
		return this.currentStaffNumberAdm;

	}

	public int getStaffNumberAdm() {

		int nextNumber;
		nextNumber = staffNumberAdm();
		return nextNumber;

	}

	public String getRandomReceptionistTask() {

		Random r = new Random();

		String taskName = receptionistTasks[r.nextInt(receptionistTasks.length)];

		return (taskName);

	}

	public String getRandomItTask() {

		Random r = new Random();

		String taskName = ItTasks[r.nextInt(ItTasks.length)];

		return (taskName);

	}
}
