import java.util.HashSet;

public class Problem5 {

    // subarray with given sum
    // 5, 8, 6, 13, 3, 1
    // k =22
    // output - true

    static boolean isSum(int arr[], int n, int k) {

        HashSet<Integer> s = new HashSet<Integer>();
        int prefix_sum = 0;

        for (int i = 0; i < n; i++) {
            prefix_sum += arr[i];
            if (prefix_sum == k)
                return true;
            if (s.contains(prefix_sum - k))
                return true;

            s.add(prefix_sum);
        }
        return false;

    }

    public static void main(String args[]) {
        int a[] = { 5, 8, 6, 0, 2, 1 };
        int k = 7;

        System.out.println(isSum(a, a.length, k));
    }
}
