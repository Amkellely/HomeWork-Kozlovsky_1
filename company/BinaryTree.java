package com.company;

public interface BinaryTree<T> {
    boolean isEmpty();
    void add(T data);
    Node<T> findMind(Node<T> root);
    T findMax();
    void delete(T data);
    boolean contains(T data);
}
