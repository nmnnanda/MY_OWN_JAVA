package N_Memory_Management;

public class D1_Major_GC {
	    public static void main(String[] args) {
	        // Create a large array of objects
	        Object[] objects = new Object[1000000];

	        // Create and discard objects in a loop
	        for (int i = 0; i < objects.length; i++) {
	            objects[i] = new Object();
	        }

	        // Set the array reference to null, making objects eligible for garbage collection
	        objects = null;

	        // Request garbage collection explicitly
	        System.gc();

	        // Print a message after major garbage collection
	        System.out.println("Major garbage collection completed");
	    }
	}

// Major GC: This runs on old generation of heap memory and responsible for cleaning the old/tenured heap space