package week4.Day3.Practice;

import java.util.Iterator;
import java.util.PriorityQueue;

public class MinHeap {
	 public static void main(String args[])  { 
	        // Creating priority queue object 
	        PriorityQueue<Integer> pQueue_heap = new PriorityQueue<Integer>(); 
	        // Add elements to the pQueue_heap using add() 
	        pQueue_heap.add(100); 
	        pQueue_heap.add(30); 
	        pQueue_heap.add(20); 
	        pQueue_heap.add(40); 
	   
	        // Print the head using peek method 
	        System.out.println("Head (root node of min heap):" + pQueue_heap.peek()); 
	        // Print min heap represented using PriorityQueue 
	        System.out.println("\n\nMin heap as a PriorityQueue:"); 
	        Iterator iter = pQueue_heap.iterator(); 
	        while (iter.hasNext()) 
	            System.out.print(iter.next() + " "); 
	   
	        // remove head using poll method 
	        pQueue_heap.poll(); 
	        System.out.println("\n\nMin heap after removing root node:"); 
	        
	        //printing the min heap again
	        Iterator<Integer> iter2 = pQueue_heap.iterator(); 
	        while (iter2.hasNext()) 
	            System.out.print(iter2.next() + " "); 
	    } 
	
}
