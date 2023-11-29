package com.java.ex;

public class CatchExample {
	
	public static void main(String[] args) {  
        int i=50;  //This line declares and initializes an integer variable `i` with the value 50
        int j=0;  //This line declares and initializes an integer variable `j` with the value 0.
        int data; //This line declares an integer variable `data` without initializing it. 
        try  //The code inside the curly braces after `try` is where an exception might occur, so it's enclosed in a try block for exception handling.
        {  
        data=i/j; //This line attempts to divide the value of `i` by the value of `j`, which is 0. This will result in an `ArithmeticException` due to division by zero.  
        }  
            // handling the exception  
        catch(Exception e) //Here, you catch and handle the exception of type `Exception`
        {  
             // resolving the exception in catch block  
            System.out.println(i/(j+2)); //In this case, `j + 2` is used to avoid another division by zero, and the result is 25 (50 divided by 2).
        }
	}

}
