package M_Threading;

public class D1_MultiThreadding {
	    public static void main(String[] args) {
	        
	    	Thread thread1 = new Thread(() -> {	        // Create two threads using anonymous inner classes
	            for (int i = 1; i <= 5; i++) {
	                System.out.println("Thread 1: " + i);
	                try {
	                    Thread.sleep(1000);
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	        });

	        Thread thread2 = new Thread(() -> {
	            for (int i = 1; i <= 5; i++) {
	                System.out.println("Thread 2: " + i);
	                try {
	                    Thread.sleep(1000);
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	        });

	        thread1.start();	        // Start both threads
	        thread2.start();
	    }
	}
