public class Problem4 {

    // find maximum difference between 2 numbers arr[i] and arr[j] where i < j
    // [2, 3, 10, 6, 4, 8, 1]
    // 8, 2 and 10

    static int findDifference(int arr[], int n) {

        // find minimum value before the current element
        // then update min so far
        // find difference and update

        int minSoFar = arr[0];
        int res = arr[1] - arr[0];
        for (int i = 1; i < n; i++) {
            res = Math.max(res, arr[i] - minSoFar);
            minSoFar = Math.min(minSoFar, arr[i]);

        }
        return res;
    }

    public static void main(String args[]) {
        int a[] = { 2, 3, 10, 6, 4, 8, 1 };
        int n = 7;

        System.out.print(findDifference(a, n));

    }

}

