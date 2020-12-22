import java.util.HashMap;
import java.util.Map;

public class Problem3 {
    // find the length of the longest substring in it with no more than K distinct
    // characters.

    // if k =1, it means only single character should be present in the output and
    // the character can be repeated any number of time
    // if k =2, it means only 2 character should be present in the output and the
    // character can be repeated any number of time

    // "araaci", K=2
    // "araa"
    // 4

    // approach - sliding window+hashmap

    public static int findMaxLength(String str, int k) {
        if (str == null || str.length() == 0 || str.length() < k) {
            throw new IllegalArgumentException();
        }

        int windowStart = 0, maxLength = 0;

        // create a map to count occurance of character
        Map<Character, Integer> charFrequencyMap = new HashMap<>();
        for (int window = 0; window < str.length(); window++) {
            // always put first character in map with 0 or 0+1

            // add until the given size

            char rightChar = str.charAt(window);
            charFrequencyMap.put(rightChar, charFrequencyMap.getOrDefault(rightChar, 0) + 1);

            // if size of map exceed - it means more than k distinct element
            while (charFrequencyMap.size() > k) {
                // while removing element reduce the frequency by 1
                char leftChar = str.charAt(windowStart);
                charFrequencyMap.put(leftChar, charFrequencyMap.get(leftChar) - 1);

                if (charFrequencyMap.get(leftChar) == 0)
                    charFrequencyMap.remove(leftChar);
                windowStart++;
            }
            maxLength = Math.max(maxLength, window - windowStart + 1);

        }

        return maxLength;
    }

    public static void main(String args[]) {
        String s = "araacci";

        System.out.println(findMaxLength(s, 2));
        String s2 = "cbbebi";

        System.out.println(findMaxLength(s2, 3));

    }

}

// problem similar to this

// Given an array of characters where each character represents a fruit tree,
// you are given two baskets and your goal is to put maximum number of fruits in
// each basket. The only restriction is that each basket can have only one type
// of fruit.