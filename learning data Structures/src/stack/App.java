package stack;

public class App {

	public static void main(String[] args) {
		IntStack myStack = new IntStack(5);
		System.out.println("Stack Size: " + myStack.maxSize);
		System.out.println();

		try {
			int i = 1;
			while (!myStack.isFull()) {
				System.out.println("push: " + i);
				myStack.push(i);
				i++;
				System.out.println(myStack.toString());
				System.out.println();
			}
			System.out.println("push: " + 6);
			System.out.println(myStack.toString());
			myStack.push(6);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Stack is full, can not push anything.");
		}

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		try {
			while (!myStack.isEmpty()) {
				System.out.println("pop: " + myStack.pop());
				System.out.println(myStack.toString());
				System.out.println();
			}
			System.out.println("pop: " + 0);
			System.out.println(myStack.toString());
			myStack.pop();
			System.out.println();
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Stack is empty, can not pop anything.");
		}
	}

}
