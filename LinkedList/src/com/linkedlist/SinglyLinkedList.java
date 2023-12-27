package com.linkedlist;

public class SinglyLinkedList {
	class Node
	{
		Object data;
		Node next;
		Node(Object data)
		{
			this.data=data;
		}
	}
	Node head;
	
	//Add function
	void add(Object data)
	{
		Node n=new Node(data);
		if(head==null) {
			head=n;
			return;
		}
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=n;
	}
	
	//DISPLAY
	void display()
	{
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data);
			if(temp.next!=null)
				System.out.print("-->");
			temp=temp.next;
		}
	}
	
	//Display Recursivly
	void displayRecursivly() {
		  displayRecursivly(head);
	}
	//RECURSION CALLING
	void displayRecursivly(Node head) {
		if(head==null)
			return;
		System.out.print(head.data+" ");
		displayRecursivly(head.next);
	}
	
	
	//Reverse order
	void displayReverse() {
		displayReverse(head);
	}
	
	void displayReverse(Node n) {
		if(n==null)
			return;
		displayReverse(n.next);
		System.out.print(n.data+" ");
	}
	
	//LENGTH RETURN
	
	int length() {
		Node temp=head;
		int count=0;
		while(temp!=null)
		{
			count++;
			temp=temp.next;;
		}
		return count;
	}
}
