package oops;

public class E4myclass {
	/*Define a class called Animal containing the two methods named eat(), and sleep(). 
	 * Also, create another class Bird, which is a subclass of the Animal class that inherits the methods of the Animal class. 
	 * The Bird class defines a method fly(). 
	 * Another class MyClass contains the main() method that creates the objects of the above two classes. 
	 * Call the different methods of each class using these objects.
	 * */
	public static void main(String[] args)
	{
		E4animal animal = new E4animal();
		E4bird bird = new E4bird();
		animal.eat();
		animal.sleep();
		bird.fly();
		bird.eat();
		bird.sleep();
	}

}
