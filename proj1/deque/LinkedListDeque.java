package deque;

public class LinkedListDeque<T> {
    private class Node {
        public T item;
        public Node prev;
        public Node next;

        public Node(T i, Node p, Node n){
            item = i;
            prev = p;
            next = n;
        }
    }


    private Node sentinel;
    private int size;

    public LinkedListDeque() {
        sentinel = new Node(null, null,null);
        size = 0;
    }

    public LinkedListDeque(T item) {
        sentinel = new Node(null, null, null);
        Node first = new Node(item, sentinel, sentinel);
        sentinel.prev = first;
        sentinel.next = first;
        size = 1;
    }


    public void addFirst(T item) {
        size += 1;
        Node node = new Node(item, sentinel, sentinel.next);
        sentinel.next.prev = node;
        sentinel.next = node;
    }

    public void addLast(T item) {
        size += 1;
        Node node = new Node(item, sentinel.prev, sentinel);
        sentinel.prev.next = node;
        sentinel.prev = node;
    }

    public boolean isEmpty() {
        if (size == 0) {return true;}
        return false;
    }

    public int size() {
        return size;
    }

    public T removeFirst() {
        if (size > 0) {
            size -= 1;
            T first = sentinel.next.item;
            sentinel.next = sentinel.next.next;
            sentinel.next.prev = sentinel;
            return first;
        }
        return null;
    }

    public T removeLast() {
        if (size > 0) {
            size -= 1;
            T last = sentinel.prev.item;
            sentinel.prev = sentinel.prev.prev;
            sentinel.prev.next = sentinel;
            return last;
        }
        return null;
    }

    public T get(int index) {
        if (size > 0) {
            Node current = sentinel;
            for (int i = 0; i < size; i++) {
                current = sentinel.next;
            }
            return current.item;
        }
        return null;
    }

    public void printDeque() {
        if (size > 0) {
            Node current = sentinel.next;
            for (int i = 0; i < size; i++) {
                System.out.println(current.item + " ");
                current = current.next;
            }
            System.out.println();
        }
    }
}
