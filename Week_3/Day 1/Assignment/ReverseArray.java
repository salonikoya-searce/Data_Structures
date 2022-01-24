package week3.Day1;

import java.util.Scanner;

public class ReverseArray {

	public static void reverseArray(int[] arr) {
		
		int size=arr.length;
		for(int i=0,j=size-1;i<size/2;i++,j--) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		System.out.println("The reversed array is:");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int arraySize=sc.nextInt();
		//Constraint Handling
		if(arraySize<1 || arraySize>Math.pow(10, 3)) {
			System.out.println("You need to enter the array size between 1 and 1000");
			System.exit(1);
		}
		int arr[]=new int[arraySize];
		System.out.println("Enter the array elements one by one");
		for(int i=0;i<arraySize;i++) {
			arr[i]=sc.nextInt();
			//Constraint Handling
			if(arr[i]<1 || arr[i]>Math.pow(10, 4)) {
				System.out.println("The element needs to be between 1 and 10000");
				System.exit(1);
			}
		}
		sc.close();
		
		//Calling the function reverseArray
		reverseArray(arr);

	}


}
