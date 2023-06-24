package N_Memory_Management;

public class D_Minor_GC {
	    public static void main(String[] args) {
	        // Create an array of objects
	        Object[] objects = new Object[1000];

	        // Create and discard objects in a loop
	        for (int i = 0; i < objects.length; i++) {
	            objects[i] = new Object();
	        }

	        // Set the array reference to null, making objects eligible for garbage collection
	        objects = null;

	        // Request garbage collection explicitly
	        System.gc();

	        // Print a message after minor garbage collection
	        System.out.println("Minor garbage collection completed");
	    }
	}


/**

1. Minor GC: This runs on the new generation and is
responsible for cleaning the dead objects and reclaiming the memory and keeps the memory available for 
young/new generation .


*/