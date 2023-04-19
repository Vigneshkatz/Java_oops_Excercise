/*
 Write a Java program to create a class called "Circle" with a radius attribute. You can access and modify this attribute. Calculate the area and circumference of the circle
*/
class Circle{
	int radius;
	public Circle(){
	}
	public Circle(int radius){
	this.radius = radius;
	}
	public double area(){
	return 2*3.14*this.radius*this.radius;
	}
	public double circumference(){
		return (2*3.14*this.radius);
	}	
}
class Excercise3{
	public static void main(String[] args){
		Circle c = new Circle();
		c.radius = 4;
		System.out.println("radius is "+c.area());
		System.out.println("circumference is "+c.circumference());
		}
	}
