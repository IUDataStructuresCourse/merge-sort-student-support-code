import java.util.ArrayList;

public class ArrayListIterator<T> implements Iterator<T> {
    private ArrayList<T> array;
    private int pos;
    public ArrayListIterator(ArrayList<T> a, int p) { array = a; pos = p; }
    public T get() { return array.get(pos); }
    public void set(T x) { array.set(pos, x); }
    public void advance() { ++pos; }
    public void advance(int n) { pos += n; }
    public ArrayListIterator<T> clone() { return new ArrayListIterator<T>(array,pos); }
    public boolean equals(Iterator<T> other) {
        ArrayListIterator<T> i = (ArrayListIterator<T>) other;
        return pos == i.pos;
    }
    public String toString() {
        return "ArrayListIterator(" + String.valueOf(pos) + ")";
    }
}

