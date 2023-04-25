package oops;

class accessInstanceVariableOrMethod{
	int x;
	static int j = 0;
	void setX(int x)
	{
		this.x = x;
	}
	public static void printX()
	{
//		System.out.println(x);
	}
	public static void printJ(){
		System.out.println(j);
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
