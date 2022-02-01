package week4.Day2.Practice;

import java.util.Scanner;

public class InsertionSort {

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

	public static void displayArray(int[] arr, int arrSize) {
		for(int i=0;i<arrSize;i++) {
			System.out.println(arr[i]);
		}
		
	}

	public static void sortArray(int[] arr, int arrSize) {
		 for (int i = 1; i < arrSize; ++i) {
	            int key = arr[i];
	            int j = i - 1;
	            while (j >= 0 && arr[j] > key) {
	                arr[j + 1] = arr[j];
	                j = j - 1;
	            }
	            arr[j + 1] = key;
	        }
		
	}

}
