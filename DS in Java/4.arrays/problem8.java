public class problem8 {
    // finding maximum length even-odd subarray
    // [ 5, 10, 20, 6, 3, 8]
    // output - 3 \ 6, 3, 8
    // use kadane algorithms

    static int maxEvenOdd(int arr[], int n) {
        int res = 1;
        int curr = 1;
        for (int i = 1; i < n; i++) {
            if ((arr[i] % 2 == 0 && arr[i - 1] % 2 != 0) || (arr[i] % 2 != 0 && arr[i - 1] % 2 == 0)) {
                curr++;
                res = Math.max(res, curr);
            } else {
                curr = 1;
            }

        }
        return res;
    }

    public static void main(String args[]) {
        int a[] = { 5, 10, 20, 6, 3, 8 };
        int n = 6;

        System.out.println(maxEvenOdd(a, n));

    }
}
