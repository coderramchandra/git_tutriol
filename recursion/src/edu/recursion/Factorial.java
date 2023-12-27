package edu.recursion;

import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number: ");
	int n=sc.nextInt();
	int res=fact(n);
	System.out.println(res);
}

private static int fact(int n) {
	if(n==0 || n==1)
		return 1;
	return n * fact(n-1);
}
}
