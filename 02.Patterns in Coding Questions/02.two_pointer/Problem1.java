
public class Problem1 {

    // Pair with Target Sum
    // Input: [1, 2, 3, 4, 6], target=6
    // Output: [1, 3]

    public static int[] pairSum(int arr[], int k) {
        int leftPointer = 0, rightPointer = arr.length - 1;
        while (leftPointer < rightPointer) {
            int currentSum = arr[leftPointer] + arr[rightPointer];

            if (currentSum == k) {
                return new int[] { leftPointer, rightPointer };
            }
            if (k > currentSum) {
                leftPointer++;
            } else
                rightPointer--;

        }

        return new int[] { -1, -1 };
    }

    public static void main(String args[]) {

        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int k = 6;

        int res[] = pairSum(arr, k);
        System.out.println("[" + res[0] + "," + res[1] + "]");

    }

}
