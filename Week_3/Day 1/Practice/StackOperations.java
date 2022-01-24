package week3.Day1;

import java.util.Scanner;


public class StackOperations {
	
	public static final int stackSize=5;
	public static int arr[]=new int[stackSize];
	static int top=-1;
	
	public static boolean isFull() {
		if(top==stackSize-1) {
			return true;
		}
		return false;
	}
	public static boolean isEmpty() {
		if(top==-1) {
			return true;
		}
		return false;
	}
	
	public static int push() {
		if(isFull()) {
			System.out.println("Stack Full!");
			return -1;
		}
		System.out.println("Enter item");
		Scanner st=new Scanner(System.in);
		arr[++top]=st.nextInt();
		return 1;
	}
    public static int pop() {
    	if(isEmpty()) {
    		System.out.println("Stack Empty!");
    		return -1;
    	}
    	int removedItem=arr[top--];
    	return removedItem;
    }
    public static void viewStack() {
    	for(int i=top;i>=0;i--) {
    		System.out.println(arr[i]);
    	}
    	
    }
	public static void main(String[] args) {
		
		System.out.println("Press");
		System.out.println("1:Push Item In Stack\n2:Pop Item From Stack\n3:View Stack\n4:Exit");
		System.out.println("Enter Choice:");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		while(choice!=4) {
			switch (choice){
			case 1:
					int res=push();
					if(res==-1) {
						System.out.println("Couldn't push item in the stack!");
					}
					else {
						System.out.println("Item added to stack successfully");
					}
					break;
			case 2:
				    int result=pop();
				    if(result==-1) {
						System.out.println("Couldn't pop the item from the stack!");
					}
					else {
						System.out.println("Item successfully popped from the stack!");
					}
				    break;
			case 3:
					viewStack();
					break;
			case 4:
					System.out.println("Program finished!");
					System.exit(0);
					break;
			default:
					System.out.println("Invalid Choice");
					break;
					
			}
			System.out.println("Enter Choice:");
			choice=sc.nextInt();
		}

	}

}
