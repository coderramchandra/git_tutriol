package edu.assignment1;
import java.util.Scanner;
public class CountDigit {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number: ");
	int n=sc.nextInt();
	int res=digitCount(n);
	System.out.println(res);
}

private static int digitCount(int n) {
	return digitCount(n,0);
}

private static int digitCount(int n, int c) {
	if(n==0)
		return c;
	int d=n%10;
	n=n/10;
	return digitCount(n,c+1);
}
}
