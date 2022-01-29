package week3.extraPractice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReversingElements {

	public static Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        Stack<Integer> st=new Stack<>();
        Queue<Integer> que=new LinkedList<>();
        int count=1;
        while(count<=k){
            st.push(q.poll());
            count++;
        }
        while(!st.isEmpty()){
            que.offer(st.pop());
        }
        while(!q.isEmpty()){
            que.offer(q.poll());
        }
        return que;
    }
	public static void main(String[] args) {
		Queue<Integer> q=new LinkedList<>();
		q.offer(1);
		q.offer(2);
		q.offer(3);
		q.offer(4);
		q.offer(5);
		q=modifyQueue(q,3);
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}

}
