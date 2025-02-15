public class Node<T> {
    public Node(T d, Node<T> n) { data = d; next = n; }
    public T data;
    public Node<T> next;
}
