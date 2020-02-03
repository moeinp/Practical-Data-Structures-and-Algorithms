package adt;

public class Counter {
	private int numb;
	private String name;

	public Counter(String name) {
		this.name = name;
		this.numb = 0;
	}

	public void increment() {
		this.numb++;
	}

	public int getCurrentValue() {
		return this.numb;
	}

	public String toString() {
		return name + ": " + numb;
	}

}