package data.structures;

import java.util.NoSuchElementException;
import data.types.Stack;

public class StackImpl<E> implements Stack<E> {
	private Node<E> head = null;
	private int size = 0;

	public void push(E element) {
		head = new Node<E>(element, head);
		size++;
	}

	public E pop() {
		if (size == 0) {
			throw new NoSuchElementException();
		}
		E value = head.getValue();
		head = head.getNext();
		size--;
		return value;
	}

	public E peek() {
		return (head != null) ? head.getValue() : null;
	}

	public int size() {
		return size;
	}

	@Override
	public String toString() {
		return head.toString();
	}
}