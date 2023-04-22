package generics;

public class E4_imp {
/*Finally, write a main method that creates two Pair objects, one with type parameters Integer and String,
 *  and the other with type parameters Double and Character. 
 *  Initialize the values of the instance variables in each Pair object, 
 *  print out their values,
 *  call the swap method to swap their values, and print out their values again to verify that the swap was successful.*/
	public static void main(String[] args) {
		System.out.println("Hello");
		Generic_E4<Integer,String> obj1 = new Generic_E4<>(1,"hello");
		System.out.println("hello");
		Generic_E4<Double,Character> obj2 = new Generic_E4<>(1.0,'h');
		obj1.getFirst();
		Generic_E4<Double,Integer> obj3 = new Generic_E4<>();
		obj1.typeClass();
		System.out.println("hello");
	}

}
