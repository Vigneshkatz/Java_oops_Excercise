package oops;

public class E5employee extends E5person{
	/*Create a file Person.java and define the class Person in it.
	 *  Another file Emplyee.java should contain the class Employee which is a subclass of the Person class.
	 *   The file TestEmployee.java should contain the class TestEmployee. 
	 *   It defines the main() method. 
	 *   The person class contains a data member – name. 
	 *   The following attributes are there in the Employee class – salary, joining_year, and insurance_number.
	 *    Define the appropriate constructors in both classes. 
	 *   Also, define the setter, and getter methods.
	 *  Finally, display the employee details in the main() method.
	 * */
	private E5person person;
	private int salary;
	private int joining_year;
	private int issurance_number;
	public E5employee() {
		
	}
	public E5employee(int salary, int joining_year, int issurance_number) {
		this.salary = salary;
		this.joining_year = joining_year;
		this.issurance_number = issurance_number;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getJoining_year() {
		return joining_year;
	}
	public void setJoining_year(int joining_year) {
		this.joining_year = joining_year;
	}
	public int getIssurance_number() {
		return issurance_number;
	}
	public void setIssurance_number(int issurance_number) {
		this.issurance_number = issurance_number;
	}
	public void setPerson(E5person person) {
		this.person = person;
		
	}
	public void getEmpDetails() {
		System.out.println("Name : "+this.person.getName());
		System.out.println("Joining year : "+this.joining_year);
		System.out.println("emp insurance number: "+this.issurance_number);
		System.out.println("Salary : "+this.salary);
	}
}
