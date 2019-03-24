package module_3;

import java.util.Scanner;

public class Day2_Prog1 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter N: ");
	int n=scan.nextInt();
	
	if(n>0) {
		System.out.println("Greater than 0");
	}
	else if(n<0) {
		System.out.println("Lesser than 0");
	}
	else {
		System.out.println("Zero");
	}
	
	}
}
