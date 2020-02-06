package linkedlist;

public class CircularLinkedList extends SinglyLinkedList {
	private Node last;

	public boolean isEmpty() {
		return getFirst() == null;
	}
	
	public void insertFront(int data) {
		Node temp = new Node(data);
		if (isEmpty()) {
			last = temp;
		}
		temp.next = getFirst();
		setFirst(temp);
	}

	public void insertBack(int data) {
		if (isEmpty()) {
			insertFront(data);
		} else {
			Node temp = new Node(data);
			last.next = temp;
			last = last.next;
		}
	}

	public Node deleteFront() {
		Node temp = getFirst();
		if (getFirst().next == null) {
			last = null;
		}
		setFirst(getFirst().next);
		return temp;
	}

	public Node deletBack() {
		Node temp;
		Node dummy = getFirst();
		if (dummy.next == null) {
			setFirst(null);
			last = null;
			return dummy;
		} else {
			while (dummy.next.next != null) {
				dummy = dummy.next;
			}
			last = dummy;
			temp = dummy.next;
			dummy.next = null;
		}
		return temp;
	}

	public String toString() {
		Node temp = getFirst();
		String s = "";
		while (temp != null) {
			s += ("|------------|") + "\n";
			s += ("|     |      |") + "\n";
			s += ("|  " + temp.data + "  | next |") + "\n";
			s += ("|     |  /   |") + "\n";
			s += ("|-------/----|") + "\n";
			s += ("       /") + "\n";
			s += ("      /") + "\n";
			s += ("     /") + "\n";
			s += ("    ◣") + "\n";

			temp = temp.next;
		}
		s += ("NULL");
		return s;

	}

}