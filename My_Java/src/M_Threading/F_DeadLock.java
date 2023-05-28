package M_Threading;

public class F_DeadLock {
	    public static void main(String[] args) {
	        // Two shared resources
	        String resource1 = "Resource 1";
	        String resource2 = "Resource 2";

	        // Thread 1
	        Thread thread1 = new Thread(() -> {
	            synchronized (resource1) {
	                System.out.println("Thread 1 acquired resource 1");

	                // Introduce a delay to allow thread 2 to acquire resource 2
	                try {
	                    Thread.sleep(100);
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }

	                System.out.println("Thread 1 waiting for resource 2");
	                synchronized (resource2) {
	                    System.out.println("Thread 1 acquired resource 2");
	                }
	            }
	        });

	        // Thread 2
	        Thread thread2 = new Thread(() -> {
	            synchronized (resource2) {
	                System.out.println("Thread 2 acquired resource 2");

	                // Introduce a delay to allow thread 1 to acquire resource 1
	                try {
	                    Thread.sleep(100);
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }

	                System.out.println("Thread 2 waiting for resource 1");
	                synchronized (resource1) {
	                    System.out.println("Thread 2 acquired resource 1");
	                }
	            }
	        });

	        // Start both threads
	        thread1.start();
	        thread2.start();

	        // Wait for both threads to complete
	        try {
	            thread1.join();
	            thread2.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        System.out.println("Program execution completed.");
	    }
	}

//• Deadlock in Java is a part of multithreading.
//• Deadlock can occur in a situation when a thread is waiting for an object lock, that is acquired by another 
//  thread and second thread is waiting for an object lock that is acquired by first thread.
//• Since, both threads are waiting for each other to release the lock, the condition is called deadlock.
//• Deadlock describes a situation where two or more threads are blocked forever, waiting for each other.

