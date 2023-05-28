package K_Collections;

	import java.util.LinkedList;

	public class D2_Lists_LinkedList {
	    public static void main(String[] args) {
	        // Create a linked list
	        LinkedList<String> linkedList = new LinkedList<>();

	        // Adding elements to the linked list
	        linkedList.add("Apple");
	        linkedList.add("Banana");
	        linkedList.add("Cherry");

	        // Displaying the linked list
	        System.out.println("Linked List: " + linkedList);

	        // Adding an element at the beginning
	        linkedList.addFirst("Mango");

	        // Adding an element at the end
	        linkedList.addLast("Grapes");

	        // Displaying the updated linked list
	        System.out.println("Updated Linked List: " + linkedList);

	        // Removing an element
	        linkedList.remove("Banana");

	        // Displaying the final linked list
	        System.out.println("Final Linked List: " + linkedList);
	    }
	}


/**  
 Linked LIst = it is a sequence of links which contains items.abstract
 
• Vector Class:
- The Vector Class is also dynamically growable and shrinkable collection of objects like an ArrayList class.
- Vector class is preferred over ArrayList class for multi threaded application.
- All methods of Vector class are synchronized so that only one thread can execute them at any given time.
- The main feature of Vector class is that it is thread safet

two types in linked list,

SIngly linked list,       
Double linked list.

*/