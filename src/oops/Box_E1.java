package oops;

public class Box_E1 {
	
	int width,height,depth;
	
	public Box_E1() {
		System.out.println("Box is created now enter the properties");
	}
	
	public Box_E1(int width, int height, int depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}


	public int volume()
	{
		if(width == 0)
		{
			System.out.println("Enter width");
			return -1;
		}
		else if(height == 0)
		{
			System.out.println("Enter height");
			return -1;
		}
		else if(depth ==0)
		{
			System.out.println("Enter depth");
			return -1;
		}
		return (width * height * depth);
	}
	
}
