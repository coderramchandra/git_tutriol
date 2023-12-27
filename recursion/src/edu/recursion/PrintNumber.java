package edu.recursion;

import java.util.Scanner;

public class PrintNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range: ");
		int n=sc.nextInt();
		display(n);
		
	}

//	// Print 1-n 
//	private static void display(int n) {
//		if(n>1)
//			display(n-1);
//		System.out.println(n);
//		
//	}
	
	// Print n-1 
	private static void display(int n) {
		if(n==0)
			return;
		System.out.println(n);
		display(n-1);
		
	}
	
}
