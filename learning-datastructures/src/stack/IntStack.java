package stack;

public class IntStack {
	int maxSize;
	private int[] stackArray;
	private int indexOfTop;

	public IntStack(int maxSize) {
		this.maxSize = maxSize;
		stackArray = new int[maxSize];
		indexOfTop = -1;
	}

	public void push(int value) {
		if (isFull()) {
			throw new IndexOutOfBoundsException("Stack is full");
		} else {
			indexOfTop += 1;
			stackArray[indexOfTop] = value;
		}
	}

	public int pop() {
		if (isEmpty()) {
			throw new IndexOutOfBoundsException("Stack is empty");
		} else {
			indexOfTop -= 1;
			return stackArray[indexOfTop + 1];
		}
	}

	public int peek() {
		if (isEmpty()) {
			throw new IndexOutOfBoundsException("Stack is empty");
		} else {
			return stackArray[indexOfTop];
		}
	}

	public boolean isEmpty() {
		return indexOfTop == -1;
	}

	public boolean isFull() {
		return indexOfTop == maxSize - 1;

	}

	public int getMaxSize() {
		return maxSize;
	}

	public String toString() {
		String s = "| ";
		for (int i = 0; i <= indexOfTop; i++) {
			s = s + stackArray[i] + " | ";
		}
		return s;
	}

}
