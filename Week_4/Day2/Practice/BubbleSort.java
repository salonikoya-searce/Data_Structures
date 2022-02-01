package week4.Day2.Practice;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int arrSize=sc.nextInt();
		int arr[]=new int[arrSize];
		System.out.println("Enter the array elements one by one");
		for(int i=0;i<arrSize;i++) {
			arr[i]=sc.nextInt();
		}
		sortArray(arr,arrSize);
		System.out.println("After Sorting:");
		displayArray(arr,arrSize);

	}

	public static void displayArray(int[] arr,int arrSize) {
		for(int i=0;i<arrSize;i++) {
			System.out.println(arr[i]);
		}
		
	}

	public static void sortArray(int[] arr,int arrSize) {
		for(int i=0;i<arrSize-1;i++) {
			for(int j=0;j<arrSize-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		displayArray(arr, arrSize);
		
	}

}
