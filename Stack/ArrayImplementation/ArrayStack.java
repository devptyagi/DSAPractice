
public class ArrayStack {
	
	int a[];
	int capacity, top;
	
	ArrayStack(int c) {
		this.capacity = c;
		this.top = -1;
		a = new int[c];
	}
	
	void push(int x) {
		if(top == capacity - 1) {
			throw new IndexOutOfBoundsException("Stack Full");
		}
		a[++top] = x;
	}

	int pop() {
		if(this.isEmpty()) {
			throw new IndexOutOfBoundsException("Stack Empty");
		}
		int res = a[top--];
		return res;
	}
	
	int peek() {
		if(this.isEmpty()) {
			throw new IndexOutOfBoundsException("Stack Empty");
		}
		return a[top];
	}
	
	int size() {
		return top + 1;
	}
	
	boolean isEmpty() {
		return top == -1;
	}
	
}
