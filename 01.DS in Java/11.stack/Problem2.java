
// balanced paranthesis

// s = "([])"
// output - YES

// s= "((()))"
// output - YES

// s = [][{}
// output - NO

import java.util.Stack;

public class Problem2 {
    static boolean matchBrackets(char a, char b) {
        return ((a == '(' && b == ')') || a == '{' && b == '}' || a == '[' && b == ']');
    }

    static boolean isBalanced(String str) {
        Stack<Character> s = new Stack<Character>();

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{') {
                s.push(str.charAt(i));
            } else {
                if (s.isEmpty() == true)
                    return false;
                else if (matchBrackets(str.charAt(i), s.peek()) == false)
                    return false;
                else
                    s.pop();
            }
        }
        return (s.isEmpty() == true);
    }

    public static void main(String args[]) {

        String s = "{[]}";
        System.out.print(isBalanced(s));

    }
}
