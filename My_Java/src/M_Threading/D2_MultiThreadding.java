package M_Threading;

public class D2_MultiThreadding {
    public static void main(String[] args) {
       
    	WorkerThread1 thread1 = new WorkerThread1("Thread 1");   // Create two instances of the WorkerThread1 class
        WorkerThread1 thread2 = new WorkerThread1("Thread 2");

        thread1.start();        // Start both threads
        thread2.start();
    }
}

class WorkerThread1 extends Thread {
    private String name;

    public WorkerThread1(String name) {
        this.name = name;
    }

    @Override                                               // The code to be executed by the thread
    public void run() {
        System.out.println(name + " started.");

        for (int i = 1; i <= 5; i++) {                      // Perform some tasks
            System.out.println(name + ": " + i);

            try {                                           // Pause the thread for a short period of time
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(name + " finished.");
    }
}
