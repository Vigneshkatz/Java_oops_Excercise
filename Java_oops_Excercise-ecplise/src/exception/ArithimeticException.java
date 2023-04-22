package exception;
import java.util.*;
public class ArithimeticException {

	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		try {
			int c = a/b;
			System.out.println("Your answer is "+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		

	}

}
