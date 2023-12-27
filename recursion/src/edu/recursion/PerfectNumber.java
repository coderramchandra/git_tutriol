package edu.recursion;
import java.util.Scanner;
public class PerfectNumber {
	// recursive method
	static int sum=0;
	static boolean isPerfect(int num,int i) {
		
		// base condition
		if(i<=num/2) {
			if(num % i==0)
				sum+=i;
			i++;
			isPerfect(num, i);
			
		}
		return sum==num;	
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int i=1;
		if(isPerfect(n, i))
			System.out.println(n+" is a perfect number");
		else
			System.out.println(n+" is not a perfect number");
	}
}
