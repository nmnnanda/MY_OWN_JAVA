package M_Threading;

	import java.util.concurrent.locks.Lock;
	import java.util.concurrent.locks.ReentrantLock;

	public class G_Avoid_DeadLock {
	    private static final Lock lock1 = new ReentrantLock();
	    private static final Lock lock2 = new ReentrantLock();

	    public static void main(String[] args) {
	        Thread thread1 = new Thread(() -> {
	            lock1.lock();
	            System.out.println("Thread 1 acquired lock 1");

	            try {
	                Thread.sleep(1000);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }

	            lock2.lock();
	            System.out.println("Thread 1 acquired lock 2");

	            // Perform some operations

	            lock2.unlock();
	            lock1.unlock();
	        });

	        Thread thread2 = new Thread(() -> {
	            // Acquire locks in the same order as Thread 1
	            lock1.lock();
	            System.out.println("Thread 2 acquired lock 1");

	            try {
	                Thread.sleep(1000);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }

	            lock2.lock();
	            System.out.println("Thread 2 acquired lock 2");

	            // Perform some operations

	            lock2.unlock();
	            lock1.unlock();
	        });

	        thread1.start();
	        thread2.start();

	        // Wait for both threads to finish
	        try {
	            thread1.join();
	            thread2.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        System.out.println("Program completed successfully.");
	    }
	}

/**
 
	• Though it is not possible to completely get rid of the deadlock problem in java still we can take precautions to 
	avoid such deadlock conditions. These preventive measures are as follows:
	1. By avoiding Nested Locks
	2. By avoiding unnecessary locks
	3. By using Thread join
	
1. Avoid Nested Locks
	• Using nested locks can be the main cause of the occurrence of deadlocks in Java, We can avoid the use of 
	nested locks to prevent the deadlocks in Java.
	• Nested locks mean we try to provide access to resources to multiple threads. If we have already assigned 
	one lock to a thread then we should avoid giving it to the another thread
2. Avoid Unnecessary Locks
	• We should also avoid giving locks to members or threads which do not need it. We should only provide 
	the lock to the important threads and avoid using unnecessary locks.
	• If we provide an unnecessary lock to a thread that does not really need it, then it may cause a condition of
	deadlock.
3. Use Thread Joins
	• The condition of deadlock usually occurs when one thread is waiting for another thread to complete its 
	execution and occupy that resource.
	• In this situation, we can use the Thread.join() method and give it a maximum time which a thread 
	approximately takes to finish the execution. This can help us from removing the risk of deadlock in Java.

*/