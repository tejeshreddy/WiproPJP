package module_3;

import java.util.Scanner;

public class Day3_Prog3 {
	public static void main(String args[])
		{
			Scanner br=new Scanner(System.in);
			System.out.println("Enter the number: ");
			int n=br.nextInt();
			System.out.println(last_digit(n));
		}
	
	public static int last_digit(int n)
	{
		int num=(n%10);
		if(num<0)
			return(-1*num);
		else
			return(num);
	}
}
