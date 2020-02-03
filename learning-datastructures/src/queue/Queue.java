package queue;

public class Queue {
	int maxSize;
	int[] queueArray;
	int intdexOfBottom;

	public Queue(int maxSize) {
		this.maxSize = maxSize;
		queueArray = new int[maxSize];
	}
}
