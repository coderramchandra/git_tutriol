package com.linkedlist;

public class LinkedListDemo1 {
	static class Node{
		Object data;
		Node next;
		Node(Object data)
		{
			this.data=data;
		}
	}
	public static void main(String[] args) {
		Node n1=new Node(5);
		Node n2=new Node(10);
		Node n3=new Node(15);
		Node n4=new Node(20);
		
		Node head=n1;
		//LINKED CONNECTION
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
	}
}
