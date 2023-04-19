/*
Write a Java program to create a class called "Rectangle" 
with width and height attributes. 
Calculate the area and perimeter of the rectangle.*/

class Rectangle{
	
	int height;
	int width;
	
	public Rectangle(int height,int width){
	this.height = height;
	this.width = width;
	}
	
	public double area(){
	return this.height * this.width;
	}
	public double perimeter(){
	return 2 *(this.height +this.width);
	}

}

class Excercise4{
	public static void main(String[] args){
		Rectangle re = new Rectangle(4,5);
		System.out.println(re.area()+" is the area");
		System.out.println(re.perimeter()+" is the perimeter");
		}
	}
		
