package edu.recursion;

public class PrintHello {
	public static void main(String[] args) {
		display(4);
	}

	// FORWARD DIRECTION
//static void display(int n) {
//	if(n==0)
//		return;
//	System.out.println("Hello");
//	display(n-1);
//}
	
	// BACKTRACkTING
	
static void display(int n) {
	if(n>1)
		display(n-1);
	System.out.println("Hello");
}
}
