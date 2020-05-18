package medicalStaff;

import java.util.ArrayList;

import interfaces.*;
import main.AnimalClass;
import main.StaffClass;

public class Vet extends StaffClass implements MedicalStaff {

	protected ArrayList<AnimalClass> vetAnimals = new ArrayList<AnimalClass>();
	
	public Vet() {
		
	}
	
	public Vet(String name, int staffNumber, int salary) {
		this.name = name;
		this.staffNumber = staffNumber;
		this.salary = salary;	
	}
	
//	public void addAnimal(String name, int age, String illness) {
//		
//	}
	
	@Override
	public void treatAnimal() {
		System.out.println("Animal X is being treated.");
		
	}

}
