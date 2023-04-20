package recursion;

public class factorial {

	public static int factorial(int n)
	{
		if(n < 0)
		{
			System.out.println("Enter an non negative value");
			return 0;
		}
		if(n == 0 )
		{
			return 1;
		}
		return n * factorial(n-1);
	}
	public static void main(String[] args) {
		
		int n =-5;
		System.out.println(factorial(n));

	}

}
