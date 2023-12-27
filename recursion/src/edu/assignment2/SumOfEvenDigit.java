package edu.assignment2;
import java.util.Scanner;
public class SumOfEvenDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int res=sumOfDigit(n);
		System.out.println(res);
	}

 static int sumOfDigit(int n) {
		return sumOfDigit(n,0);
	}

 static int sumOfDigit(int n, int sum) {
	if(n==0)
		return sum;
	int d=n%10;
	if(d%2==0)
		sum=sum+d;
	return sumOfDigit(n/10,sum);
}
}
