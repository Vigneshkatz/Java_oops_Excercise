package generics;
import java.util.*;
public class E3_imp {
	public static void main() {
		System.out.println("Hello world");
	}
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		Double[] arr = new Double[5];
		for(int i = 0; i < arr.length;i++)
		{
			arr[i]= s.nextDouble();
		}
		Generic_E3<Double> e = new Generic_E3<>();
		e.printarray(arr);
		
		main();
		printArray(arr);
	}
	public static <T>void printArray(T[] arr)
	{
		for(T i:arr)
		{
			System.out.println(i);
		}
	}
	
}
