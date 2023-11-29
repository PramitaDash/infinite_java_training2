package com.java.ex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExp {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {//The code inside the following curly braces is enclosed in a `try` block.
            int[] arr = new int[3]; //You declare an integer array `arr` with a length of 3.
            for (int i = 0; i < 3; i++) {// You start a loop to read three integers from the user.
                System.out.print("Enter an integer: ");//This line prints a prompt to the console, asking the user to enter an integer.
                arr[i] = scanner.nextInt(); // Inside the loop, you attempt to read an integer input from the user using `scanner.nextInt()
            }
        } catch (InputMismatchException e) {//You have a `catch` block set up to catch an `InputMismatchException`
            System.out.println("Input mismatch exception.");// Inside the `catch` block, you print "Input mismatch exception" to the console.
        }
    }

}
