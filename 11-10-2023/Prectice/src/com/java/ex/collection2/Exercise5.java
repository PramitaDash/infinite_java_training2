//Queue implementation

package com.java.ex.collection2;
import java.util.LinkedList;
import java.util.Queue;

public class Exercise5 {
    public static void main(String[] args) {

    	Queue<String> queue = new LinkedList<>();
        // add elements to the queue
        queue.add("apple");
        queue.add("banana");
        queue.add("cherry");
        // print the queue
        System.out.println("Queue: " + queue);
        // remove the element at the front of the queue
        String front = queue.poll(); // Use poll() instead of remove()
        System.out.println("Removed element: " + front); 
        // print the updated queue
        System.out.println("Queue after removal: " + queue);
        // add another element to the queue
        queue.add("date");
        // peek at the element at the front of the queue
        String peeked = queue.peek();
        System.out.println("Peeked element: " + peeked);
        // print the updated queue
        System.out.println("Queue after peek: " + queue);

    }

}

