package collectiond;

import java.util.PriorityQueue;

public class PriorityQDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();

		pq.add(12);
		pq.add(120);
		pq.add(1200);
		pq.add(123);
		pq.add(-12);
		pq.add(12);

		System.out.println(pq);

		// -12 12 12 120 123 1200

//		System.out.println(pq.peek());
//		System.out.println(pq.peek());

		System.out.println("Size ==> " + pq.size());
		System.out.println(pq.poll());// remove
		System.out.println(pq.poll());

		System.out.println("Size ==> " + pq.size());
	}

}
