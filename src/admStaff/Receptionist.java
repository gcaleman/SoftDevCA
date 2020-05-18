package admStaff;

import interfaces.*;
import main.StaffClass;

public class Receptionist extends StaffClass implements AdmStaff {
	
	protected String task;

	public Receptionist() {
		
	}
	
	public Receptionist(String name, int staffNumber, int salary) {
		super(name, staffNumber, salary);
		this.name = name;
		this.staffNumber = staffNumber;
		this.salary = salary;		
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	@Override
	public void Task(String task) {
		this.task = task;
		System.out.println("Your task is:" + this.task);
		
	}
	
}
