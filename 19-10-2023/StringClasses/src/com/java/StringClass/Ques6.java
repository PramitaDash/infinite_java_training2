package com.java.str;

public class Ques6 {
	public static void main(String[] args) {  
        String str = "Welcome to infinite";  
        int count = 0;  
        for (int i=0; i<=str.length()-1; i++) { 
//        	Returns the character at the specified index (position)
            if(str.charAt(i) == 't') {  
                count++;  
            }  
        }  
        System.out.println("Frequency of t is: "+count);  
    }  

}
