public class MaxSubArray {

    // find the subarray with maximum sum
    // whenever curr value is < 0 move i pointer to j pointer

    public static int maxSumSub(int arr[]) {
        int max_Sum = Integer.MIN_VALUE;

        int curr_value = 0;

        for (int i = 0; i < arr.length; i++) {
            curr_value = curr_value + arr[i];

            if (max_Sum < curr_value) {
                max_Sum = curr_value;
            }

            if (curr_value < 0)
                curr_value = 0;
        }

        return max_Sum;
    }

    public static void main(String[] args) {
        int a[] = { 2, 3, -6, 4, 1, 5, -1, 2, 3, -8, -9, 3 };
        System.out.println(maxSumSub(a));
    }
}
