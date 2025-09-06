package linkedlist;

import java.util.Random;

public class LinkedListApp {

    public static void main(String[] args) {

        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        Random rand = new Random();

        for(int i = 0; i < 20; i++){
            int value = rand.nextInt(100);
            list.addAt(list.getSize(), value);
        }

        System.out.println("List after adding 20 random elements:");
        list.printList();

        System.out.println("Element at index 5: " + list.get(5));

        int testValue = rand.nextInt(100);
        System.out.println("Does the list contain " + testValue + "? " + list.contains(testValue));

        list.removeAt(0);
        list.removeFirst();

        System.out.println("List after some removals:");
        list.printList();
    }
}
