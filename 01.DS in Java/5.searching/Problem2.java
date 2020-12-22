public class Problem2 {

    // find the index of last occurence
    // [10, 15, 20, 20, 40, 40], x = 20
    // output - 3

    static int lastOcc(int arr[], int n, int x) {

        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] < x)
                low = mid + 1;
            else if (arr[mid] > x)
                high = mid - 1;
            else {
                if (mid != n - 1 || arr[mid] != arr[mid + 1])
                    return mid;
                else
                    low = mid + 1;
            }
        }

        return -1;

    }

    public static void main(String args[]) {
        int a[] = { 10, 15, 20, 20, 40, 40 };
        int x = 20;

        System.out.println(lastOcc(a, a.length, x));
    }

}
