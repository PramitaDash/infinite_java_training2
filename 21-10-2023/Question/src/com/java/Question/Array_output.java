package com.java.exa;

public class Array_output {
	
	public static void main(String args[]) 
    {
        int array_variable [] = new int[10];
    for (int i = 0; i < 10; ++i) 
        {
    		System.out.println("First" +i);
            array_variable[i] = i;
            System.out.println(array_variable[i] + " ");
            //i++;
        }
    
    int b = 5;
    
    System.out.println("Pre Increment "+ b++);//5
    System.out.println("Pre Increment " + b);//6
    
    int c = 10;
    System.out.println("post Increment "+ ++c);//11
    System.out.println("Post Increment " + c);//11
    		
    } 

}
