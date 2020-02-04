package linkedlist;

public class Node {
	int data;
	Node next = null;

	Node(int val) {
		this.data = val;
	}

	public void displayNode() {
		System.out.println("{" + data + "}");
	}

}
