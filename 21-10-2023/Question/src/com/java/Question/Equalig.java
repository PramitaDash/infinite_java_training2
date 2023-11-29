package com.java.exa;

import java.util.Scanner;

public class Equalig {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your city name: ");
		String name =sc.nextLine().trim();
		if(name.equalsIgnoreCase("Odisha")) {
			System.out.println("Hello odisha");
		}else if(name.equalsIgnoreCase("delhi")) {
			System.out.println("Hello delhi");
		}else if(name.equalsIgnoreCase("Hydra")) {
			System.out.println("Hello Hydra");
		}else {
			System.out.println("Enter a valid City name");
		}
	}


}
