
public class LinkedListStack {
	
	static class Node {
		int data;
		Node next;
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	private int size;
	private Node head;
	
	LinkedListStack() {
		this.size = 0;
		this.head = null;
	}
	
	boolean isEmpty() {
		return this.size == 0;
	}
	
	void push(int data) {
		Node newNode = new Node(data);
		if(this.size == 0) {
			head = newNode;
			this.size++;
			return;
		}
		newNode.next = head;
		head = newNode;
		this.size++;
	}
	
	int pop() {
		if(this.size == 0) throw new IndexOutOfBoundsException("Stack is Empty");
		int res = head.data;
		head = head.next;
		this.size--;
		return res;
	}
	
	int peek() {
		if(this.size == 0) throw new IndexOutOfBoundsException("Stack is Empty");
		return head.data;
	}
	
	int size() {
		return this.size;
	}
	
}
