package com.java.str;

public class Ques5 {
	
	public static void main(String[] args) {  
        String str = "Welcome to my world";  
//        Returns the length of a specified string
        for (int i=0; i<=str.length()-1; i++) {  
            if(i%2!=0) {  
                System.out.println("Char at "+i+" place "+str.charAt(i));  
            }  
        }  
    }  

}
