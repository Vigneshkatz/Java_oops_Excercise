package exception;

import java.io.*;

public class Buffer {
	public static void main(String[] args) throws IOException
	{
		
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(reader);
//		System.out.println(bf.readLine());
		int num = Integer.parseInt(bf.readLine());
		System.out.println("hello"+num);
		bf.close();
	}

}
