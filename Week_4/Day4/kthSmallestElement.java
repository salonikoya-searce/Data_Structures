package week4.Day4.Practice;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class kthSmallestElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter k");
		int k=sc.nextInt();
		getElement(arr,k);
		

	}

	public static void getElement(int arr[],int k) {
		PriorityQueue<Integer> max_heap=new PriorityQueue<Integer>(Collections.reverseOrder());
		int counter=0;
		for(int i=0;i<arr.length;i++) {
			max_heap.add(arr[i]);
			if(i+1>k) {
				max_heap.poll();
			}
		}
		System.out.println("Top is: "+max_heap.poll());
	}

}
