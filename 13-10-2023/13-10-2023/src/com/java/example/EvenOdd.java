package com.java.example;

import java.util.Scanner;

public class EvenOdd {
	
	public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();//This line reads an integer input from the user using the `nextInt()` method of the `Scanner` class. The entered number is stored in the integer variable `num`.

        if(num % 2 == 0)//This line starts an `if` statement, which checks if the number `num` is even. The condition `num % 2 == 0` checks if `num` is divisible by 2 with no remainder.
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }

}
