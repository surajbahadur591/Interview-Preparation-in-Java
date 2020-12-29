import java.util.HashSet;

public class LongestConsecutiveElement {

    // longest consecutive elements sequence

    public static int lces(int[] nums) {
        HashSet<Integer> num_set = new HashSet<Integer>();
        for (int num : nums) {
            num_set.add(num);
        }

        int longestStreak = 0;

        for (int num : num_set) {
            if (!num_set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (num_set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }

    public static void main(String[] agrs) {

        int arr[] = { 7, 8, 1, 2, 4, 3, 9, 11, 13, 10 };

        System.out.println(lces(arr));
    }

}
