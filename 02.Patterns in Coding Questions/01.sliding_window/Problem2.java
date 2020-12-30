public class Problem2 {
    // maximum sum of any contiguous subarray of size ‘k’
    

    public static int findMaxSubarray(int arr[], int k) {
        int windowSum = 0, maxSum = 0;
        int windowStart = 0;

        for (int window = 0; window < arr.length; window++) {
            // sum of k continuous sub array
            windowSum = windowSum + arr[window];

            if (window >= k - 1) {
                // compare which is max
                maxSum = Math.max(maxSum, windowSum);

                // remove element going out
                windowSum = windowSum - arr[windowStart];
                // increase start
                windowStart++;
            }
        }

        return maxSum;
    }

    public static void main(String args[]) {
        int arr[] = { 2, 1, 5, 1, 3, 2 };

        System.out.println(findMaxSubarray(arr, 3));

    }

}
