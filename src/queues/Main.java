package queues;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		Queue<Double> queue = new PriorityQueue<Double>();
		
		queue.offer(3.0);
		queue.offer(2.5);
		queue.offer(4.0);
		queue.offer(1.5);
		queue.offer(2.0);
		
		System.out.println(queue);
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
	}
}
