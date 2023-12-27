package edu.recursion;
import java.util.Scanner;
public class SumOfDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int res=sumOfDigit(n);
		System.out.println(res);
	}

	private static int sumOfDigit(int n) {
		if(n==0)
			return 0;
		return n%10 + sumOfDigit(n/10);
	}
}
