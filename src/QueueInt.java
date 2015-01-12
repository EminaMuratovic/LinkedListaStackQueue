
public class QueueInt {
	private Node head;
	private Node tail;
	
	public QueueInt() {
		head = null;
		tail = null;
	}
	
	public void push(int value) {
		Node newNode = new Node(value);
		if(head == null) {
			head = newNode;
			tail = newNode;
			return;
		}
		tail.next = newNode;
		tail = newNode;
	}
	
	public int pop() {
		if(head == null)
			throw new IllegalArgumentException("Queue is empty!");
		int value = head.value;
		if(head == tail) {
			head = null;
			tail = null;
			return value;
		}
		Node current = head;
		head = head.next;
		current = null;
		return value;
	}
	
	public int getSize() {
		if(head == null)
			return 0;
		return getSize(head, 0);
	}
	
	public int peek() {
		if(head == null)
			throw new IllegalArgumentException("Queue is empty!");
		return head.value;
	}
	
	
	private int getSize(Node current, int counter) {
		if(current == null)
			return counter;
		return getSize(current.next, counter + 1);
	}
	
	public boolean contains(int value) {
		if(head.value == value)
			return true;
		return contains(head, value);
	}
	
	private boolean contains(Node current, int value) {
		if(current == null)
			return false;
		if(current.value == value)
			return true;
		return contains(current.next, value);
	}
	
	private class Node {
		public int value;
		public Node next;

		public Node(int value) {
			this.value = value;
			next = null;
		}
	}

}
