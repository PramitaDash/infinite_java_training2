package com.java.example;

class FibonacciExample1{  
	
public static void main(String args[])  
{    
 int n1=0,n2=1,n3,i,count=10; //Count` is set to 10, indicating the number of Fibonacci numbers to generate   
 System.out.print(n1+" "+n2);//printing 0 and 1    
    
 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
 {    
  n3=n1+n2;  //calculates the next number in the Fibonacci sequence (`n3`) as the sum of the previous two numbers (`n1` and `n2`).  
  System.out.print(" "+n3);  //prints the value of the newly calculated Fibonacci number with a space separator.  
  n1=n2; // `n1` is updated to the previous value of `n2`, preparing for the next iteration.
  n2=n3; // `n2` is updated to the previous value of `n3`, also preparing for the next iterati  
  }    
  
 }
}  