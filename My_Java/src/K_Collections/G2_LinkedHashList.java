package K_Collections;

	import java.util.LinkedHashSet;

	public class G2_LinkedHashList {
	    public static void main(String[] args) {
	        // Create a LinkedHashSet
	        LinkedHashSet<String> set = new LinkedHashSet<>();

	        // Add elements to the set
	        set.add("Apple");
	        set.add("Banana");
	        set.add("Orange");
	        set.add("Grape");
	        set.add("Apple"); // Adding a duplicate element

	        // Print the set
	        System.out.println("LinkedHashSet: " + set);

	        // Check if an element exists in the set
	        String searchElement = "Orange";
	        if (set.contains(searchElement)) {
	            System.out.println(searchElement + " is present in the LinkedHashSet.");
	        } else {
	            System.out.println(searchElement + " is not present in the LinkedHashSet.");
	        }

	        // Remove an element from the set
	        String removeElement = "Banana";
	        boolean removed = set.remove(removeElement);
	        if (removed) {
	            System.out.println(removeElement + " was removed from the LinkedHashSet.");
	        } else {
	            System.out.println(removeElement + " is not present in the LinkedHashSet.");
	        }

	        // Print the updated set
	        System.out.println("Updated LinkedHashSet: " + set);
	    }
	}

	/**
	
- LinkedHashSet internally uses LinkedHashMap to store it’s elements just like HashSet.
- LinkedHashSet maintains insertion order.
- LinkedHashSet is recommended over HashSet to maintain insertion order.
- The LinkedHashSet class extends HashSet class and implements Set interface. It also implements
  Cloneable and Serializable marker interfaces.
	
	*/