
public class CircularLinkedList<E> {
	
	static class Node<E> {
		E data;
		Node<E> next;

		public Node(E data) {
			this.data = data;
			this.next = null;
		}
	}
	
	private Node<E> head = null;
	private Node<E> tail = null;
	
	void addFirst(E data) {
		Node<E> newNode = new Node<E>(data);
		if(head == null) {
			newNode.next = newNode;
			head = newNode;
			tail = newNode;
			return;
		}
		tail.next = newNode;
		newNode.next = head;
		head = newNode;
	}
	
	void addLast(E data) {
		Node<E> newNode = new Node<E>(data);
		if(head == null) {
			newNode.next = newNode;
			head = newNode;
			tail = newNode;
			return;
		}
		tail.next = newNode;
		newNode.next = head;
		tail = newNode;
	}
	
	void deleteFirst() {
		if(head == null) return;
		tail.next = head.next;
		head = head.next;
	}

	void printList() {
		if(head == null) return;
		Node<E> curr = head;
		do {
			System.out.print(curr.data + " ");
			curr = curr.next;
		} while(curr != head);
	}
	
}
