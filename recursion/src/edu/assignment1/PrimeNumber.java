package edu.assignment1;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		boolean b=isPrime(n);
		if(b)
		System.out.println("is prime");
		else
			System.out.println("not prime");
	}

	private static boolean isPrime(int n) {
		return isPrime(n,2);
	}

	private static boolean isPrime(int n, int d) {
		if(d>n/2)
			return true;
		if(n%d==0)
			return false;
		return isPrime(n,d+1);
	}
	
}
