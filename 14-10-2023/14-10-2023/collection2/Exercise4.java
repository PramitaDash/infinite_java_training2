package collection2;

import java.util.*;
public class Exercise4 {
public static void main(String[] args) {
       // Create a empty hash set
   HashSet<String> h_set = new HashSet<String>();
 // use add() method to add values in the hash set
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("White");
        h_set.add("Pink");
        h_set.add("Yellow");
    System.out.println("Original Hash Set: " + h_set);
    // Creating an Array
    String[] new_array = new String[h_set.size()];
    //convert its elements into an array.
    h_set.toArray(new_array);
    
   // Displaying Array elements
   System.out.println("Array elements: ");
   // iterates over each element in the new_array array,
   //assigning each element to the variable element during each iteration.
    for(String element : new_array){
    	//prints the current element
      System.out.println(element);
   }
 }
}

