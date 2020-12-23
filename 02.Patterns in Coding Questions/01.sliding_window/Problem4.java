import java.util.HashMap;

public class Problem4 {

    // Given a string, find the length of the longest substring which has no
    // repeating characters.
    // Input: String="aabccbb"
    // Output: 3

    // Input: String="abbbb"
    // Output: 2

    public static int lengthlongestSubstring(String str) {

        int length = 0, windowStart = 0;
        HashMap<Character, Integer> charIndexMap = new HashMap<>();

        for (int window = 0; window < str.length(); window++) {
            char rightChar = str.charAt(window);

            if (charIndexMap.containsKey(rightChar)) {

                windowStart = Math.max(windowStart, charIndexMap.get(rightChar) + 1);

            }

            charIndexMap.put(rightChar, window);
            length = Math.max(length, window - windowStart + 1);
        }
        return length;
    }

    public static void main(String args[]) {

        System.out.println(lengthlongestSubstring("aabccbb"));
        System.out.println(lengthlongestSubstring("abbbb"));

    }

}
