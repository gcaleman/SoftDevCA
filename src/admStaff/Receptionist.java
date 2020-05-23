package admStaff;

import main.StaffClass;

// Class responsible for encapsulating the attributes for Receptionists;
//Extends the abstract class 'StaffClass';
public class Receptionist extends StaffClass {
	// Attribute to hold the task which the receptionist is responsible for;
	protected String task;

	public Receptionist() {

	}

	// Contructor of the class;
	// Receives the attributes name, staffNumber, salary and occupation from
	// 'AdmFactory' class;
	public Receptionist(String name, int staffNumber, int salary, String occupation) {
		super(name, staffNumber, salary, occupation);
		this.name = name;
		this.staffNumber = staffNumber;
		this.salary = salary;
		this.occupation = occupation;
	}

	// Setter and Getter for task;
	// Return the task which was sent to the receptionist created;
	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

}
