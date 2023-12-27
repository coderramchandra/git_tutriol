package edu.assignment1;

import java.util.Scanner;

public class CountDivisor {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int res=count(n);
		System.out.println(res);
	}

	private static int count(int n) {
		return count(n,1,1);
	}

	private static int count(int n, int c, int d) {
		if(d>n/2)
			return c;
		return count(n,(n%d==0)?c+1:c,d+1);
	}
}
