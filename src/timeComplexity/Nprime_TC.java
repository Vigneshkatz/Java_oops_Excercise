package timeComplexity;
import java.util.*;

public class Nprime_TC {

	public static void main(String[] args) {
	
		System.out.println("Enter a number");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if(checkPrime(n))
		{
			System.out.println("The number is prime");
		}else {
			System.out.println("The number is not a prime");
		}

	}

	private static boolean checkPrime(int n) {
//		the time complexity is that the loop runs till n/2 time to check weather the number is prime or not so O(n/2)
		for(int i= 2;i<=Math.sqrt(n);i++)
		{
			if(n%i == 0)
			{
				return false;
			}
		}
		return true;
		
	}

}
