package edu.assignment1;

import java.util.Scanner;

public class ReverseString {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String: ");
	String str=sc.nextLine();
	String res=reverse(str);
	System.out.println(res);
}

public static String reverse(String st) {
	return reverse(st,"",st.length()-1);
			}

public static String reverse(String st, String s, int i) {
	if(i<0)
		return s;

	return reverse(st,s+st.charAt(i),i-1);
}
}

