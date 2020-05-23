package medicalStaff;

import main.StaffClass;

//Class responsible for encapsulating the attributes for Vets;
//Extends the abstract class 'StaffClass';
public class Vet extends StaffClass {

	public Vet() {

	}

	// Contructor of the class;
	// Receives the attributes name, staffNumber, salary and occupation from
	// 'MedFactory' class;
	public Vet(String name, int staffNumber, int salary, String occupation) {
		super(name, staffNumber, salary, occupation);
		this.name = name;
		this.staffNumber = staffNumber;
		this.salary = salary;
		this.occupation = occupation;
	}

}
