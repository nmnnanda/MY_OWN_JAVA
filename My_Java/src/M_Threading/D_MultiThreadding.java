package M_Threading;


public class D_MultiThreadding {
	    public static void main(String[] args) {

	    	Thread thread1 = new Thread(new WorkerThread("Thread 1"));	        // Create two threads
	        Thread thread2 = new Thread(new WorkerThread("Thread 2"));

	        thread1.start();	        // Start both threads
	        thread2.start();
	    }
	}

	class WorkerThread implements Runnable {
	    private String name;

	    public WorkerThread(String name) {
	        this.name = name;
	    }

	    public void run() {
	        System.out.println(name + " is executing.");
	    }
	}

/**
	• Multithreading is a Java feature that allows concurrent execution of two or more parts of a program for 
	maximum utilization of CPU.
	• Each thread defines a separate path of execution.
	• This means that a single program can perform two or more tasks simultaneously.
	• For example:
	- One thread is performing typing action on a file at the same time another thread is checking and resolving 
	grammatical mistakes at the same time.


Thread Lifecycle

• A thread goes through various stages in its life cycle. For example, a thread is born, started, runs, and then dies.

• New : A thread begins its life cycle in the new state. It remains in this state until the program starts the start()method.
• Runnable : After a newly born thread is started by invocating start() method on new thread, the thread becomes runnable.
• Running : A thread is in running state if the thread scheduler has selected it.
• Waiting : A thread is in waiting state if it waits for another thread to perform a task. In this stage the thread is still alive.
• Terminated : A thread enter the terminated state when it complete its task.












*/