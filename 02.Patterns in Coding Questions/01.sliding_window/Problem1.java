import java.util.Arrays;

public class Problem1 {
    // sliding window technique

    // Given an array, find the average of all contiguous subarrays of size ‘K’ in
    // it.

    public static double[] findAverage(int arr[], int k) {
        // resultant array will be always less by k elements
        double result[] = new double[arr.length - k + 1];

        double windowSum = 0;
        int windowStart = 0;

        for (int window = 0; window < arr.length; window++) {

            // add upto k element in sum
            windowSum = windowSum + arr[window];

            // windows exceeds the size
            if (window >= k - 1) {
                result[windowStart] = windowSum / k;
                windowSum = windowSum - arr[windowStart];
                // add at front, remove from back
                windowStart++;
            }
        }

        return result;
    }

    public static void main(String args[]) {

        int arr[] = { 1, 3, 2, 6, -1, 4, 1, 8, 2 };
        int k = 5;

        double finalResult[] = findAverage(arr, k);

        System.out.println(Arrays.toString(finalResult));

    }

    
}
