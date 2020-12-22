public class Problem5 {

    // two pointer technique for sorted array
    // use hashing for unsorted array
    // find the pair with sum = k
    // [2, 5, 8, 12, 20 ]
    // x =17
    // output - true

    static boolean findPair(int arr[], int n, int x) {
        int left = 0, right = n - 1;
        while (left <= right) {
            if (arr[left] + arr[right] == x)
                return true;
            if (arr[left] + arr[right] > x)
                right--;
            else
                left++;

        }

        return false;

    }

    public static void main(String args[]) {
        int a[] = { 2, 5, 8, 12, 20 };
        int x = 17;
        System.out.println(findPair(a, a.length, x));
    }

}
