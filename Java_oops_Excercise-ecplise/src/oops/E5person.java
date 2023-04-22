package oops;

public class E5person {
	/*Create a file Person.java and define the class Person in it.
	 *  Another file Emplyee.java should contain the class Employee which is a subclass of the Person class.
	 *   The file TestEmployee.java should contain the class TestEmployee. 
	 *   It defines the main() method. 
	 *   The person class contains a data member – name. 
	 *   The following attributes are there in the Employee class – salary, joining_year, and insurance_number. Define the appropriate constructors in both classes. 
	 *   Also, define the setter, and getter methods.
	 *  Finally, display the employee details in the main() method.
	 * */
	private String name;
	public E5person() {
		
	}
	public E5person(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return this.name;
	}

}
