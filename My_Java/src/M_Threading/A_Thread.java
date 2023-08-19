package M_Threading;

	class MyThreadA extends Thread {	      // A class that extends the Thread class
	    public void run() {	                   // Method that gets executed when the thread starts
	        System.out.println("Thread is running");
	    }
	}

	public class A_Thread {                   	// Main class
	    public static void main(String[] args) {

	    	MyThreadA thread = new MyThreadA();	        // Create an instance of MyThreadA
	        thread.start();	        // Start the thread
	    }
	}

	//• Thread is the smallest execution unit of a process and a process may have many threads that are executing at  the same time.
	//• Thread has its own execution path within the process and shares the memory of the process with other 
	//  threads, which are running in the same process.
	//• Thread doesn’t allocate any memory, but it uses the memory allocated by its process; this helps faster and
	//  efficient communication between threads within the same process.

	// thread are always executes in a sequence way




