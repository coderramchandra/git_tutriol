package edu.assignment1;

import java.util.Scanner;

public class HappyNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		boolean b=isHappy(n);
		if(b)
			System.out.println("is happy number");
		else
			System.out.println("is not happy number");
	
	}
	public static boolean isHappy(int n) {
		if(n>9)
	    	return isHappy(sumOfSqure(n));
		return n==1 || n==7;
		
	}
 static int sumOfSqure(int n) {
		if(n==0)
			return 0;
		return n%10 * n%10 + sumOfSqure(n/10);
	}

	
		
		
}
