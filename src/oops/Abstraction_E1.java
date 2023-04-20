package oops;
/*Create an abstract class "Shape" that has an abstract method "calculateArea()".
 *  Create two subclasses "Rectangle" and 
 * "Circle" that extend "Shape" and implement the "calculateArea()" method.*/
abstract class Shape{
	abstract double calculateArea();
}

class Rectangle extends Shape{
	int length;
	int breath;
	double calculateArea() {
		return this.length*this.breath;
	}
}
class Circle extends Shape{
	int radius;
	
	double calculateArea() {
		return 2 * Math.PI * this.radius;
	}
}

public class Abstraction_E1 {

	public static void main(String[] args) {
		
		Rectangle rec = new Rectangle();
		Circle cir = new Circle();
		rec.breath=9;
		rec.length=5;
		cir.radius=5;
		System.out.println(rec.calculateArea());
		System.out.printf("%5f",cir.calculateArea());

	}

}
