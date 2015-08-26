package data.types;

// Last-in, First-out
public interface Stack<E> {
	public void push(E element);
	public E pop();
	public E peek();
	public int size();
}