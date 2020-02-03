package queue;


public class App {

	public static void main(String[] args) {
		Queue myQueue = new Queue(10);
		System.out.println("max size: " + myQueue.getMaxSize());
		System.out.println();

		try {
			for (int i = 1; i <= 11; i++) {
				myQueue.push(i);
				System.out.println("push " + i);
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Stack is full, can not push anything.");
		}

		System.out.println();

		try {
			for (int j = 11; j > 0; j--) {
				System.out.println("pop " + myQueue.pop());
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Stack is empty, can not pop anything.");
		}

	}

}
