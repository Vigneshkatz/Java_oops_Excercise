package generics;

/*Create a generic class called Pair that has two type parameters T and U.
 *  The class should have two private instance variables of type T and U, respectively,
 *   and a constructor that takes two arguments of type T and U, respectively, 
 *  and initializes the instance variables. 
 * The class should also have getter and setter methods for both instance variables.
 * Next, create a generic method called swap that takes two Pair objects as arguments and swaps their values.
 *  The method should have the signature public static <T, U> void swap(Pair<T, U> p1, Pair<T, U> p2). 
 * The method should swap the values of the instance variables in the two Pair objects.*/
public class Generic_E4 <T,U>{
	
	private T first;
	private U second;
	public Generic_E4(){
	}
	public Generic_E4(T first,U second)
	{
		this.first=first;
		this.second=second;
	}
	
	 public T getFirst() {
		return first;
	}


	public void setFirst(T first) {
		this.first = first;
	}


	public U getSecond() {
		return second;
	}


	public void setSecond(U second) {
		this.second = second;
	}
	public void typeClass()
	{
		System.out.println(first.getClass());
		System.out.println(second.getClass());
	}

	public static <T, U> void swap(Generic_E4<T, U> p1, Generic_E4<T, U> p2) {
	        T tempFirst = p1.getFirst();
	        U tempSecond = p1.getSecond();
	        p1.setFirst(p2.getFirst());
	        p1.setSecond(p2.getSecond());
	        p2.setFirst(tempFirst);
	        p2.setSecond(tempSecond);
	    }

}
