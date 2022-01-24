package week3.Day1;

import java.util.Scanner;

public class QueueOperations {
	
	public static final int queueSize=5;
	public static int arr[]=new int[queueSize];
	public static int front=-1,rear=-1;
	
	public static boolean isFull() {
		if(rear==queueSize-1) {
			return true;
		}
		return false;
	}
	public static boolean isEmpty() {
		if(rear==-1 && front==-1) {
			return true;
		}
		return false;
	}
	
	public static void enqueue() {
		if(isFull()) {
			System.out.println("Queue is full!");
			return ;
		}
		else {
			if(front==-1) {
				front=0;
			}
		}
		System.out.println("Enter element");
		Scanner sc=new Scanner(System.in);
		int item=sc.nextInt();
        arr[++rear] = item;
		return;
	}
	public static void dequeue() {
		
		int deletedItem;
		if(isEmpty()) {
			System.out.println("Queue Empty!");
			return;
		}
		else if(front==rear) {
			front=-1;
			rear=-1;
		}
		else {
			deletedItem=arr[front];
			System.out.println("The deleted item is "+deletedItem);
			front++;
		}
		
	}
	public static int peek() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}
		return arr[front];
	}
	
	
	public static void main(String[] args) {
		
		Scanner st=new Scanner(System.in);
		int choice;
		do {
		System.out.println("Press\n1:enQueue\n2:deQueue\n3:Peek\n4:Exit\n");
		System.out.println("Enter choice");
		choice=st.nextInt();
		switch(choice) {
		case 1:
				enqueue();
				break;
		case 2:
				dequeue();
				break;
		case 3:
				int ele=peek();
				System.out.println("The peeked element is "+ele);
				break;
		case 4:
				System.exit(0);
				break;
		default:
				System.out.println("Invalid choice");
		}
		}while(choice!=4);
		
	}

}
