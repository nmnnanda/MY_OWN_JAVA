package N_Memory_Management;

public class B1_syatemGC {
	    public static void main(String[] args) {
	        // Creating objects
	        Object obj1 = new Object();
	        Object obj2 = new Object();

	        // Making obj1 eligible for garbage collection
	        obj1 = null;

	        // Explicitly invoking the garbage collector
	        System.gc();

	        // Printing a message after invoking the garbage collector
	        System.out.println("Garbage collector invoked.");
	    }
	}
