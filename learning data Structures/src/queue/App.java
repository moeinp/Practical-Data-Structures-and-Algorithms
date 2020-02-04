package queue;

public class App {

	public static void main(String[] args) {
		Queue myQueue = new Queue(3);
		System.out.println("Queue Size: " + myQueue.maxSize);
		System.out.println();

		try {

			myQueue.add(1);
			System.out.println("add: " + myQueue.peek());
			System.out.println("Queue: " + myQueue.toString());
			System.out.println();

			myQueue.add(2);
			System.out.println("add: " + 2);
			System.out.println("Queue: " + myQueue.toString());
			System.out.println();

			System.out.println("remove " + myQueue.peek());
			myQueue.remove();
			System.out.println("Queue: " + myQueue.toString());
			System.out.println();

			myQueue.add(3);
			System.out.println("add: " + 3);
			System.out.println("Queue: " + myQueue.toString());
			System.out.println();

			myQueue.add(4);
			System.out.println("add: " + 4);
			System.out.println("Queue: " + myQueue.toString());
			System.out.println();

			System.out.println("remove " + myQueue.peek());
			myQueue.remove();
			System.out.println("Queue: " + myQueue.toString());
			System.out.println();

			System.out.println("remove " + myQueue.peek());
			myQueue.remove();
			System.out.println("Queue: " + myQueue.toString());
			System.out.println();

			System.out.println("remove " + myQueue.peek());
			myQueue.remove();
			System.out.println("Queue: " + myQueue.toString());
			System.out.println();

			myQueue.remove();
			System.out.println();

		} catch (IndexOutOfBoundsException e) {
			System.out.println("remove: ");
			System.out.println("Can not remove Queue is empty");
			System.out.println("Queue: " + myQueue.toString());

		}
		System.out.println();
		try {

			myQueue.add(1);
			System.out.println("add: " + myQueue.peek());
			System.out.println("Queue: " + myQueue.toString());
			System.out.println();

			myQueue.add(2);
			System.out.println("add: " + 2);
			System.out.println("Queue: " + myQueue.toString());
			System.out.println();

			myQueue.add(3);
			System.out.println("add: " + 3);
			System.out.println("Queue: " + myQueue.toString());
			System.out.println();

			myQueue.add(4);
			System.out.println("add: " + 4);
			System.out.println("Queue: " + myQueue.toString());
			System.out.println();

		} catch (IndexOutOfBoundsException e) {

			System.out.println("add: 4");
			System.out.println("Can not add Queue is full");
			System.out.println("Queue: " + myQueue.toString());

		}

	}
}
