import java.util.HashSet;

public class LongestConsecutiveElement {

    // longest consecutive elements sequence

    // public static int lces(int[] nums) {
    // HashSet<Integer> num_set = new HashSet<Integer>();
    // for (int num : nums) {
    // num_set.add(num);
    // }

    // int longestStreak = 0;

    // for (int num : num_set) {
    // if (!num_set.contains(num - 1)) {
    // int currentNum = num;
    // int currentStreak = 1;

    // while (num_set.contains(currentNum + 1)) {
    // currentNum += 1;
    // currentStreak += 1;
    // }

    // longestStreak = Math.max(longestStreak, currentStreak);
    // }
    // }

    // return longestStreak;
    // }

    // my version

    public static int lces(int[] nums) {

        int max_length = 0;
        int count = 0;
        int max = nums[0];

        // find maximum element
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max)
                max = nums[i];
        }

        // create arr with max size
        int temp_arr[] = new int[max + 1];

        // fill all with zero
        for (int i = 0; i < temp_arr.length; i++) {
            temp_arr[i] = 0;
        }

        // fill nums elements in temp arr with 1
        for (int i = 0; i < nums.length; i++) {
            int j = nums[i];
            temp_arr[j] = 1;
        }

        for (int i = 0; i < temp_arr.length; i++) {
            if (temp_arr[i] != 0)
                count++;
            else
                count = 0;
            if (max_length < count)
                max_length = count;

        }

        return max_length;
    }

    public static void main(String[] agrs) {

        int arr[] = { 7, 8, 1, 2, 4, 3, 9, 11, 13, 10 };

        System.out.println(lces(arr));
    }

}
