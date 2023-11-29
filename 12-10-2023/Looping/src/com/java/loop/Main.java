//Program to find the sum of natural number from 1

package com.java.loop;

public class Main {
	
	public static void main(String[] args) {
		 
		int sum = 0;
		int n = 1000;
		
		//for loop
		for(int i = 1; i<=n; i++) {
		//body inside for loop
		sum += i; //sum+i
		}
		System.out.println("Sum= "+sum);
	}

}
