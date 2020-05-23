package admStaff;

import main.StaffClass;

// Class responsible for encapsulating the attributes for IT technicians;
//Extends the abstract class 'StaffClass';
public class IT extends StaffClass {
	// Attribute to hold the task which the IT staff is responsible for;
	protected String task;

	public IT() {

	}

	// Contructor of the class;
	// Receives the attributes name, staffNumber, salary and occupation from
	// 'AdmFactory' class;
	public IT(String name, int staffNumber, int salary, String occupation) {
		super(name, staffNumber, salary, occupation);
		this.name = name;
		this.staffNumber = staffNumber;
		this.salary = salary;
		this.occupation = occupation;
	}

	// Setter and Getter for task;
	// Return the task which was sent to the IT technician created;
	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

}
