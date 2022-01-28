package week3.Day4.Practice;

import java.util.HashSet;
import java.util.Scanner;

/*This is a program to check if a string is isogram or not. 
An Isogram is a string in which no letter occurs more than once.
We will use HashSet for this purpose*/
public class isogramString {
	
	static boolean isIsogram(String data){
        HashSet<Character> hs=new HashSet<>();
        for(int i=0;i<data.length();i++){
            if(hs.contains(data.charAt(i))){
                return false;
            }
            else{
                hs.add(data.charAt(i));
            }
        }
        return true;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String str=sc.nextLine();
		boolean ans=isIsogram(str);
		if(ans==true) {
			System.out.println("The given string is an isogram");
		}
		else {
			System.out.println("The given string is not an isogram");
		}
	}

}
