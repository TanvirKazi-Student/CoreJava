package queuemethods;

import java.util.PriorityQueue;

public class QueueMEthods {

	public static void main(String[] args) {

		PriorityQueue<Integer> pq = new PriorityQueue<>();

		pq.add(100);
		pq.add(10);
		pq.add(210);
		pq.add(20);
		pq.add(2);
		pq.offer(30);//use for insert
//        pq.clear();
		System.out.println(pq);
		System.out.println(pq.contains(100));
		System.out.println(pq.poll());// remove head
		System.out.println(pq.poll());// remove head
		System.out.println(pq.poll());// remove head
		System.out.println(pq.remove());
		System.out.println(pq.peek());// use for retrive
		System.out.println(pq);
		System.out.println(pq.size());

	}
}
