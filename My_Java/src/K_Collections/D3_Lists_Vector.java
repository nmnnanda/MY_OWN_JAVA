package K_Collections;

	import java.util.Vector;

	public class D3_Lists_Vector {
	    public static void main(String[] args) {
	        // Create a new Vector
	        Vector<String> vector = new Vector<>();

	        // Add elements to the Vector
	        vector.add("Apple");
	        vector.add("Banana");
	        vector.add("Orange");

	        // Get the size of the Vector
	        int size = vector.size();
	        System.out.println("Size of Vector: " + size);

	        // Access elements using index
	        System.out.println("Element at index 1: " + vector.get(1));

	        // Check if an element exists
	        boolean contains = vector.contains("Apple");
	        System.out.println("Contains 'Apple'? " + contains);

	        // Iterate over the Vector using a for-each loop
	        System.out.println("Elements in Vector:");
	        for (String element : vector) {
	            System.out.println(element);
	        }

	        // Remove an element
	        boolean removed = vector.remove("Banana");
	        System.out.println("Removed 'Banana'? " + removed);

	        // Clear all elements in the Vector
	        vector.clear();
	        System.out.println("Vector after clearing all elements: " + vector);
	    }
	}

/**

• Vector Class:
- The Vector Class is also dynamically growable and shrinkable collection of objects like an ArrayList class.
- Vector class is preferred over ArrayList class for multi threaded application.
- All methods of Vector class are synchronized so that only one thread can execute them at any given time.
- The main feature of Vector class is that it is thread safety.
- Synchronized way of array

*/