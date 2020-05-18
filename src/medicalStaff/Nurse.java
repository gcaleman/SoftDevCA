package medicalStaff;

import interfaces.*;
import main.StaffClass;

public class Nurse extends StaffClass implements MedicalStaff {
	
	public Nurse() {
		
	}

	public Nurse(String name, int staffNumber, int salary) {
		super(name, staffNumber, salary);
		this.name = name;
		this.staffNumber = staffNumber;
		this.salary = salary;		
	}

	@Override
	public void treatAnimal() {
		// TODO Auto-generated method stub
		
	}


}