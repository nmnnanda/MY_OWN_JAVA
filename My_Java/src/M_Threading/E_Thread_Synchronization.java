package M_Threading;

	class Counter {
	    private int count;

	    public synchronized void increment() {
	        count++;                 // increment the counter in a thread-safe manner
	    }

	    public int getCount() {
	        return count;            // retrieve the counter value
	    }
	}

	class IncrementThread extends Thread {
	    private Counter counter;

	    public IncrementThread(Counter counter) {
	        this.counter = counter;
	    }

	    public void run() {
	        for (int i = 0; i < 100; i++) {
	            counter.increment();            // increment the counter 1000 times
	        }
	    }
	}

	public class E_Thread_Synchronization {
	    public static void main(String[] args) throws InterruptedException {
	        Counter counter = new Counter();              // create a counter object

	        IncrementThread thread1 = new IncrementThread(counter);
	        IncrementThread thread2 = new IncrementThread(counter);

	        thread1.start(); // start the first thread
	        thread2.start(); // start the second thread

	        thread1.join(); // wait for the first thread to finish
	        thread2.join(); // wait for the second thread to finish

	        System.out.println("Final Count: " + counter.getCount());
	    }
	}

//	• Synchronization is a keyword in the Java programming language that facilitates the programmer to control 
//	     threads that are sharing data.
//	• This is the best approach in Java technology to provide a mechanism to treat the data carefully.
//	• Synchronized keywords are used to declare a method or create a method or block of statement thread safe, 
//	      that means only one thread can access that block of code at a time and other threads will be in a waiting state 
//	      until the first thread completes the execution.
//	• This is done when we want to get the updated data after evaluation or while modifying the object so that 
//	     other threads get only the updated value after the successful modification of the object.
//	• If we do not lock the code block, then other threads may perform the operation on the same object, which 
//	  causes ambiguity and corrupts the actual data
