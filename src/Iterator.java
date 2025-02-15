public interface Iterator<T> {
    // The get() method returns the element at the current position.
    T get();
    // The set() method writes the element e into the current position of the sequence.
    void set(T e);
    // The advance() method moves the iterator to the next position.
    void advance();
    // Advance `n` times.
    void advance(int n);
    // The equals() method tests whether this iterator is at the same position
    // as the other iterator.
    boolean equals(Iterator<T> other);
    // The clone() method creates a new iterator at the same position as this iterator.
    Iterator<T> clone();
}
