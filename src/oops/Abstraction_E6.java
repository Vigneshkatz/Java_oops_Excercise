
package oops;

/*Create an abstract class "Employee" with two instance variables "name" and "salary".
 *  Create two subclasses "Manager" and "Clerk" that extend the "Employee" class and provide their own implementation 
 *  for a method "calculateSalary()" that calculates their respective salaries.*/

abstract class Employee{
	int name;
	int salary;
}
class Manager extends Employee{
	int calculateSalary() {
		return salary *12;
	}
}
class Clerk extends Employee{
	int calculateSalary() {
		return salary *2;
	}
}


public class Abstraction_E6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
