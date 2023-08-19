package K_Collections;

	import java.util.LinkedList;
	import java.util.Queue;

	public class F_Queue {
	    public static void main(String[] args) {
	        // Create a queue using LinkedList
	        Queue<String> queue = new LinkedList<>();

	        // Adding elements to the queue
	        queue.add("Apple");
	        queue.offer("Banana");
	        queue.offer("Cherry");
	        queue.offer("Durian");

	        System.out.println("Initial Queue: " + queue);

	        // Accessing the head of the queue     Peak is top most element
	        String head = queue.peek();
	        System.out.println("Head of the Queue: " + head);

	        // Removing elements from the queue   removing first inserted element
	        String removedElement = queue.poll();
	        System.out.println("Removed Element: " + removedElement);

	        System.out.println("Updated Queue: " + queue);
	    }
	}

	/**
	
	• Queue Interface:
- The Queue Interface extends Collection interface.
- Queue is a data structure in which elements are added from one end and elements are deleted from 
another end.
- It follows FIFO pattern i.e. First in First out except priority queue.
- In a priority queue, elements are assigned priorities
	
	*/