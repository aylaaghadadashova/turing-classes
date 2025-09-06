package linkedlist;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Objects;

public class SinglyLinkedList<T> {

    public static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }
    }

    private int size;
    private Node<T> first;

    public SinglyLinkedList(){
        this.size = 0;
        this.first = null;
    }

    public Node<T> getFirst() {
        return first;
    }

    public void setFirst(Node<T> first) {
        this.first = first;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        SinglyLinkedList<?> that = (SinglyLinkedList<?>) object;
        return size == that.size && Objects.equals(first, that.first);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, first);
    }

    public void addFirst(T v){
        Node<T> f = first;
        Node<T> newNode = new Node<>(v, f);
        first = newNode;
        size++;
    }

    public void addAt(int index, T v){
        if(index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }

        if(index == 0){
            first = new Node<>(v, first);
        } else {
            Node<T> current = first;
            for(int i = 1; i < index; i++){
                current = current.next;
            }
            current.next = new Node<>(v, current.next);
        }
        size++;
    }

    public void removeFirst(){
        Node<T> f = first;
        if(f == null){
            throw new NoSuchElementException();
        }
        first = first.next;
        f.next = null;
        f.data = null;
        size--;
    }

    public void removeAt(int index){
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }

        if(index == 0){
            removeFirst();
        } else {
            Node<T> current = first;
            for(int i = 1; i < index; i++){
                current = current.next;
            }
            Node<T> removedNode = current.next;
            current.next = removedNode.next;
            removedNode.next = null;
            removedNode.data = null;
            size--;
        }
    }

    public T get(int index){
        if(index < 0 && index >= size){
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }

        Node<T> current = first;
        for(int i = 0; i<index; i++){
            current = current.next;
        }
        return current.data;
    }

    public boolean contains(T v){
        Node<T> current = first;
        while(current != null){
            if(current.data.equals(v)){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public String toString(){
        if(first == null) return "[]";

        StringBuilder sb = new StringBuilder();
        sb.append("[");

        Node<T> current = first;
        while(current != null){
            sb.append(current.data);
            if(current.next != null) sb.append(", ");
            current = current.next;
        }

        sb.append("]");
        return sb.toString();
    }
    public void printList(){
        System.out.println(this.toString());
    }
}
