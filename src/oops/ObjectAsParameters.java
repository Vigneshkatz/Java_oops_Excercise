package oops;

class ParameterObject
{
	int a;
	int b;
	ParameterObject(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	
	boolean compareObject(ParameterObject obj)
	{
		if(this.a==obj.a && this.b == obj.b)
		{
			return true;
		}
		return false;
	}
	
	
}
public class ObjectAsParameters {

	
	public static void main(String[] args) {
		
		ParameterObject a = new ParameterObject(5,6);
		ParameterObject b = new ParameterObject(7,10);
		ParameterObject c = new ParameterObject(5,6);
		System.out.println(b.compareObject(c));
		System.out.println(a.compareObject(c));
		
	}

}
