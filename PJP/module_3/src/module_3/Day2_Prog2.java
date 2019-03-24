package module_3;

import java.util.Scanner;

public class Day2_Prog2 {
public static void main(String[] args)
{
	Scanner br=new Scanner(System.in);
	System.out.println("Enter Number 1:");
	int a=br.nextInt();
	
	System.out.println("Enter Number 2:");
	int b=br.nextInt();

	if(a>b) {
		System.out.println(a);
	}
	else {
		System.out.println(b);
	}
}
}
