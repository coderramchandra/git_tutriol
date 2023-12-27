package edu.recursion;

import java.util.Scanner;

public class SumOfNaturalNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the range: ");
	int n=sc.nextInt();
	int sum=sumOfNatural(n);
	System.out.println(sum);
}

private static int sumOfNatural(int n) {
	if(n==0)
		return 0;
	return n+sumOfNatural(n-1);
}
}
