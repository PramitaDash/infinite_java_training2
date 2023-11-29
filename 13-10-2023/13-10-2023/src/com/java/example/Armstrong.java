package com.java.example;

public class Armstrong {

	 public static void main(String[] args) {

	        int number = 371, originalNumber, remainder, result = 0;

	        originalNumber = number;//This line assigns the value of `number` to `originalNumber` to preserve the original value of the number for comparison.

	        while (originalNumber != 0)
	        {
	            remainder = originalNumber % 10;//`remainder` stores the last digit of `originalNumber` obtained using the modulo operator
	            result += Math.pow(remainder, 3);//`result` is updated by adding the cube of the `remainder`
	            originalNumber /= 10;//The last digit is removed from `originalNumber` by integer division by 10.
	        }

	        if(result == number)
	            System.out.println(number + " is an Armstrong number.");
	        else
	            System.out.println(number + " is not an Armstrong number.");
	    }
}
