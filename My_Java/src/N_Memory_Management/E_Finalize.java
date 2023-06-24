package N_Memory_Management;

	class MyClass1 {
	    public void finalize() {
	        // Clean up resources here
	        System.out.println("Finalizing object");
	    }
	}

	public class E_Finalize {
	    public static void main(String[] args) {
	    	MyClass1 obj1 = new MyClass1();
	    	MyClass1 obj2 = new MyClass1();
	        
	        obj1 = null; // Set obj1 to null to make it eligible for garbage collection
	        
	        System.gc(); // Explicitly request garbage collection
	        
	        obj2 = null; // Set obj2 to null to make it eligible for garbage collection
	        
	        // Let's wait for a moment to see if the finalize method is called
	        try {
	            Thread.sleep(1000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
	}

/**
	
Finalize

• Finalize is the method of garbage collection and is called by garbage collectors on objects to identify and check 
   the references for that before reclaiming the memory.
• The finalize() method identifies the objects that do not have any references and pushes them in the garbage 
   collection queue to reclaim the memory.
• The finalize() method will not send any live or active object for garbage collection.
• We can explicitly call the finalize() method on objects, when we know that we are no longer going to use this 
   object in the program and want to remove from memory.
• But again, it all depends on the GC, whether the memory will be reclaimed or not.
• We cannot guarantee that after calling the finalize method, memory of that object will be free and reclaimed.
• Calling the finalize() method explicitly may impact the performance of your application because of high CPU
   utilization.	
	
*/