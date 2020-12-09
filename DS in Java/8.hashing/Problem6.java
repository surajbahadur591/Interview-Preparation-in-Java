import java.util.HashMap;

public class Problem6 {
    // longest subarray with given sum
    // 5, 8, -4, -4, 9, 2, 2
    // k =0
    // output - 3

    static int longestSubarray(int arr[], int n, int k) {

        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        int prefix_sum = 0, res = 0;

        for (int i = 0; i < n; i++) {
            prefix_sum += arr[i];
            if (prefix_sum == k) {
                res = i + 1;

            }

            if (m.containsKey(prefix_sum) == false)
                m.put(prefix_sum, i);
            if (m.containsKey(prefix_sum - k)) {
                int z = prefix_sum - k;
                res = Math.max(res, i - (m.get(z)));

            }

        }
        return res;

    }

    public static void main(String args[]) {
        int a[] = { 8, 3, 1, 5, -6, 6, 2, 2 };
        int k = 4;

        System.out.println(longestSubarray(a, a.length, k));
    }

}
