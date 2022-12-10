package com.github.zipcodewilmington;

public class Node<KVdata extends Comparable<KVdata>>{

    KVdata data;
    Node<KVdata> next;

    public Node(KVdata data, Node<KVdata> next) {
        this.data = data;
        this.next = next;
    }

    public Node (KVdata data){
        this.data = data;
        this.next = null;
    }

    public Node<KVdata> getNext() {
        return next;
    }

    public boolean hasNext(){
        return getNext() != null;
    }

    public void setNext(Node<KVdata> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                "} ";
    }
}