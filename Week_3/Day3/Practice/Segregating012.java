package week3.Day3.Practice;

import java.util.Scanner;

//This program segregates 0s,1s and 2s in order.
//Input:[0,2,1,1,0]
//Output:[0,0,1,1,2]

public class Segregating012 {
	
	//This function prints the array elements
	public static void displayArray(int arr[],int arrSize) {
		for(int i=0;i<arrSize;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int arrSize=sc.nextInt();
		
		//Declaring array with the size 'arrSize'
		int arr[]=new int[arrSize]; 
		
		//Taking array elements one by one as input
		for(int i=0;i<arrSize;i++) {
			arr[i]=sc.nextInt();
		}
		displayArray(arr,arrSize);
		
		/*Approach
		 We will count the total number of 0s,1s and 2s and later replace the array elements in the order that is needed
		  */
		 int zeroCount=0,oneCount=0,twoCount=0;
	        for(int i=0;i<arrSize;i++){
	            if(arr[i]==0) zeroCount++;
	            else if(arr[i]==1) oneCount++;
	            else if(arr[i]==2) twoCount++;
	        }
	        for(int i=0;i<zeroCount;i++){
	            arr[i]=0;
	        }
	        for(int i=zeroCount;i<zeroCount+oneCount;i++){
	            arr[i]=1;
	        }
	        for(int i=zeroCount+oneCount;i<arrSize;i++){
	          arr[i]=2;  
	        }
	        displayArray(arr,arrSize);

	}

}
