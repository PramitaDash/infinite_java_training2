

package com.java.loop;

public class Main2 {

	public static void main(String[] args) {
		 
			int term=6;  
//This line declares and initializes an integer variable term with the value 6. 
//This variable is used to determine the number of rows in the pyramid
	for(int i=1;i<=term;i++){ //It initializes an integer variable i to 1 and continues the loop as long as i is less than or equal to term, which is 6 in this case
	for(int j=term;j>=i;j--){ //It initializes an integer variable j to the value of term, which is 6, and continues the loop as long as j is greater than or equal to i. 
	System.out.print("* "); //after the inner loop is complete this line is used to moved to a new line
	}  
	System.out.println();//new line  
			
	}  
}
}
