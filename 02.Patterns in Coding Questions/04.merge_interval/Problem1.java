import java.util.ArrayList;
import java.util.List;

class Interval {
    int start;
    int end;

    public Interval(int a, int b) {
        this.start = a;
        this.end = b;
    }
}

public class Problem1 {

    // merge all the overlapping intervals to produce a list that has only mutually
    // exclusive intervals.
    // Intervals: [[1,4], [2,5], [7,9]]
    // Output: [[1,5], [7,9]]

    public static List<Interval> mergeInterval(List<Interval> intervals) {

        if (intervals.size() < 2)
            return intervals;
        
            // too much confusion
            List<Inteval> mergeIntervals = new ArrayList<>()
    }

    public static void main(String args[]) {

        List<Interval> input = new ArrayList<Interval>();
        input.add(new Interval(1, 4));
        input.add(new Interval(2, 5));
        input.add(new Interval(7, 9));

        for (Interval i : mergeInterval(input)) {
            System.out.print("[" + i.start + ", " + i.end + "]");
        }

    }

}
