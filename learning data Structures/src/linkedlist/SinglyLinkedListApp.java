package linkedlist;

public class SinglyLinkedListApp {
	public static void main(String[] args) {
		SinglyLinkedList myList = new SinglyLinkedList();
		myList.insertFront(0);
		System.out.println("Insert 0 to Front");
		System.out.println(myList.toString());
		System.out.println();

		myList.insertFront(1);
		System.out.println("Insert 1 to Front");
		System.out.println(myList.toString());
		System.out.println();

		myList.insertFront(2);
		System.out.println("Insert 2 to Front");
		System.out.println(myList.toString());
		System.out.println();

		myList.deleteFront();
		System.out.println("Delet Front");
		System.out.println(myList.toString());
		System.out.println();

		myList.deleteFront();
		System.out.println("Delet Front");
		System.out.println(myList.toString());
		System.out.println();

		myList.insertBack(3);
		System.out.println("Insert 3 to Back");
		System.out.println(myList.toString());
		System.out.println();

		myList.insertBack(9);
		System.out.println("Insert 9 to Back");
		System.out.println(myList.toString());
		System.out.println();

		myList.deletBack();
		System.out.println("Delet Back");
		System.out.println(myList.toString());
		System.out.println();

		myList.deletBack();
		System.out.println("Delet Back");
		System.out.println(myList.toString());
		System.out.println();

		myList.deletBack();
		System.out.println("Delet Back");
		System.out.println(myList.toString());
		System.out.println();

		myList.insertFront(9);
		System.out.println("Insert 9 to Front");
		System.out.println(myList.toString());
		System.out.println();

	}

}
