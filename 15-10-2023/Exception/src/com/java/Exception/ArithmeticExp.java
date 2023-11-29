package com.java.ex;

public class ArithmeticExp {
	
	public static void main(String[] args) {
		int arr[] = new int [] {2,3,5}; // This line declares an integer array named `arr` and initializes it with the values 2, 3, and 5.
		try {//The code inside the curly braces after `try` is where an exception might occur, so it's enclosed in a try block for exception handling.
			int a = arr[2]/0;//This line attempts to divide the value at index 2 of the `arr` array by 0, which is not allowed in Java and will result in an `ArithmeticException
		} catch (ArithmeticException e) {//Here, we specify that we want to catch and handle exceptions of type `ArithmeticException`
			// TODO Auto-generated catch block
			System.out.println("Cannnot be Divisible...");//If an `ArithmeticException` occurs then this line will be executed, and it prints "Cannot be Divisible..." to the console.this line will be executed, and it prints "Cannot be Divisible..." to the console.
		}
	}

}
