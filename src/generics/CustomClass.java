package generics;
import java.lang.*;
public class CustomClass<T extends Number> {

		T a;
		T b;
		
		CustomClass(T a, T b)
		{
			this.a=a;
			this.b=b;
		}
		void add()
		{
			System.out.println(a.doubleValue()+b.doubleValue());
		}
}
