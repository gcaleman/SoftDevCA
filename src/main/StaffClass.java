package main;

//Abstract class responsible for providing the attributes and methods 
//for the subclasses in the packages 'admStaff' and 'medicalStaff';
public abstract class StaffClass {

	protected String name;
	protected int staffNumber;
	protected int salary;
	protected String occupation;

	public StaffClass(String name, int staffNumber, int salary, String occupation) {
		this.name = name;
		this.staffNumber = staffNumber;
		this.salary = salary;
		this.occupation = occupation;
	}

	public StaffClass() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStaffNumber() {
		return staffNumber;
	}

	public void setStaffNumber(int staffNumber) {
		this.staffNumber = staffNumber;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	// Method responsible for returning a String type of answer to the objects of
	// the class;
	@Override
	public String toString() {

		return "Name: " + this.name + " - Staff Number: " + this.staffNumber + " - Weekly Salary: " + this.salary
				+ " - Occupation: " + this.occupation;
	}

}
