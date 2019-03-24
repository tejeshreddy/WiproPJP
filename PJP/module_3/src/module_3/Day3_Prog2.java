package module_3;

import java.util.Scanner;

public class Day3_Prog2 {

	public static void main(String[] args)
	{
		Scanner br=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=br.nextInt();
		System.out.println(odd_function(n));
	}

	public static int odd_function(int n)
	{
		if(n%2==1)
			return(2);
		else
			return(1);
	}

}
