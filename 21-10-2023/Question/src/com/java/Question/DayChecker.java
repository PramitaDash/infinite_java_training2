package com.java.exa;

import java.util.Scanner;

public class DayChecker {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enterr number between 1-7");
		int day = sc.nextInt();
		
		String daysname;
		
		switch(day) {
		case 1:
			daysname="Monday";
			break;
		case 2:
			daysname="Tuesday";
			break;
		case 3:
			daysname="Wednesday";
			break;
		case 4:
			daysname="Thursday";
			break;
		case 5:
			daysname="Friday";
			break;
		default:
			daysname="Weekend";
	
		
		}
		System.out.println("Today is "+daysname);
	}


}
