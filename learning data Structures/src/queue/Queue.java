package queue;

public class Queue {
	int maxSize;
	int[] queueArray;
	int BackIndex;

	public Queue(int maxSize) {
		this.maxSize = maxSize;
		queueArray = new int[maxSize];
		BackIndex = -1;
	}

	public void add(int val) {
		if (isFull()) {
			throw new IndexOutOfBoundsException("Queue is full");
		} else {
			BackIndex++;
			queueArray[BackIndex] = val;
		}
	}

	public int remove() {
		if (isEmpty()) {
			throw new IndexOutOfBoundsException("Queue is empty");
		} else {
			int temp = queueArray[0];
			if (BackIndex < 1) {
				BackIndex--;
			} else {
				for (int i = 0; i < BackIndex; i++) {
					queueArray[i] = queueArray[i + 1];
				}
				BackIndex--;
			}
			return temp;
		}
	}

	public int peek() {
		if (isEmpty()) {
			throw new IndexOutOfBoundsException("Queue is empty");
		}
		return queueArray[0];
	}

	public boolean isFull() {
		return BackIndex == queueArray.length - 1;
	}

	public boolean isEmpty() {
		return BackIndex == -1;
	}

	public int getMaxSize() {
		return maxSize;
	}

	public String toString() {
		String s = "| ";
		for (int i = 0; i <= BackIndex; i++) {
			s = s + queueArray[i] + " | ";
		}
		return s;
	}

}
