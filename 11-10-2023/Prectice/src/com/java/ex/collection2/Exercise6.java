//Write a Java program to get the number of elements in a tree set.
package com.java.ex.collection2;

import java.util.TreeSet;
  public class Exercise6 {
  public static void main(String[] args) {
    // create an empty tree set
     TreeSet<String> t_set = new TreeSet<String>();
   // use add() method to add values in the tree set
          t_set.add("Red");
          t_set.add("Green");
          t_set.add("Black");
          t_set.add("Pink");
          t_set.add("orange");
     System.out.println("Original tree set: " + t_set);
    System.out.println("Size of the tree set: " + t_set.size());
   }
}

