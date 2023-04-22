package oops;

class accessInstanceVariableOrMethod{
	private int x;
	void setX(int x)
	{
		this.x = x;
	}
	public static void printX()
	{
//		System.out.println(x);
	}
}
class OverridingSuperclass{
	public static void print()
	{
		System.out.println("In superClass");
	}
	
}
class OverridingSubclass extends OverridingSuperclass
{
	public static void print()
	{
		System.out.println("In Subclass");
	}
}
public class StaticMethodLimitation {

	public static void main(String[] args) {
		
		OverridingSubclass subclass = new OverridingSubclass();
		OverridingSuperclass superclass = new OverridingSuperclass();
		subclass.print();
		superclass.print();

	}

}
