package deque;

public class ArrayDeque<T> {
    private T[] items;
    private int size;
    private int first; // Index of the first item in the circular queue.
    private int last; // Index of the last item in the circular queue.

    public ArrayDeque() {
        items = (T []) new Object[8];
        size = 0;
    }

    public void addFirst(T item) { // TODO
        if (size == items.length) {
            resize(size * 2);
        }
        size += 1;
        if (size == 1) {
            items[0] = item;
            first = 0;
            last = 0;
        } else {
            // TODO
        }

    }

    public void addLast(T item) {
        if (size == items.length) {
            resize(size * 2);
        }
        size += 1;
        if (size == 1) {
            items[0] = item;
            first = 0;
            last = 0;
        } else {
            last += 1;
            items[last] = item;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public T removeFirst() { // TODO
        if (size > 0) {

        }
        return null;
    }

    public T removeLast() {
        if (size > 0) {
            shrinkArray();
            T lastItem = items[last];
            items[last] = null;
            size -= 1;
            last -= 1;
            return lastItem;
        }
        return null;
    }

    public T get(int index) { // TODO: needs to confirm which index he means.
        if (size > 0 && index < size) {
            return items[index];
        }
        return null;
    }

    public void printDeque() { // TODO
        if (size > 0) {
            for (int i = 0; i < size; i++) {
                System.out.print(items[i] + " ");
            }
            System.out.println();
        }
    }

    /** Helper methods below. */
    private void resize(int capacity) { // TODO
        T[] newItems = (T []) new Object[capacity];
        System.arraycopy(items, 0, newItems, 0, size);
        items = newItems;
    }

    /** check array usage and shrink array length if usage < 25%. */
    private void shrinkArray() {
        if ((size <= items.length / 4) && (size > 4)) {
            resize(items.length / 4);
        }
    }
}
