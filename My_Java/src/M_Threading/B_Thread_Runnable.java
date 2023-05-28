package M_Threading;

	class MyRunnable1 implements Runnable {       	// A class that implements the Runnable interface
	    public void run() {	                        // Method that gets executed when the thread starts
	        System.out.println("Thread is running");
	    }
	}

	public class B_Thread_Runnable {	            // Main class
	    public static void main(String[] args) {
	        MyRunnable runnable = new MyRunnable();	        // Create an instance of MyRunnable

	        Thread thread = new Thread(runnable);	        // Create a new thread and pass the runnable object to its constructor
	        thread.start();	                          // Start the thread
	        
	        //some more output statements
	        System.out.println("i/o outside");
	        System.out.println("i/o string");

	        System.out.println("i/o inside");
	        System.out.println("i/o statement");
	    }
	}

// while we use thread start. the main threads inside the
// inside the main methods are executed without waiting
// for first statements to execute, randomly it will get executed