package edu.assignment1;

import java.util.Scanner;

public class smallestDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int small=getSmallest(n);
		System.out.println(small);
	}

	static int getSmallest(int n) {
		return getSmallest(n,9);
	}

	//RECURSIVE FUNCTION
	static int getSmallest(int n, int small) {
		if(n==0)
			return small;
		int d=n%10;
		if(d<small)
			small=d;
		n=n/10;
		return getSmallest(n,small);
	}
}
