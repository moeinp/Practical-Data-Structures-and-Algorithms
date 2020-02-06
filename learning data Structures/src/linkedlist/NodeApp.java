package linkedlist;

public class NodeApp {
	public static void main(String[] args) {
		Node a = new Node(4);
		Node b = new Node(3);
		Node c = new Node(7);
		Node d = new Node(8);

		a.next = b;
		b.next = c;
		c.next = d;

		System.out.println(listLength(a));
		System.out.println(printList(a));
		

	}

	public static String printList(Node n) {
		Node temp = n;
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

	public static int listLength(Node n) {
		if (n == null) {
			return 0;
		}else {
			n = n.next;
			return 1 + listLength(n);
		}
	}
}
