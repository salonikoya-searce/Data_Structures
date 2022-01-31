package week4.Day1.Practice;

import java.util.HashMap;
import java.util.Scanner;

//This program checks if a string contains a repeated character
public class RepeatedCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String str=sc.nextLine();
		checkString(str);
	}

	public static void checkString(String str) {
		HashMap<Character,Integer> hm=new HashMap<>();
		for(int i=0;i<str.length();i++) {
			if(!hm.containsKey(str.charAt(i))) {
				hm.put(str.charAt(i),1);
			}
			else {
				System.out.println("The string contains repeated character");
				return;
			}
		}
		System.out.println("The string does not contain repeated character");
	}

}
