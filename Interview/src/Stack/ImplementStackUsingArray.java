package Stack;

public class ImplementStackUsingArray {

	int[] stack;
	int MAX;
	int top = 0;
	
	public ImplementStackUsingArray(int SIZE) {
		this.MAX = SIZE;
		stack = new int[SIZE];
	}
	
	private void push(int value) {
		if(top == MAX) {
			System.out.println("OverFlow");
			return;
		}
		stack[top++] = value;
	}
	
	private void pop() {
		if(top==0) {
			System.out.println("Underflow");		
			return;
		}
		System.out.println( stack[--top] );
	}
	
	private void peek() {
		if(top <= 0) {
			System.out.println("Empty Stack");
			return;
		}
		System.out.println(stack[top-1]);
	}
	
	public static void main(String[] args) {
		ImplementStackUsingArray sua = new ImplementStackUsingArray(5);
		
		sua.push(1);
		sua.push(2);
		sua.push(3);
		sua.push(4);
		sua.push(5);
		sua.push(6);
		
		sua.peek();
		sua.pop();
		sua.peek();
		sua.pop();
		sua.pop();
		sua.pop();
		sua.pop();
		sua.pop();
		sua.peek();
	}

}
