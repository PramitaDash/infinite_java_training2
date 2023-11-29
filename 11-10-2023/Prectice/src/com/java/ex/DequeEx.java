package com.java.ex;

import java.util.ArrayDeque;
import java.util.Deque;

public interface DequeEx {
	
	 public static void main(String[] args) {
	        Deque<Integer> deque = new ArrayDeque<>();
	        deque.addFirst(1);
	        deque.addFirst(2);
	        deque.addFirst(3);

	        // Add elements to the rear of the Deque
	        deque.addLast(4);
	        deque.addLast(5);
	        // Peek at the elements at the front and rear of the Deque
	        int frontElement = deque.peekFirst();
	        int rearElement = deque.peekLast();

	        System.out.println("Front element: " + frontElement);
	        System.out.println("Rear element: " + rearElement);
	}
	}



