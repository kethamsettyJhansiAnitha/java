package practice;

import java.util.Scanner;

public class Using_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Enter Any number: ");
		int x=Scanner.nextInt();
		if (x%2==0) {
			System.out.println( "Even");
		}
		else {	System.out.println( "odd");
		
}
}
}