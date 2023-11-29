package com.java.example;

public class FactorialExample {  
		 public static void main(String args[]){  
		  int i,fact=1;  //`fact` will store the factorial value and is initialized to 1, as 1 is the identity element for multiplication.
		  int number=5;//It is the number to calculate factorial    
		  for(i=1;i<=number;i++){ //This line starts a `for` loop:// - `i` is initialized to 1, which is the starting point for the loop.// - The loop will continue as long as `i` is less than or equal to the value of `number`.// - The loop increments `i` by 1 in each iteration.   
		      fact=fact*i; //It multiplies the current value of `fact` by the current value of `i`.   
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact);    
		 }  

}
