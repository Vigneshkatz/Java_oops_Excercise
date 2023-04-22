package oops;
/*Create an abstract class "BankAccount" that has two abstract methods "deposit()" and "withdraw()". 
 * Create two subclasses "SavingsAccount" and "CheckingAccount" that extend "BankAccount" and implement the "deposit()"
 *  and "withdraw()" methods.*/

abstract class BankAccount{
	void deposit() {
		System.out.println("Amount deposited");
	}
	void withdraw() {
		System.out.println("Amount withdrawn");
	}
}
class SavingAccount extends BankAccount{
	void withdraw() {
		System.out.println("Cannot be withdrawn form SavingAccount");
	}
}
class CheckingAccount extends BankAccount{
	
}


public class Abstraction_E5 {

	public static void main(String[] args) {
		

		BankAccount saving = new SavingAccount();
		BankAccount current = new CheckingAccount();
		saving.deposit();
		saving.withdraw();
		current.deposit();
		current.withdraw();
		
	}

}
