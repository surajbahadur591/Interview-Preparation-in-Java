public class Problem1 {

    // subset sum problem
    // [10, 5, 2,3, 6], sum =8
    // output = 2 | 5, 3 and 6,2

    // [10,20,15], sum =0
    // output = 1

    static int findSubset(int arr[], int sum, int n) {
        if (n == 0)
            return (sum == 0) ? 1 : 0;
        return findSubset(arr, sum, n - 1) + findSubset(arr, sum - arr[n - 1], n - 1);

    }

    public static void main(String args[]) {
        int a[] = { 10, 20, 15 };
        int sum = 25;
        int n = 3;
        System.out.print(findSubset(a, sum, n));
    }
}
