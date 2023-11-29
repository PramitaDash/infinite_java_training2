package com.java.ex;

public class NullException {
	public static void main(String[] args) {
		int[] arr = null;//This means `arr` doesn't point to any actual array in memory.
		try {//The code inside the following curly braces is enclosed in a `try` block. 
			int value = arr[0];//Inside the `try` block, you attempt to access the element at index 0 of the `arr` array. However, since `arr` is `null`, this operation will throw a `NullPointerException`
		} catch (NullPointerException e) {//You have a `catch` block set up to catch a `NullPointerException`.

			// TODO Auto-generated catch block

			System.out.println("Null object is Passed...");//Inside the `catch` block, you print "Null object is Passed..." to the console.
		
		}
	}

}
