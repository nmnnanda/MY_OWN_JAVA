package K_Collections;

	import java.util.ArrayList;
	import java.util.List;

	public class D1_Lists_ArrayList {
	    public static void main(String[] args) {
	        // Creating an ArrayList of strings
	        List<String> fruits = new ArrayList<>();

	        // Adding elements to the ArrayList
	        fruits.add("Apple");
	        fruits.add("Banana");
	        fruits.add("Orange");

	        // Accessing elements in the ArrayList
	        System.out.println("Fruits: " + fruits);

	        // Getting the size of the ArrayList
	        System.out.println("Size of fruits ArrayList: " + fruits.size());

	        // Checking if the ArrayList is empty
	        System.out.println("Is fruits ArrayList empty? " + fruits.isEmpty());

	        // Accessing elements at specific indices
	        System.out.println("Element at index 1: " + fruits.get(1));

	        // Modifying an element
	        fruits.set(0, "Mango");
	        System.out.println("Modified fruits: " + fruits);

	        // Removing an element
	        fruits.remove("Banana");
	        System.out.println("Fruits after removing Banana: " + fruits);

	        // Iterating over the ArrayList using a for-each loop
	        System.out.println("Iterating over fruits using for-each loop:");
	        for (String fruit : fruits) {
	            System.out.println(fruit);
	        }

	        // Clearing the ArrayList
	        fruits.clear();
	        System.out.println("Fruits ArrayList after clearing: " + fruits);
	    }
	}

/** Array list = is a implementation of list interface where the elements are added or remove dynamically
    Methods = add(), indexof(), clone(), clear(), trimtosize(), toarray().

• ArrayList Class:
- ArrayList is same like normal array but it can grow and shrink dynamically to hold any number of elements.
- ArrayList class implements List interface and extends AbstractList.
- It also implements 3 interfaces like RandomAccess, Cloneable and Serializable.
- In Arraylist first element will be placed at index 0 and last element at index n-1.
- ArrayList can have duplicate elements

*/