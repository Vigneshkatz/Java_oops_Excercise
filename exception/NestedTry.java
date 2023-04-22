package exception;

import java.util.Scanner;

class NestedTry{

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String c = s.next();
        try{
            int i = Integer.parseInt(c);
            try{
                System.out.print(i/0);
            }catch (ArithmeticException e)
            {
                System.out.println(e);
            }
        }catch(NumberFormatException e)
        {
            System.out.println(e);
        }
    }
}