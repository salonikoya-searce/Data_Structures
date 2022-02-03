package week4.Day4.Practice;

import java.util.Scanner;

public class SelectionSort {

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
		for (int i = 0; i < arr.length-1; i++)
        {
			int min_idx = i;
            for (int j = i+1; j < arr.length; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
  
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
		
	}

}
