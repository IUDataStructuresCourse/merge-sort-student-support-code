public class LinkIterator<T> implements Iterator<T> {

	Node<T> node;

	LinkIterator(Node<T> p) { node = p; }

	public T get() { return node.data; }

	public void set(T x) { node.data = x; }

	public void advance() { node = node.next; }

	public void advance(int n) {
		for (; n > 0; --n) {
			advance();
		}
	}

	public boolean equals(Iterator<T> other) {
		return node == ((LinkIterator<T>)other).node;
	}

	public LinkIterator<T> clone() {
		return new LinkIterator<T>(node);
	}

}
