package priorityqueuetest;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueTest {

    static class PQsort implements Comparator<Integer> {
 
        @Override
        public int compare(Integer one, Integer two) {
            return two - one;
        }
    }
 
    public static void main(String[] args) {
	int[] ia = { 1, 10, 5, 3, 4, 7, 6, 9, 8 };
	PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();
 
	// use offer() method to add elements to the PriorityQueue pq1
	for (int x : ia) {
            pq1.offer(x);
	}
 
	System.out.println("pq1: " + pq1);
 
	PQsort pqs = new PQsort();
	PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>(10, pqs);
	// In this particular case, we can simply use Collections.reverseOrder()
	// instead of self-defined comparator
	for (int x : ia) {
            pq2.offer(x);
	}
 
	System.out.println("pq2: " + pq2);
 
	// print size
	System.out.println("size: " + pq2.size());
	// return highest priority element in the queue without removing it
	System.out.println("peek: " + pq2.peek());
	// print size
	System.out.println("size: " + pq2.size());
	// return highest priority element and removes it from the queue
	System.out.println("poll: " + pq2.poll());
	// print size
	System.out.println("size: " + pq2.size());
 
	System.out.println("pq2: " + pq2);
 
	}
}

/*OUTPUT:
pq1: [1, 3, 5, 8, 4, 7, 6, 10, 9]
pq2: [10, 9, 7, 8, 3, 5, 6, 1, 4]
size: 9
peek: 10
size: 9
poll: 10
size: 8
pq2: [9, 8, 7, 4, 3, 5, 6, 1]
 */
