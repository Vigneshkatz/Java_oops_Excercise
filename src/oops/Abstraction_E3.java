package oops;
/*Create an abstract class "Vehicle" that has two abstract methods "start()" and "stop()". 
 * Create two subclasses "Car" and "Motorcycle" that extend "Vehicle" 
 * and implement the "start()" and "stop()" methods.*/
abstract class Vehicle{
	abstract void start();
	abstract void stop();
}
class Car extends Vehicle{
	
	void start() {
		System.out.println("Your car is started!");
	}
	void stop() {
		System.out.println("Your car is Stopped");
	}
}
class Motorcycle extends Vehicle{
	void start() {
		System.out.println("Your Motorcycle is started!");
	}
	void stop() {
		System.out.println("Your Motorcycle is Stopped");
	}
}
public class Abstraction_E3 {

}
