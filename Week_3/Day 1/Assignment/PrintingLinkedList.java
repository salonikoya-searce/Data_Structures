package week3.Day1;

import java.util.Scanner;


public class PrintingLinkedList {
	
	 static Node head;
	 static Node temp;
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}

    public static void display() {
    	System.out.println("The linked list is as follows:");
    	temp=head;
    	while(temp!=null) {
    		System.out.println(temp.data);
    		temp=temp.next;
    	}
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of linked list entries");
		int llSize=sc.nextInt();
		//Constraint Handling
		if(llSize<1 || llSize>Math.pow(10, 3)) {
			System.out.println("You need to enter the linked list entries between 1 and 1000");
			System.exit(1);
		}
		int counter=0;
		
		while(counter<llSize) {
			
			int data=sc.nextInt();
			
			//Constraint handling
			if(data<1 || data>Math.pow(10, 3)) {
				System.out.println("The element needs to be between 1 and 1000");
				System.exit(1);
			}
			Node n=new Node(data);
			if(head==null) {
				head=n;
				temp=head;
			}
			else {
				temp.next=n;
				temp=n;
			}
			
			counter++;
		}
		System.out.println("The head is : "+head.data);
		display();
		sc.close();	
			
		}
	
}
