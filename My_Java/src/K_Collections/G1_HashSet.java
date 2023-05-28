package K_Collections;

	import java.util.HashSet;

	public class G1_HashSet {
	    public static void main(String[] args) {
	        HashSet<String> set = new HashSet<>();	        // Create a new HashSet

	        set.add("apple");	        // Add elements to the HashSet
	        set.add("banana");
	        set.add("orange");
	        set.add("grape");
	        set.add("melon");

	        // Display the HashSet
	        System.out.println("HashSet: " + set);

	        // Check if an element is present in the HashSet
	        String element = "banana";
	        if (set.contains(element)) {
	            System.out.println(element + " is present in the HashSet.");
	        } else {
	            System.out.println(element + " is not present in the HashSet.");
	        }

	        // Remove an element from the HashSet
	        String removeElement = "orange";
	        boolean removed = set.remove(removeElement);
	        if (removed) {
	            System.out.println(removeElement + " is removed from the HashSet.");
	        } else {
	            System.out.println(removeElement + " is not present in the HashSet.");
	        }

	        // Display the updated HashSet
	        System.out.println("Updated HashSet: " + set);

	        // Iterate over the elements in the HashSet
	        System.out.println("Elements in the HashSet:");
	        for (String item : set) {
	            System.out.println(item);
	        }

	        // Get the size of the HashSet
	        int size = set.size();
	        System.out.println("Size of the HashSet: " + size);

	        // Clear the HashSet
	        set.clear();

	        // Check if the HashSet is empty
	        boolean isEmpty = set.isEmpty();
	        System.out.println("Is the HashSet empty? " + isEmpty);
	    }
	}

/**

- The HashSet class in Java is an implementation of Set interface. HashSet is a collection of objects which 
  contains only unique elements.
- The HashSet internally uses HashMap to store the objects.
- HashSet class extends AbstractSet class and implements Set interface. It also implements Cloneable and
  Serializable marker interfaces.

data is unic and no repet,
it will stores on basis of hashvalue
output is unordered
alphabeticall ordered
*/