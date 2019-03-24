package module_3;

import java.util.Scanner;

public class Day3_Prog1 {

	public static void main(String[] args)
	{
		Scanner br=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=br.nextInt();
		System.out.println(even_function(n));
	}

	public static int even_function(int n)
	{
		if(n%2==0)
			return(2);
		else
			return(1);
	}

}
