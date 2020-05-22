package medicalStaff;

import interfaces.*;
import main.StaffClass;

public class Nurse extends StaffClass {

	public Nurse() {

	}

	public Nurse(String name, int staffNumber, int salary, String occupation) {
		super(name, staffNumber, salary, occupation);
		this.name = name;
		this.staffNumber = staffNumber;
		this.salary = salary;
		this.occupation = occupation;
	}

}
