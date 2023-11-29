package com.java.example;

public class FibonacciExample2 {
	
	 static int n1=0,n2=1,n3=0;  //This line declares three static integer variables `n1`, `n2`, and `n3`. These variables are used to keep track of the Fibonacci sequence. `n1` is initialized to 0, `n2` to 1, and `n3` to 0.  
	 static void printFibonacci(int count){ // This line defines a static method named `printFibonacci`. The method takes an integer parameter `count`, which represents the number of Fibonacci numbers to be generated and printed.
   
	    if(count>0){ // The `if` statement checks if the value of `count` is greater than 0, ensuring that the code for generating and printing Fibonacci numbers is executed if `count` is a positive integer  
	         n3 = n1 + n2;    //These lines calculate the next Fibonacci number in the sequence. `n3` is set to the sum of `n1` and `n2`, `n1` is then updated to the value of `n2`, and `n2` is updated to the value of `n3`
	         n1 = n2;    
	         n2 = n3;    
	         System.out.print(" "+n3); //This line prints the value of the newly calculated Fibonacci number `n3` with a space separator.  
	         printFibonacci(count-1); //The `printFibonacci` method is recursively called with the `count` parameter decremented by 1   
	     }    
	 }    
	 public static void main(String args[]){    
	  int count=10;    
	  System.out.print(n1+" "+n2);//printing 0 and 1    
	  printFibonacci(count-2);//n-2 because 2 numbers are already printed   
	 }  
	}  


