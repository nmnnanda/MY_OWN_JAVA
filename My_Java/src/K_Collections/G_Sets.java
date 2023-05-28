package K_Collections;

	import java.util.HashSet;
	import java.util.Set;

	public class G_Sets {
	    public static void main(String[] args) {

	    	Set<String> fruits = new HashSet<>();    	        // Create a new HashSet

	        fruits.add("Apple");	        // Add elements to the set
	        fruits.add("Banana");
	        fruits.add("Orange");
	        fruits.add("Apple"); // Duplicate elements are not allowed in a set

	        // Print the set
	        System.out.println("Fruits: " + fruits);

	        // Check if an element exists in the set
	        String fruit = "Mango";
	        if (fruits.contains(fruit)) {
	            System.out.println(fruit + " is present in the set.");
	        } else {
	            System.out.println(fruit + " is not present in the set.");
	        }

	        // Remove an element from the set
	        String removedFruit = "Banana";
	        boolean removed = fruits.remove(removedFruit);
	        if (removed) {
	            System.out.println(removedFruit + " has been removed from the set.");
	        } else {
	            System.out.println(removedFruit + " is not found in the set.");
	        }

	        // Iterate over the elements in the set
	        System.out.println("Remaining fruits in the set:");
	        for (String item : fruits) {
	            System.out.println(item);
	        }

	        // Get the size of the set
	        System.out.println("Size of the set: " + fruits.size());

	        // Clear the set
	        fruits.clear();
	        System.out.println("Set cleared. Size of the set: " + fruits.size());
	    }
	}


/**

- The set is a linear collection of objects with no duplicates.
- The Set interface extends Collection interface.
- Methods are inherited from collection interface as it does not have it’s own methods.

*/