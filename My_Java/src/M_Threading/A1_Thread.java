package M_Threading;

// Example of Thread
public class A1_Thread {
    public static void main(String[] args) {
        
    	MyThread myThread1 = new MyThread();        // Create a new thread by extending the Thread class
        myThread1.start();                          // Start the thread

        Runnable myRunnable1 = new MyRunnable();        // Create a new thread by implementing the Runnable interface
        Thread thread = new Thread(myRunnable1);
        thread.start();                                 // Start the thread
    }
}

class MyThread extends Thread {          // A custom thread class
    @Override
    public void run() {
        System.out.println("This is a thread extending the Thread class.");        // Code to be executed in the thread
    }
}

class MyRunnable implements Runnable {            // A custom runnable class
    @Override
    public void run() {
        System.out.println("This is a thread implementing the Runnable interface.");        // Code to be executed in the thread
    }
}
