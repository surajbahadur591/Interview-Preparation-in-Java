public class Problem10 {
    // sliding window technique
    // find the maximum sum of k consecutive elements
    // [1, 8, 30, -5, 20, 7 ]
    // output - 45
    

    // remove an element from left, add element on right

    // other similar problem find whether a given sum is present or not
    // find n-binocci number

    static int findSum(int arr[], int n, int k) {
        int curr_sum = 0, max_sum = 0;
        for (int i = 0; i < k; i++) {
            curr_sum = curr_sum + arr[i];
        }
        max_sum = curr_sum;
        for (int i = k; i < n; i++) {
            curr_sum = curr_sum + arr[i] - arr[i - k];
            max_sum = Math.max(curr_sum, max_sum);
        }
        return max_sum;

    }

    public static void main(String args[]) {
        int a[] = { 1, 8, 30, -5, 20, 7 };
        int n = 6, k = 3;

        System.out.println(findSum(a, n, k));

    }

}
