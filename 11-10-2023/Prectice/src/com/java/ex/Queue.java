package com.java.ex;

import java.util.LinkedList;

public interface Queue {

	 public static void main(String[] args) {
	        java.util.Queue<String> queue = new LinkedList<>();
	queue.offer("Pramita");
	queue.offer("Ananya");
	 queue.offer("Khafia");
	// Accessing and removing elements from the Queue 
    String firstInQueue = queue.poll();
    System.out.println("Removed from the front of the queue: " + firstInQueue);

    // Peeking at the front element without removing it
    String frontOfQueue = queue.peek();
    System.out.println("Front of the queue: " + frontOfQueue);

    // Iterating through the Queue
    System.out.println("Queue elements:");
    for (String element : queue) {
        System.out.println(element);
    }

    // Checking if the Queue contains a specific element
    boolean containsAnanya = queue.contains("Ananya");
    System.out.println("Contains 'Ananya'? " + containsAnanya);

    // Checking the size of the Queue
    int size = queue.size();
    System.out.println("Queue size: " + size);

    // Checking if the Queue is empty
    boolean isEmpty = queue.isEmpty();
    System.out.println("Is Queue empty? " + isEmpty);

    // Clearing the Queue
    queue.clear();
    System.out.println("Queue after clearing: " + queue);
}
}

