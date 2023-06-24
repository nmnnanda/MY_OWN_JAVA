package N_Memory_Management;

public class F_Heap {
	    public static void main(String[] args) {
	        int arraySize = 1000000; // Reduced array size
	        
	        long[] array = new long[arraySize];
	        
	        // Let's wait for a moment to observe the memory consumption in the heap
	        try {
	            Thread.sleep(5000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
	}

/**

Heap

• The heap size in any machine depends on the maximum address space per process.
• We can control the size of heap memory for any application or program while starting the program.
• Here are the parameters that we use to set the heap size and instruct the JVM to allocate the specified heap 
    memory to an application
- Xms define minimum heap size of memory
- Xms define maximum heap size of memory



*/