package edu.assignment1;

import java.util.Scanner;

public class BiggestDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int big=getBiggest(n);
		System.out.println(big);
	}

	static int getBiggest(int n) {
		return getBiggest(n,-9);
	}

	
	//RECURSIVE FUNCTION
 static int getBiggest(int n, int big) {
		if(n==0)
			return big;
		int d=n%10;
		if(d>big)
			big=d;
		n=n/10;
		return getBiggest(n,big);
	}
}
