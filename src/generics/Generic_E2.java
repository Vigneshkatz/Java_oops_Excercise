package generics;

/*Create a generic class called Pair that takes two type parameters, T and U, to represent a pair of values. The class should have the following methods:

Pair(T first, U second): a constructor that takes a value of type T and a value of type U and initializes the corresponding fields.
T getFirst(): a method that returns the first value of the pair.
U getSecond(): a method that returns the second value of the pair.
void setFirst(T first): a method that sets the first value of the pair to a new value of type T.
void setSecond(U second): a method that sets the second value of the pair to a new value of type U.*/

public class Generic_E2 <T,U>{
	private T first;
	private U second;
	T getFirst() {
		return first;
	}
	U getSecond() {
		return second;
	}
	void setFirst(T first)
	{
		this.first = first;
	}
	void setSecond(U second)
	{
		this.second= second;
	}
	

}
