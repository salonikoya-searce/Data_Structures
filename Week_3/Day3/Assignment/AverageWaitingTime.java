package wek3.Day3.Assignment;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class AverageWaitingTime {
	public static double calculateAverageWaitingTime(int[][] customers) {
		Queue<int[]> queue = new ArrayDeque<>();
	    for(int[] customer : customers){
	        queue.add(customer);
	    }
	    
	    int timeElapsed = 0;
	    double totalTime = 0;
	    
	    while(!queue.isEmpty()){
	        int[] poll = queue.poll();
	        timeElapsed = (poll[0] > timeElapsed) ? poll[0] : timeElapsed;
	        int orderTime = poll[1];
	        timeElapsed += orderTime;
	        totalTime += timeElapsed - poll[0];
	    }
	    return totalTime/customers.length;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of customers");
		int totalCustomers=sc.nextInt();
		int customers[][]=new int[totalCustomers][2];
		for(int i=0;i<totalCustomers;i++) {
			for(int j=0;j<2;j++) {
				customers[i][j]=sc.nextInt();
			}
		}
		double ans=calculateAverageWaitingTime(customers);
		System.out.println(ans);
	}
}
