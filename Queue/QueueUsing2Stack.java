package DSA_Alpha.Queue;

import java.util.Stack;

public class QueueUsing2Stack {
	static class Queue {
		static Stack<Integer> s1 = new Stack<>();
		static Stack<Integer> s2 = new Stack<>();

		public static boolean isEmpty() {
			return s1.isEmpty();
		}

		// add
		public static void add(int data) {
			// 1st step - push into s2 from s1
			while (!s1.isEmpty())
				s2.push(s1.pop());
			// 2nd step -push new data in s1
			s1.push(data);
			// 3rd step -push into s1 from s2
			while (!s2.isEmpty())
				s1.push(s2.pop());
		}
		
		//remove 
		public static int remove(){
		if(isEmpty())
			return -1;
		
		return s1.pop();
	}
		
		//peek
		public static int peek(){
			if(isEmpty())
				return -1;
			
			return s1.peek();
		}
}
	public static void main(String[] args) {
		Queue q = new Queue();
		q.add(1);
		q.add(2);
		q.add(3);
		
		while(!q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();
		}
	}
}
