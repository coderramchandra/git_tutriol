package com.linkedlist;

public class SingleLinkedListProgramDemo1 {
	public static void main(String[] args) {
		SinglyLinkedList s=new SinglyLinkedList();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		
		s.display();
		System.out.println();
		s.displayRecursivly();
		System.out.println();
		s.displayReverse();
		
		System.out.println();
		int ln=s.length();
		System.out.println(ln);
	}
}
