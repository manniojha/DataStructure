package Stack;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueue {
	
	Queue<Integer> q1 = new LinkedList<>();
	Queue<Integer> q2 = new LinkedList<>();
	
	private void push(int val) {
		q1.add(val);
	}
	
	private void pop() {
		if(q1.isEmpty()) {
			System.out.println("Stack Empty");
			return;
		}
		while(q1.size() == 1) {
			q2.add(q1.remove());
		}
		System.out.println(q1.remove());
		q1 = q2;
		q2 = new LinkedList<>();
	}
	
	private void peek() {
		
	}

	public static void main(String[] args) {
		ImplementStackUsingQueue suq = new ImplementStackUsingQueue(); 
		
		suq.push(1);
		suq.push(2);
		suq.push(3);
		suq.push(4);
		suq.push(5);
		suq.push(6);
		
		suq.peek();
		suq.pop();
		suq.pop();
		suq.pop();
		suq.pop();
		suq.pop();
		suq.peek(); 
	}

}
