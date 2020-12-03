import java.util.Arrays;

public class MinHeap {
	
	private int capacity;
	private int size;
	private int[] a;
	
	public MinHeap(int capacity) {
		this.capacity = capacity;
		this.size = 0;
		this.a = new int[capacity];
	}
	
	private int leftChildIndex(int i) {
		return 2 * i + 1;
	}
	
	private int rightChildIndex(int i) {
		return 2 * i + 2;
	}
	
	private int parentIndex(int i) {
		return (i - 1) / 2;
	}
	
	private boolean hasLeft(int i) {
		return leftChildIndex(i) < size;
	}
	
	private boolean hasRight(int i) {
		return rightChildIndex(i) < size;
	}
	
	private boolean hasParent(int i) {
		return parentIndex(i) >= 0;
	}
	
	private int leftChild(int i) {
		return a[leftChildIndex(i)];
	}
	
	private int rightChild(int i) {
		return a[rightChildIndex(i)];
	}
	
	private int parent(int i) {
		return a[parentIndex(i)];
	}
	
	private void swap(int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	private void ensureCapacity() {
		if(size == capacity) {
			a = Arrays.copyOf(a, capacity * 2);
			capacity *= 2;
		}
	}
	
	public int peek() {
		if(size == 0) throw new IllegalStateException();
		return a[0];
	}
	
	public int poll() {
		if(size == 0) throw new IllegalStateException();
		int item = a[0];
		a[0] = a[size - 1];
		size--;
		heapifyDown();
		return item;
	}
	
	public void add(int x) {
		ensureCapacity();
		a[size++] = x;
		heapifyUp();
	}
	
	private void heapifyUp() {
		int index = size - 1;
		while(hasParent(index) && a[index] < parent(index)) {
			swap(index, parentIndex(index));
			index = parentIndex(index);
		}
	}
	
	private void heapifyDown() {
		int index = 0;
		while(hasLeft(index)) {
			int minChildIndex = leftChildIndex(index);
			if(hasRight(index) && rightChild(index) < leftChild(index)) {
				minChildIndex = rightChildIndex(index);
			}
			if(a[index] < a[minChildIndex]) {
				break;
			} else {
				swap(index, minChildIndex);
			}
			index = minChildIndex;
		}
	}

}
