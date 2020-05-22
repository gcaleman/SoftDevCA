package medicalStaff;

import interfaces.*;
import main.StaffClass;

public class Treinee extends StaffClass {

	public Treinee() {

	}

	public Treinee(String name, int staffNumber, int salary, String occupation) {
		super(name, staffNumber, salary, occupation);
		this.name = name;
		this.staffNumber = staffNumber;
		this.salary = salary;
		this.occupation = occupation;
	}

}
