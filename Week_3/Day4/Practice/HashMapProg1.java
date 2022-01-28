package week3.Day4.Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//This program finds the maximum number with minimum frequency in an array
//Eg: For the array [5,5,2,3,50,3], the answer would be 50, since it is the maximum element with minimum frequency
public class HashMapProg1 {
	
	public static int LargButMinFreq(int arr[], int n) {
		
		//We will use a hashmap for key-value pairs
		//Key will be the array element and the corresponding value will be its counter
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            if(hm.containsKey(arr[i])){	//if hashmap already consists that element, increment the counter
                int count=hm.get(arr[i]);
                count=count+1;
                hm.put(arr[i],count);
            }
            else{
                hm.put(arr[i],1);	//if hashmap does not contain that element, put in the hashmap by keeping its counter 1
            }
        }
        int minFreq=Integer.MAX_VALUE;
        int maxNumber=Integer.MIN_VALUE;
        //Iterating through the HashMap
        for (Map.Entry<Integer,Integer> mapElement : hm.entrySet()) {
            int key = (int)mapElement.getKey();
            int value=(int)mapElement.getValue() ;
            if(value<minFreq){ 			//checking the minimum frequency
                maxNumber=key;
                minFreq=value;
            }
            else if(value==minFreq){	//if the frequency is same, compare the elements to get the max element
                if(key>maxNumber){
                    maxNumber=key;
                }
            }
 
        }
        return maxNumber;
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
		int max=LargButMinFreq(arr, arrSize);
		System.out.println("The maximum number is "+max);
	}

}
