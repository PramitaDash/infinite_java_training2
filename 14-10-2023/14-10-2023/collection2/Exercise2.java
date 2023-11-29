//Write a Java program to compare two linked lists.

package collection2;

//imports all classes and interfaces from the java.util package
import java.util.*;
public class Exercise2 {
public static void main(String[] args) {
	//declares a variable named c1 of type LinkedList that holds strings
 LinkedList<String> c1= new LinkedList<String>();
        c1.add("Red");//adds the string inside the list
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        
        //declares a second variable named c2 of type LinkedList that holds strings. 
        //It creates another empty linked list.
        LinkedList<String> c2= new LinkedList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Orange");

        //declares a third variable named c3 of type LinkedList that holds strings.
        //It will be used to store the comparison results.
        LinkedList<String> c3 = new LinkedList<String>();
        
        // checks if the current element e from c1 is present in the c2 linked list using the contains method.
        //It adds "Yes" to c3 if the element is found, and "No" if it's not found.
        for (String e : c1)
           c3.add(c2.contains(e) ? "Yes" : "No");
        
        //prints the content of the c3 linked list to the console.
        //It will show "Yes" for elements present in both c1 and c2 and "No" for elements not present in c2.
        System.out.println(c3);         
   }
}

