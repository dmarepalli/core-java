package C_I_PriorityQueue;

import java.util.PriorityQueue;

public class Demo {

	public static void main(String[] args) {
		PriorityQueue q = new PriorityQueue();
		//peek() Retrieves, but does not remove, the head of this queue, 
		//or returns null if this queue is empty.
		System.out.println(q.peek()); 
		
		for(int i =0;i<10;i++){
			// adds an element into queue
			q.offer(i);
		}
		
		System.out.println(q);
		// Retrieves and removes the head of this queue, or returns null if this queue is empty.
		System.out.println(q.poll());
		System.out.println(q);
	}
}
