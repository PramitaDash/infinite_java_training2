
//Write a Java program to display elements and their positions in a linked list

    package collection2;

  //imports the LinkedList class from the java.util package, 
  //which is necessary for using linked lists in the code.	
    import java.util.LinkedList; 
    
		//start of a class named Exercise1
	  public class Exercise1 {
		  //the main method. It's the entry point of the Java program.
	  public static void main(String[] args) {
	    // create an empty linked list
	     LinkedList<String> l_list = new LinkedList<String>();
	   // use add() method to add values in the linked list
	          l_list.add("Red");
	          l_list.add("Green");
	          l_list.add("Black");
	          l_list.add("Pink");
	          l_list.add("orange");
	      
	      // print original list to the console
	   System.out.println("Original linked list:" + l_list);  
	   
	  //This line starts a for loop that will iterate over the elements of the linked list.
	  //It initializes a variable p to 0 and continues as long as p is less than the size of the linked list.
	  for(int p=0; p < l_list.size(); p++)
	   {
		  //Inside the loop, this line prints each element of the linked list along with its index. 
		  //It uses the get method to access elements by their index.
	      System.out.println("Element at index "+p+": "+l_list.get(p));
	    } 
	 }
	}



