package admStaff;

import interfaces.*;
import main.StaffClass;

public class IT extends StaffClass implements AdmStaff {

	protected String task;

	public IT() {

	}

	public IT(String name, int staffNumber, int salary, String occupation) {
		super(name, staffNumber, salary, occupation);
		this.name = name;
		this.staffNumber = staffNumber;
		this.salary = salary;
		this.occupation = occupation;
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
		System.out.println("Current task is:" + this.task);

	}

}
