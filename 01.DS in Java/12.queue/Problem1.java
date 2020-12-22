import java.util.Queue;
import java.util.LinkedList;

public class Problem1 {
    // Queue is interface in java
    public static void main(String args[]) {

        Queue<Integer> q = new LinkedList<Integer>();
        q.add(10);
        q.add(5);
        q.add(20);

        System.out.println(q.poll()); // removes 10
        System.out.println(q.peek());
        System.out.println(q.size());

    }
}
