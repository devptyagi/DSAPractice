
public class SinglyLinkedList<E> {

	static class Node<E> {
		E data;
		Node<E> next;

		public Node(E data) {
			this.data = data;
			this.next = null;
		}
	}

	private Node<E> head = null;

	// Check if the linked list is empty.
	boolean isEmpty() {
		return head == null;
	}
	
	// Return the size of the list.
	int size() {
		if (this.isEmpty())
			return 0;
		int count = 0;
		Node<E> temp = head;
		while (temp != null) {
			temp = temp.next;
			count++;
		}
		return count;
	}

	// Add an element in the end.
	void add(E data) {
		if (this.isEmpty()) {
			this.addFirst(data);
			return;
		}
		this.addLast(data);
	}

	// Add an element in the beginning.
	void addFirst(E data) {
		Node<E> newNode = new Node<E>(data);
		if (this.isEmpty()) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}

	// Add an element in the end.
	void addLast(E data) {
		Node<E> newNode = new Node<E>(data);
		if (this.isEmpty()) {
			this.addFirst(data);
			return;
		}
		Node<E> temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}

	// Insert at a given index.
	void insert(int index, E data) {
		if (isEmpty() || this.size() <= index) {
			throw new IndexOutOfBoundsException("Index " + index + " out of bounds");
		}
		Node<E> temp = head;
		Node<E> newNode = new Node<E>(data);
		for (int i = 0; i < index - 1; i++) {
			temp = temp.next;
		}
		newNode.next = temp.next;
		temp.next = newNode;
	}

	// Delete the last element from the linked list.
	void deleteLast() {
		if (this.isEmpty())
			return;
		Node<E> temp = head;
		while (temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;
	}

	// Delete the first element from the linked list.
	void deleteFirst() {
		if (this.isEmpty())
			return;
		head = head.next;
	}

	// Print the linked list.
	void printList() {
		if (this.isEmpty())
			return;
		Node<E> temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	// Search for an element in the list.
	boolean linearSearch(E data) {
		if (this.isEmpty())
			return false;
		Node<E> temp = head;
		while (temp != null) {
			if (temp.data == data)
				return true;
			temp = temp.next;
		}
		return false;
	}
	
	// Return the middle element of the list.
	E getMiddleElement() {
		if(this.isEmpty()) 
			return null;
		Node<E> slow = head, fast = head;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}
	
	// Return nTh node from the end.
	E getNthNodeFromEnd(int n) {
		if(this.isEmpty())
			return null;
		Node<E> first = head, second = head;
		for(int i=0;i<n;i++) {
			if(first == null) return null;
			first = first.next;
		}
		while(first != null) {
			second = second.next;
			first = first.next;
		}
		return second.data;
	}
	
	// Reverse the linked list
	void reverse() {
		Node<E> curr = head;
		Node<E> prev = null;
		while(curr != null) {
			Node<E> next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
	}
	
	// Given a sorted linked list, Remove all duplicates.
	void removeDuplicatesFromSorted() {
		if(this.isEmpty())
			return;
		Node<E> curr = head;
		while(curr != null && curr.next != null) {
			if(curr.data == curr.next.data) {
				curr.next = curr.next.next;
			} else {
				curr = curr.next;
			}
		}
	}
	
}
