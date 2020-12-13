
// balanced paranthesis

// s = "([])"
// output - YES

// s= "((()))"
// output - YES

// s = [][{}
// output - NO

import java.util.Stack;

public class Problem2 {

    static boolean isBalanced(String str) {
        Stack<Integer> s = new Stack<Integer>();

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{') {
                s.push(str.charAt(i));
            }
        }
    }

    public static void main(String args[]) {

        String s = "{{}}";

    }
}
