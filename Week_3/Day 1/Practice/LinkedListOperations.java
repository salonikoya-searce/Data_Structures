package week3.Day1;

import java.util.Scanner;

public class LinkedListOperations {
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	static Node head=null;
	static Node temp=null;
	
	
	public static void main(String[] args) {
		int choice;
		System.out.println("Press\n1:Insert Node at the beginning\n2:Insert Node at the end");
		System.out.println("3:Delete Node at the beginning\n4:Delete Node at the end");
		System.out.println("5:Count the number of nodes\n6:Display Linked List\n7:Exit");
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Enter choice");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
					System.out.println("Enter the element that you want to insert");
					int eleAtStart=sc.nextInt();
					insertAtStart(eleAtStart);
					break;
			case 2:
					System.out.println("Enter the element that you want to insert");
					int eleAtEnd=sc.nextInt();
					insertAtEnd(eleAtEnd);
					break;
			case 3:
					deleteAtStart();
					break;
			case 4:
					deleteAtEnd();
					break;
			case 5:
					countNodes();
					break;
			case 6:
					displayLinkedList();
					break;
			case 7:
					System.exit(1);
					break;
			default:
					System.out.println("Invalid choice!");
					break;
			}
		}while(choice!=7);
		
	}

	public static void displayLinkedList() {
		if(head==null) {
			System.out.println("No element present in the list");
			return;
		}
		System.out.println("The linked list is as follows:");
    	temp=head;
    	while(temp!=null) {
    		System.out.print(temp.data+" ->");
    		temp=temp.next;
    	}
    	System.out.println();
	}

	public static void countNodes() {
		int totalNodes=0;
		Node tem=head;
		while(tem!=null) {
			totalNodes++;
			tem=tem.next;
		}
		System.out.println("The total nodes are "+totalNodes);
		
	}

	public static void deleteAtEnd() {
		if(head==null) {
			System.out.println("No element present in the list");
			return;
		}
		temp=head;
		if(head.next==null) { //single node
			head=null;
		}
		else {
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		temp.next=null;
		}
		
	}

	public static void insertAtEnd(int eleAtEnd) {
		temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		Node n=new Node(eleAtEnd);
		temp.next=n;
	}

	public static void deleteAtStart() {
		if(head!=null) {
			temp=head;
			head=head.next;
			temp=null;
		}
		else {
			System.out.println("No element present in the list");
			return;
		}
	}

	public static void insertAtStart(int ele) {
	
		Node n=new Node(ele);
		if(head==null) {
			head=n;
			temp=n;
		}
		else {
		temp=head;
		head=n;
		head.next=temp;
		}
	}

}
