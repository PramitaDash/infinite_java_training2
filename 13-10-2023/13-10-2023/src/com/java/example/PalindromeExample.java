package com.java.example;

public class PalindromeExample {
	
		 public static void main(String args[]){  
		  int r,sum=0, temp; //int r, sum = 0, temp;`: Declare integer variables `r`, `sum`, and `temp` to store temporary values during the palindrome check.:
		  int n=454;//It is the number variable to be checked for palindrom
		  
		  temp=n;//n;`: Store the original number in `temp` because we'll modify `n` during the checking process.    
		  while(n>0){    //This is used to reverse the digits of `n` and check if it's a palindrome.
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r; //Build a reversed number by shifting the digits to the left and adding the last digit `r` to it.   
		   n=n/10;//Remove the last digit from `n` so that we can continue the process.    
		  }    
		  //After the loop, the program checks if the reversed number (`sum`) is equal to the original number (`temp`). 
		  //If they are equal, it prints "palindrome number." Otherwise, it prints "not a palindrome."
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  

}
