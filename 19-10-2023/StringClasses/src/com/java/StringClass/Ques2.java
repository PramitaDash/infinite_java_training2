package com.java.str;

public class Ques2 {
	
	public static void main(String args[])
	  {
	    String n = "AMITABH";
	    
//	    Returns the length of a specified string
	    int l = n.length();
	    for(int i = 0;i<l;i++)
	    {
	      int asc = (int)n.charAt(i);
	      System.out.println (n.charAt(i)+" --> "+asc);
	    }
	  }

}
