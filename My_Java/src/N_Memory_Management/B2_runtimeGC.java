package N_Memory_Management;

public class B2_runtimeGC {
	    public static void main(String[] args) {
	        // Creating a large array to consume memory
	        int[] array = new int[1000000];

	        // Performing some operations with the array

	        // Explicitly invoking the garbage collector
	        Runtime.getRuntime().gc();

	        // Printing a message after invoking the garbage collector
	        System.out.println("Garbage collector invoked.");
	    }
	}
