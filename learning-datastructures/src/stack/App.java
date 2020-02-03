package stack;

public class App {

	public static void main(String[] args) {
		IntStack myStack = new IntStack(10);
		System.out.println("max size: " + myStack.getMaxSize());
		System.out.println();

		try {
			for (int i = 1; i <= 11; i++) {
				myStack.push(i);
				System.out.println("push " + i);
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Stack is full, can not push anything.");
		}

		System.out.println();

		try {
			for (int j = 11; j > 0; j--) {
				System.out.println("pop " + myStack.pop());
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Stack is empty, can not pop anything.");
		}

	}

}
