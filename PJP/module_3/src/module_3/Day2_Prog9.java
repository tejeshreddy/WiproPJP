//Write A program to print all numbers backwards from 100 to 1 by skipping 2 numbers (100 97 94 91 .. 4 1)
package module_3;

public class Day2_Prog9 {
	public static void main(String[] args)
	{
		for(int i=100;i>=1;i=i-3)
			{
			if(i>=1)
				System.out.print((i)+" ");
			}
		
	}
}
