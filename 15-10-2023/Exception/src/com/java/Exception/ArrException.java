package com.java.ex;

public class ArrException {
	
	public static void main(String[] args) {
		int arr[] = new int[]{1,2,3};//This line declares an integer array named `arr` and initializes it with the values 1, 2, and 3.

		try {//The code inside the curly braces after `try` is where an exception might occur, so it's enclosed in a try block for exception handling.
			System.out.println(arr[4]);//This line tries to access the element at index 4 of the `arr` array, which is out of bounds since the array has a length of 3
		} catch (ArrayIndexOutOfBoundsException e) {//Here, you catch and handle the exception of type `ArrayIndexOutOfBoundsException`.
		
			System.out.println("It's Array Out of Bound...");//If an `ArrayIndexOutOfBoundsException` occurs, this line will be executed, and it will print "It's Array Out of Bound..." to the console.
		}
		
	}

}
