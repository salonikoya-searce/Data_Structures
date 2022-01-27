package week3.Day3.Practice;

import java.util.Scanner;

//This program reverses dot-separated words in a string

/*Input: this.is.a.dog
 Output: dog.a.is.this 
 */
public class ReverseWords {

	public static void reverseWords(String S) {
		String[] arr=S.split("\\.");  //splits the string on the basis of dot.Thus, arr[0] will be 'this' for the above given example
        String newString="";
        for(int i=arr.length-1;i>0;i--){
            newString+=arr[i]+".";   //appends the array elements in new string
        }
        //Since '.' would also be appended for the first element,which is not required, we would separately append it without the '.'
        newString+=arr[0];
        System.out.println("The reversed String is");
        System.out.println(newString);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Asks for string input
		//Here we assume that the user enters dot separated words
		System.out.println("Enter a string");
		String s=sc.nextLine();
		reverseWords(s);
	}

}
