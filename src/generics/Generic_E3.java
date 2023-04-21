package generics;

/*Create a generic method called printArray 
 * that takes an array of type T 
 * and prints each element of the array on a new line.
 *  The method should have the following signature:*/
public class Generic_E3 <T>{
	
	void printarray(T[] arr)
	
	{
		for(T i: arr)
		{
			System.out.println(i);
		}
	}
}
