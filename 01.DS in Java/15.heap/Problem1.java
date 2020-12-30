import java.util.Collections;
import java.util.PriorityQueue;

public class Problem1 {
    // min heap and max heap using priority queqe

    public static void main(String args[]) {

        // min heap
        // PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        // max heap
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());

        pq.add(10);
        pq.add(5);
        pq.add(25);
        pq.add(20);

        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq.peek());

    }
    

}
