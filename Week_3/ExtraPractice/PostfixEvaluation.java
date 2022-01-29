package week3.extraPractice;

import java.util.Scanner;
import java.util.Stack;

public class PostfixEvaluation {

	 public static int evaluatePostFix(String S)
	    {
	        Stack<Integer> st=new Stack<>();
	        for(int i=0;i<S.length();i++){
	            char ch=S.charAt(i);
	            int cha=Character.getNumericValue(ch);
	            if(ch=='*' || ch=='/' || ch=='+' ||ch=='-'){
	                int num1=st.pop();
	                int num2=st.pop();
	                switch(ch){
	                    case '*':
	                            st.push(num1 * num2);
	                            break;
	                    case '/':
	                            st.push(num2/num1);
	                            break;
	                    case '+':
	                             st.push(num2+num1);
	                            break;
	                    case '-':
	                             st.push(num2-num1);
	                            break;
	                }
	            }
	            else{
	                st.push(cha);
	            }
	        }
	        return st.peek();
	    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a postfix expression");
		String S=sc.nextLine();
		int ans=evaluatePostFix(S);
		System.out.println("Answer is "+ans);
	}

}
