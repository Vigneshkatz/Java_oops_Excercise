package exception;

import java.util.*;

public class InputMismatchException {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int sum = 0;
		try {
		for(int i = 1 ; i <= 5;i++)
		{
			int n = s.nextInt();
			
			sum+=n;
			
		}
		double ave = sum/5;
		
		System.out.println(ave);
		}
		
		catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a proper integer number.");
            s.nextLine(); // clear the scanner buffer
        }
		catch(Exception e)
		{
			System.out.println("Invalid Integer. Please enter a proper integer number.");
		}
		
	}
}
