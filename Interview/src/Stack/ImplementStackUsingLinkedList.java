package Stack;

class Node {
	int data;
	Node next = null;
}

public class ImplementStackUsingLinkedList {
	
	Node front;
	
	private Node getNewNode(int val) {
		Node node = new Node();
		node.data = val;
		node.next = null;
		return node;
	}
	
	private void push(int val) {
		if(front == null) {
			front = getNewNode(val);
		}
		Node node = getNewNode(val);
		node.next = front;
		front = node;
	}
	
	private void pop() {
		if(front.next == null) {
			System.out.println("Stack Empty");
			return;
		}
		System.out.println(front.data);
		front = front.next;
	}
	
	private void peek() {
		if(front.next == null) {
			System.out.println("Stack Empty");
			return;
		}
		System.out.println(front.data);
		
	}
	
	public static void main(String[] args) {
		ImplementStackUsingLinkedList sull = new ImplementStackUsingLinkedList();
		
		sull.push(33);
		sull.push(2);
		sull.push(3);
		sull.push(4);
		sull.push(5);
		sull.push(6);
		
		sull.peek();
		sull.pop();
		sull.peek();
		sull.pop();
		sull.pop();
		sull.pop();
		sull.pop();
		sull.pop();
		sull.peek();

	}

}
