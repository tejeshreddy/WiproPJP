package module_3;

import java.util.Scanner;

public class Day3_Prog5 {
	
	public static void main(String[] args)
	{
		Scanner br=new Scanner(System.in);
		
		System.out.println("Enter the number 1: ");
		int a = br.nextInt();
		
		System.out.println("Enter the number 2: ");
		int b = br.nextInt();
	
		System.out.println(sum_enddigits(a,b));
	}

	public static int sum_enddigits(int a, int b)
	{
		if(a<0)
			a=a*-1;
		if(b<0)
			b=b*-1;
		
		return(a%10 + b%10);
	}
}
