package week4.Day1.Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostUsedCharacter {

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
				int cnt=hm.get(str.charAt(i));
				cnt=cnt+1;
				hm.put(str.charAt(i), cnt);
			}
		}
		int max=Integer.MIN_VALUE;
		char k=' ';
		for (Map.Entry<Character,Integer> mapElement : hm.entrySet()) {
		char key = (char)mapElement.getKey();
		int value=(int)mapElement.getValue();
		if(value>max) {
			max=value;
			k=key;
            	}
            
		}
		System.out.println("The maximum occuring character is: "+k);
		
	}

}
