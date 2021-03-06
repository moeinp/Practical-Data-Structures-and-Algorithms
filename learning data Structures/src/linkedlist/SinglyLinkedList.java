package linkedlist;

public class SinglyLinkedList {
	private Node first;

	SinglyLinkedList() {
	}


	public void insertFront(int data) {
		Node temp = new Node(data);
		temp.next = getFirst();
		setFirst(temp);
	}

	public void insertBack(int data) {
		Node temp = getFirst();
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = new Node(data);

	}

	public Node deleteFront() {
		Node temp = getFirst();
		setFirst(getFirst().next);
		return temp;
	}

	public Node deletBack() {
		Node temp;
		Node dummy = getFirst();
		if (dummy.next == null) {
			setFirst(null);
			return dummy;
		} else {
			while (dummy.next.next != null) {
				dummy = dummy.next;
			}
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


	public Node getFirst() {
		return first;
	}


	public void setFirst(Node first) {
		this.first = first;
	}

}
