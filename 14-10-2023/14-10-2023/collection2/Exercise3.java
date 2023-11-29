package collection2;

import java.util.*;
import java.util.Iterator;
  public class Exercise3 {
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

  // set Iterator(iterate over a collection)
    Iterator<String> p = h_set.iterator();
  // checks next element is present or not if not it will exit
   while (p.hasNext()) {
   //it will print the next element	   
   System.out.println(p.next());
   }
   }
}
