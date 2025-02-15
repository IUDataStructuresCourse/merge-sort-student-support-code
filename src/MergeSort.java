import java.util.ArrayList;

public class MergeSort {

    /*
      Returns the number of elements in the half-open range [begin, end).
      Time complexity: O(n)
     */
    public static <E>
    int distance(Iterator<E> begin, Iterator<E> end) {
        int n = 0;
        for (Iterator<E> i = begin.clone(); !i.equals(end); i.advance()) {
            ++n;
        }
        return n;
    }

    /*
     Copies the elements in the range `[source_begin,source_end)` into the
     range `[destintation_begin, destination_end)`
     where `destintation_end` is the return value of `copy`.
     Time complexity: O(n)
     */
    public static <E>
    Iterator<E> copy(Iterator<E> source_begin, Iterator<E> source_end, Iterator<E> destination_begin) {
        Iterator<E> destination_end = destination_begin.clone();
        for (Iterator<E> i = source_begin.clone(); !i.equals(source_end); i.advance()) {
            destination_end.set(i.get());
            destination_end.advance();
        }
        return destination_end;
    }

    /*
      Create an array of the specified size, with all the elements initialized to `null`.
     */
    public static <E>
    ArrayList<E> make_array(int size) {
        ArrayList<E> array = new ArrayList<>(size);
        for (int i = 0; i != size; ++i) {
            array.add(null);
        }
        return array;
    }

    /*
     Precondition: the input ranges [begin1,end1) and [begin2,end2) are sorted.
     Let n be the number of elements in the first range and m be the number of elements in the second range.
     The elements from both ranges are written to the range [result, result.advance(n+m)) in such a way
     that the result is in sorted order according to `Comparable`.
     Returns an iterator for the position result.advance(n+m).
     */
    public static <E extends Comparable<? super E>>
    Iterator<E> merge(Iterator<E> begin1, Iterator<E> end1,
                      Iterator<E> begin2, Iterator<E> end2,
                      Iterator<E> result) {
        // FILL IN
    }

    /*
    The `begin` and `end` iterators represent the half-open range
    `[begin,end)` of a sequence. After the call to `sort`, the range
    `[begin,end)` contains the same elements as before, but sorted
    from low to high according to the `Comparable` ordering.
     */
    public static <E extends Comparable<? super E>>
    void sort(Iterator<E> begin, Iterator<E> end) {
        // FILL IN
    }
}
