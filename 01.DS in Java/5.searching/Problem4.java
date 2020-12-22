public class Problem4 {

    // search in a sorted rotated array
    // [10, 20, 30, 40, 50, 8, 9]
    // x=30
    // output - 2
    static int search(int arr[], int n, int x) {

        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x)
                return mid;

            if (arr[low] < arr[mid]) {
                if (x > arr[low] && x < arr[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            } else {
                if (x > arr[mid] && x <= arr[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }

        }

        return -1;

    }

    public static void main(String args[]) {
        int a[] = { 100, 200, 500, 2000, 10, 20, 30 };
        int x = 20;
        System.out.println(search(a, a.length, x));
    }

}
