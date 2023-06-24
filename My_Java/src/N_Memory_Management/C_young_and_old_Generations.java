package N_Memory_Management;

public class C_young_and_old_Generations {
	    public static void main(String[] args) {
	        // Step 1: Create an object in the young generation
	        Object obj1 = new Object();

	        // Step 2: Allocate an array in the young generation
	        Object[] objArray = new Object[100];

	        // Step 3: Create an object in the old generation
	        Object obj2 = new Object();

	        // Step 4: Allocate an array in the old generation
	        Object[] largeObjArray = new Object[1000000];

	        // Step 5: Perform garbage collection to free memory in the young generation
	        System.gc();
	        System.out.println("Garbage collection invoked");
	}
}
/**

• Java Heap memory (Hotspot heap structure) is called Generations are the logically divided spaces of heap 
   memory to store the resources and objects based on their life or tenure.
• There are three generations in the heap memory –
- Young generation (which is also called new generation)
- Old generation
- Permanent generation


*/