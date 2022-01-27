package wek3.Day3.Assignment;

import java.util.Scanner;

public class calculateWaitingTime {

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
		//Sort the array

	}

}
