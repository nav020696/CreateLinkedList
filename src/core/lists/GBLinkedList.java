package core.lists;

import core.GBList;

import java.util.Iterator;

public class GBLinkedList<T> implements GBList<T> {
    private int size;
    private Node<T> headList;

    public GBLinkedList() {
        this.size = 0;
        this.headList = null;
    }

    @Override
    public void add(T elem) {
        Node<T> element = new Node<>(elem, null);
        if (headList == null){
            headList = element;
        } else {
            Node<T> temp = check(headList);
            temp.next = element;
        }
        size++;
    }

    private Node<T> check(Node<T> node){
        if (node.next == null){
            return node;
        } else{
            return check(node.next);
        }

    }

    @Override
    public void remove(int index) {

    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(printNode(headList)).reverse();
        builder.insert(0, "[");
        builder.append("]");
        return builder.toString();
    }
    private String printNode(Node<T> node){
        if (node.next == null){
            return node.toString();
        }
        return printNode(node.next) + " ," + node;
    }

    private static class Node<T>{
        T value;
        Node<T> next;
        public Node(T value, Node<T> next) {
            this.value = value;
            this.next= next;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }
}
