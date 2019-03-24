//Accept a number N and print if it's EVEN or ODD
package module_3;

import java.util.Scanner;

public class Day2_Prog3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter N: ");
		int n=scan.nextInt();
		
		if(n%2==0)
		{
			System.out.println("EVEN");
		}
		else
		{
			System.out.println("ODD");
		}
	}
}
