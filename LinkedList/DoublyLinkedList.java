public class DoublyLinkedList<E> {

	static class Node<E> {
		E data;
		Node<E> next, prev;
		Node(E data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}

	private Node<E> head = null;

	void addFirst(E data) {
		Node<E> newNode = new Node<E>(data);
		if(head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head.prev = newNode;
		head = newNode;
	}

	void addLast(E data) {
		Node<E> newNode = new Node<E>(data);
		if(head == null) {
			head = newNode;
			return;
		}
		Node<E> temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
		newNode.prev = temp;
	}

	void reverse() {
		if(head == null || head.next == null) return;
		Node<E> prev = null, curr = head;
		while(curr != null) {
			prev = curr.prev;
			curr.prev = curr.next;
			curr.next = prev;
			curr = curr.prev;
		}
		head = prev.prev;
	}

	void deleteFirst() {
		if(head == null) return;
		if(head.next == null) {
			head = null;
			return;
		}
		head = head.next;
		head.prev = null;
	}

	void deleteLast() {
		if(head == null) return;
		if(head.next == null) {
			head = null;
			return;
		}
		Node<E> temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.prev.next = null;
	}

	void printList() {
		if(head == null) return;
		Node<E> temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

}
