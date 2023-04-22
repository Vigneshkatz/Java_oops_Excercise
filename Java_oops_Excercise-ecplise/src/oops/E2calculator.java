package oops;
import java.util.*;

public class E2calculator {
	public static Scanner s = new Scanner(System.in);
	public E2calculator() {
		System.out.println("choose a function");
		System.out.println("1 for addition");
		System.out.println("2 for substraction");
		System.out.println("3 for division");
		System.out.println("4 for multiplication");
		System.out.println("5 for power");
		
		int n = s.nextInt();
		switch(n)
		{
		case 1:
			add();
			break;
		case 2:
			sub();
			break;
		case 3:
			div();
			break;
		case 4:
			mul();
			break;
		case 5:
			pow();
			break;
		default:
			System.out.println(" function not matched");
			break;
		}
		
	}

	public static void add() {
		System.out.println("Enter the value a and b");
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.printf("the addition of "+a+" and "+b+" is "+ (a+b));
		
		
	}

	public static void sub() {
		System.out.println("Enter the value a and b");
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.printf("the substraction of "+a+" and "+b+" is "+ (a-b));
		
	}

	public void div() {
		System.out.println("Enter the value a and b");
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.printf("the division of "+a+" and "+b+" is "+(a/b));// TODO Auto-generated method stub
		
	}

	public void mul() {
		
		System.out.println("Enter the value a and b");
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.printf("the multiplication of "+a+" and "+b+" is "+(a*b));
		
	}

	public static void pow() {
		System.out.println("Enter the value a and b");
		int a = s.nextInt();
		int b = s.nextInt();
		while(b > 0)
		{
			a*=a;
		}
		System.out.println("the value is "+a);
		
		
	}
}
