package edu.ramchandra.linkedlist;

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
	
	//Add element in list
	public void add(Object data)
	{
		Node n=new Node(data);
		if(head==null)
		{
			head=n;
			return;
		}
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=n;
		
	}
	//Display the list
	
	void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data);
			if(temp.next!=null) {
				System.out.print("-->");
			}
			temp=temp.next;
		}
		System.out.println();
	}
	
	//length of the list
	public int length()
	{
		
	Node temp=head;
	int count=0;
		while(temp!=null) {
			count++;
			temp=temp.next;
		}
		
		return count;
	}
	
	//add element in first
	public void addFirst(Object data)
	{
		Node n=new Node(data);
		n.next=head;
		head=n;
	}

	//delete first element
	public Object deleteFirst() {
		if(head==null) {
			System.out.println("List is empty");
			return null;
		}
		Object data=head.data;
		head=head.next;
		return data;	
		
	}
	
	//delete last element
	public void deleteLast()
	{
		
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		else if(head.next==null)
		{
			head=null;
		}
		
		else if(head.next!=null) {
			Node temp=head;
			while(temp.next.next!=null)
			{
				temp=temp.next;
			}
			temp.next=null;
		}
	}
}
