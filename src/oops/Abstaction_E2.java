package oops;

/*Create an interface "Animal" with an abstract method "makeSound()".
 *  Create two classes "Dog" and "Cat" that implement the "Animal" interface
 *   and provide their own implementation for the "makeSound()" method.*/
interface Animal{
	void makeSound() ;
}
class Dog implements Animal{
	
		 public void makeSound() {
			System.out.println("Woof!");
		}
	
}
class Cat implements Animal{
	public void makeSound() {
		System.out.println("Meaw!");
	}
}
public class Abstaction_E2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
