package data.structures;

public final class Node<E> {
	private final E value;
	private Node<E> next;

	public Node(E value) {
		this(value, null);
	}

	public Node(E value, Node<E> next) {
		this.value = value;
		setNext(next);
	}

	public E getValue() {
		return value;
	}

	public Node<E> getNext() {
		return next;
	}

	public void setNext(Node<E> next) {
		this.next = next;
	}

	@Override
	public String toString() {
		String node = "(" + value + ")";
		if (next != null) {
			node += " -> " + next;
		}
		return node;
	}
}