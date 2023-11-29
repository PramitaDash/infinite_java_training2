package com.java.example;

public class PrimeExample {

	public static void main(String args[]){    
		  int i,m=0,flag=0;//These variables will be used to control the prime number checking process.      
		  int n=3;//it is the number to be checked
		  
		  m=n/2; //This is used to optimize the prime number checking loop by only checking potential divisors up to half of the number.     
		  if(n==0||n==1){  //This `if` statement checks if `n` is equal to 0 or 1. If `n` is 0 or 1, the program prints a message indicating that the number is not prime because 0 and 1 are not prime numbers.
		   System.out.println(n+" is not prime number");      
		  }else{  
		   for(i=2;i<=m;i++){//If `n` is not 0 or 1, the program enters an `else` block and initiates a `for` loop. The loop starts with `i` as 2 and continues until `i` is less than or equal to `m`.      
		    if(n%i==0){//Inside the `for` loop, it checks if `n` is evenly divisible by the current value of `i`. If it is, the program prints a message indicating that the number is not prime, sets the `flag` to 1, and exits the loop using the `break` statement.
		     System.out.println(n+" is not prime number");     
		     flag=1;      
		     break;      
		    }      
		   }  
		   //After the `for` loop, it checks if the `flag` is still 0. If it is, this means that the number is not divisible by any number from 2 to `m`, and therefore, it is a prime number. The program prints a message indicating that the number is a prime.
		   if(flag==0)  { System.out.println(n+" is prime number"); }  
		  }//end of else  
		}    
	
}
