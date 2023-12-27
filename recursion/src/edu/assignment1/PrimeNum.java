import java.util.Scanner;

public class PrimeNum {
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
			return false;
		if(n%d!=0)
			return true;
		return isPrime(n,d+1);
	}
}