package N_Memory_Management;

public class B_GarbageCollection {
	    
	    public static void main(String[] args) {
	        // Create two objects
	        MyClass obj1 = new MyClass();
	        MyClass obj2 = new MyClass();
	        
	        // Assign obj2 to obj1
	        obj1 = obj2;
	        
	        // Set obj2 to null
	        obj2 = null;
	        
	        // Run garbage collection explicitly
	        System.gc();
	    }
	}

	class MyClass {
	    
	    // Constructor
	    public MyClass() {
	        System.out.println("Object created");
	    }
	    
	    // Destructor (finalize method)
	    protected void finalize() {
	        System.out.println("Object destroyed");
	    }
	}

/**
	
• Garbage collection is the process of memory management that finds and removes or cleans the unused heap 
   memory allocated to the objects and keeps the memory reusable and available for new resources.
• Garbage collection executes automatically and removes the allocated memory for only those objects and 
    members that do not hold any references and no more in use, or in general terms, we can say reclaims the unused heap memory
• When we execute a Java program in a machine, it requires the memory
• Java virtual memory provides various garbage collectors that help the system or operating system to improve 
    the performance and efficiency of the memory
    
    
• We cannot force the garbage collectors to reclaim the unused memory, JVM automatically manages all these 
  to run the application or program and a developer need not worry about the memory management in Java.

• Garbage collection can be forcefully executed with the help of any of the following methods:

- System.gc();
- Runtime.getRuntime().gc();
- System.runFinalization();
- Runtime.getRuntime().runFinalization();

	
• NOTE: Calling the above methods does not guarantee that Garbage collection will start performing and 
reclaiming the memory immediately. When all the heap memory is full, it will throw a 
java.lang.OutOfMemoryError error.

*/