package basic;

public class operators {
	
	public static void main(String[] args)
	{
		int a = 5;
		int b = 10;
		arithimetic(a,b);
		unary(a,b);
		relational(a,b);
		shift(a,b);
		bitwise(a,b);
	}

	private static void bitwise(int a, int b) {
		
		System.out.println(a & b);
		System.out.println(a | b);
		System.out.println(a ^ b);
		System.out.println(~a+" "+~b);
		System.out.println("========================================================");
	}

	private static void shift(int a, int b) {
		System.out.println(a<<b);
		System.out.println(a>>b);
		System.out.println("========================================================");
		
		
	}

	private static void relational(int a, int b) {
		
		System.out.println(a < b);
		System.out.println(a > b);
		System.out.println(a <= b);
		System.out.println(a >= b);
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println("========================================================");
	}

	private static void unary(int a, int b) {
		
		System.out.println(a++);
		System.out.println(a--);
		System.out.println("========================================================");
		
	}

	private static void arithimetic(int a, int b) {
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		System.out.println("========================================================");
		
	}

}
