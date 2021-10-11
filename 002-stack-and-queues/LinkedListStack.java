/*
Coded by Arun Jangir, Kaust 2021 
from data-structure and algorithms course
Stack like pile of books.
The most recent item added will pe popped first if qeuired.
Work on the principle of Last-In-First-Out*/

public class LinkedListStack {

    private class Node {
        String item;
        Node next;
    }

    Node first;

    public boolean isEmpty() {
        return first == null;
    }

    public void push(String item) {
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
    }

    public String pop() {
        String item = first.item;
        first = first.next;
        return item;
    }
}