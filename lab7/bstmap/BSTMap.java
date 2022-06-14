package bstmap;

import java.util.Iterator;
import java.util.Set;

public class BSTMap<K extends Comparable<K>, V> implements Map61B<K, V> {
    /** No need to instantiate BSTMap. Use put method instead. */
    BSTNode root;
    int size;

    private class BSTNode {
        K key;
        V value;
        BSTNode left;
        BSTNode right;

        public BSTNode(K k, V v) {
            key = k;
            value = v;
            left = null;
            right = null;
        }
    }

    @Override
    public void clear() {
        root = null;
        size = 0;
    }

    @Override
    public boolean containsKey(K key) {
        if (get(root, key) == null) {
            return false;
        }
        return true;
    }

    @Override
    public V get(K key) {
        return get(root, key);
    }

    private V get(BSTNode node, K key) {
        if (node == null) {
            return null;
        }
        int cmp = key.compareTo(node.key);
        if (cmp < 0) {
            return get(node.left, key);
        } else if (cmp > 0) {
            return get(node.right, key);
        } else {
            return node.value;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void put(K key, V value) {
        if (!containsKey(key)) {
            size += 1;
        }
        put(root, key, value);
    }

    private void put(BSTNode node, K key, V value) {
        if (node == null) {
            node = new BSTNode(key, value);
        }
        int cmp = key.compareTo(node.key);
        if (cmp < 0) {
            put(node.left, key, value);
        } else if (cmp > 0) {
            put(node.right, key, value);
        } else {
            node.value = value;  /* If key already exists, replace the value associated to that key. */
        }
    }

    public void printInOrder() {

    }

    @Override
    public Set<K> keySet() {
        return null; //throw exception
    }

    @Override
    public V remove(K key) {
        return null; //throw exception
    }

    @Override
    public V remove(K key, V value) {
        return null; //throw exception
    }

    @Override
    public Iterator<K> iterator() {
        return null; //throw exception
    }
}
