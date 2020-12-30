
//stack implementation

import java.util.Stack;

public class Problem1 {
    public static void main(String args[]) {

        Stack<Integer> s = new Stack<Integer>();
        s.push(10);
        s.push(20);
        s.push(250);
        System.out.println(s.size());
        while (s.isEmpty() == false)
            System.out.println(s.pop());
        System.out.println(s.size());

    }
}
