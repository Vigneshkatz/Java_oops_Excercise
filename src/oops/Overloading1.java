package oops;

public class Overloading1 
{
	public static void main(String[] args)
	{
		int a = add(5,6);
		add(5f,6);
		System.out.println(a);
		
	}

	private static int add(int i, int j) {
		return i+j;
	}
	static void add(float a,int b)
	{
		System.out.println(a+b);
	}
}
