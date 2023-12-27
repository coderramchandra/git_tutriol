package edu.assignment1;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		boolean res=isPerfect(n);
		if(res)
			System.out.println(n+" is a perfect number");
		else
			System.out.println(n+" is not a perfect number");
	}

	private static boolean isPerfect(int n) {
		return isPerfect(n,0,1);
	}

	private static boolean isPerfect(int n, int sum, int div) {
		if(div>n/2)
			return sum==n;
		return isPerfect(n,(n%div==0)?sum+div:sum,div+1);
	}
}
