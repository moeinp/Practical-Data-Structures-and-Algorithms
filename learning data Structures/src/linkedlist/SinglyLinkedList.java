package linkedlist;

public class SinglyLinkedList {
	private Node first;

	SinglyLinkedList() {
	}

	public boolean isEmpty() {
		return first == null;
	}

	public void insertFirst(int data) {
		Node temp = new Node(data);
		temp.next = first.next;
		first.next = temp;
	}

}
