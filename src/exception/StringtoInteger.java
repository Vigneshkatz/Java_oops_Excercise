package exception;
import java.util.*;

public class StringtoInteger {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String str =s.next();
		try {
			int i = Integer.parseInt(str);
			System.out.println("Sucessfully parsed the string "+str+" to Integer "+i);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
			System.out.println(e.getMessage());
		}

	}

}
