//Accept two numbers and print if the sum of two numbers are ODD or EVEN
package module_3;

import java.util.Scanner;

public class Day2_Prog4 {
	public static void main(String[] args)
	{
		Scanner br=new Scanner(System.in);
		System.out.println("Enter Number 1:");
		int a=br.nextInt();
		
		System.out.println("Enter Number 2:");
		int b=br.nextInt();
		
		if((a+b)%2==0)
		{
			System.out.println("Sum is EVEN");
		}
		
		else
		{
			System.out.println("Sum is ODD");
		}
	}
}
