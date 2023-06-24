package M_Threading;

	import java.util.concurrent.locks.Lock;
	import java.util.concurrent.locks.ReentrantLock;

	public class F_DeadLock {
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
	            lock2.lock();
	            System.out.println("Thread 2 acquired lock 2");

	            try {
	                Thread.sleep(1000);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }

	            lock1.lock();
	            System.out.println("Thread 2 acquired lock 1");

	            // Perform some operations

	            lock1.unlock();
	            lock2.unlock();
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

//• Deadlock in Java is a part of multithreading.
//• Deadlock can occur in a situation when a thread is waiting for an object lock, that is acquired by another 
//  thread and second thread is waiting for an object lock that is acquired by first thread.
//• Since, both threads are waiting for each other to release the lock, the condition is called deadlock.
//• Deadlock describes a situation where two or more threads are blocked forever, waiting for each other.

