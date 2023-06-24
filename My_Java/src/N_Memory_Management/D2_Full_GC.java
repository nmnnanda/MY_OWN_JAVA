package N_Memory_Management;

public class D2_Full_GC {
	    public static void main(String[] args) {
	        // Create an object
	        Object obj = new Object();

	        // Set the object reference to null, making it eligible for garbage collection
	        obj = null;

	        // Request garbage collection explicitly
	        System.gc();

	        // Print a message after full garbage collection
	        System.out.println("Full garbage collection completed");
	    }
	}
//3. Full GC: This is cleaning the entire heap memory, including young and tenured spaces.
