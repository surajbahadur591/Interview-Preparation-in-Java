public class Problem7 {
    // find maximum sum subarray | elements can be -ve and +ve
    // return only maximum profit no need of index

    
    // [2,3,-8,7,-1,2,3]
    // output - 11

    // -3, 8, -2, 4, -5, 6
    // 11

    static int maxSum(int arr[], int n) {
        int finalMax = arr[0];
        // using max of previous + arr[i]to find max at present index
        int maxEnding[] = new int[n];
        maxEnding[0] = arr[0];
        for (int i = 1; i < n; i++) {
            maxEnding[i] = Math.max(maxEnding[i - 1] + arr[i], arr[i]);
            finalMax = Math.max(maxEnding[i], finalMax);
        }

        return finalMax;

    }

    public static void main(String args[]) {
        int a[] = { -3, 8, -2, 4, -5, 6 };
        int n = 6;

        System.out.println(maxSum(a, n));

    }

}
