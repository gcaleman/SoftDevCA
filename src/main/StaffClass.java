package main;

public abstract class StaffClass {

	protected String name;
	protected int staffNumber;
	protected int salary;

	public StaffClass(String name, int staffNumber, int salary) {
		this.name = name;
		this.staffNumber = staffNumber;
		this.salary = salary;
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
	
	@Override
	public String toString() {
		
		return "Name: " + this.name + " - Staff Number: " + this.staffNumber + " - Salary: " + this.salary;
	}
	
}
