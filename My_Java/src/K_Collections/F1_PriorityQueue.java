package K_Collections;

import java.util.PriorityQueue;
public class F1_PriorityQueue {

	public static void main(String[] args) {
		PriorityQueue priorityQueue = new PriorityQueue();

		for(int a=0; a<=10; a++){
			priorityQueue.add(a);
			System.out.println(priorityQueue);

		}
		System.out.println(priorityQueue.peek()); // head of queue
		System.out.println("queue size before deleting " + priorityQueue.size());
		priorityQueue.poll();                      // removed head of queue
		System.out.println(priorityQueue.peek());   // new head of queue
		System.out.println("queue size After deleting" + priorityQueue.size());
	}

}
