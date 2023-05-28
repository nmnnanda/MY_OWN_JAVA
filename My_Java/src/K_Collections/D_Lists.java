package K_Collections;


	import java.util.ArrayList;
	import java.util.LinkedList;
	import java.util.List;

	public class D_Lists {
	    public static void main(String[] args) {
	        // Create an ArrayList
	        List<String> arrayList = new ArrayList<>();

	        // Add elements to the ArrayList
	        arrayList.add("Apple");
	        arrayList.add("Banana");
	        arrayList.add("Orange");

	        // Access elements in the ArrayList
	        System.out.println("ArrayList:");
	        for (String fruit : arrayList) {
	            System.out.println(fruit);
	        }

	        // Create a LinkedList
	        List<String> linkedList = new LinkedList<>();

	        // Add elements to the LinkedList
	        linkedList.add("Cat");
	        linkedList.add("Dog");
	        linkedList.add("Elephant");

	        // Access elements in the LinkedList
	        System.out.println("\nLinkedList:");
	        for (String animal : linkedList) {
	            System.out.println(animal);
	        }
	    }
	}



// list will stores elements in an index approch