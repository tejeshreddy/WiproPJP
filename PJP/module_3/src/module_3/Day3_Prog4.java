package module_3;

import java.util.Scanner;

public class Day3_Prog4 {
	public static void main(String args[])
		{
			Scanner br=new Scanner(System.in);
			System.out.println("Enter the number: ");
			int n=br.nextInt();
			System.out.println(secondlast_digit(n));
		}
	
	public static int secondlast_digit(int n)
	{
		if(n<10)
			return(-1);
		
		int num=n;
		if(n<0)
			num=n*-1;
		
		num=(num/10);
		num=num%10;
		return(num);
	}
}