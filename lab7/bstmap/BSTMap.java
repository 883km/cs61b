package bstmap;

import java.util.Iterator;
import java.util.Set;

public class BSTMap<K extends Comparable<K>, V> implements Map61B<K, V> {
    private class BSTNode {
        K key;
        V value;
        BSTNode left;
        BSTNode right;
        int size;
    }
    BSTNode root;

    @Override
    public void clear() {
        root = null;
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
        return root.size;
    }

    @Override
    public void put(K key, V value) {

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
