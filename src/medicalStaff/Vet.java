package medicalStaff;

import java.util.ArrayList;

import interfaces.*;
import main.AnimalClass;
import main.StaffClass;

public class Vet extends StaffClass {

	protected ArrayList<AnimalClass> vetAnimals = new ArrayList<AnimalClass>();

	public Vet() {

	}

	public Vet(String name, int staffNumber, int salary, String occupation) {
		super(name, staffNumber, salary, occupation);
		this.name = name;
		this.staffNumber = staffNumber;
		this.salary = salary;
		this.occupation = occupation;
	}

//	public void addAnimal(String name, int age, String illness) {
//		
//	}

}
