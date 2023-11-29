package com.java.ex;

import java.util.Scanner;

public class NumException {
	
	public static void main(String[] args) {
		
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a Number : ");
	 String str = sc.next();
	 sc.close();//to close the `Scanner` to release resources and prevent resource leaks.
	 try {//The code inside the following curly braces is enclosed in a `try` block.
//here we are trying to convert the Str String into an integer a...
		int a = Integer.parseInt(str);
		System.out.println("a = "+a);//If the conversion is successful, you print the converted integer value `a` to the console
	//	
			} catch (NumberFormatException e) {//You have a `catch` block set up to catch a `NumberFormatException`
				// TODO Auto-generated catch block
				System.err.println("String Cannot be converted into   ");//Inside the `catch` block, you print an error message using `System.err`, indicating that the string cannot be converted into an integer
			}
 }					 


}
