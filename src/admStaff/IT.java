package admStaff;

import interfaces.*;
import main.StaffClass;

public class IT extends StaffClass implements AdmStaff {


	public IT() {
		
	}

	public IT(String name, int staffNumber, int salary) {
		super(name, staffNumber, salary);
		this.name = name;
		this.staffNumber = staffNumber;
		this.salary = salary;		
	}

	@Override
	public void Task(String task) {
		
		System.out.println("Your task is:" + task);
		
	}


}
