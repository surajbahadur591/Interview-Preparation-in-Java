public class Problem1 {

    // find the index of first occurence
    // [1, 10, 10, 10, 20, 20, 40], x = 20
    // output - 4

    static int firstOcc(int arr[], int n, int x) {

        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > x)
                high = mid - 1;
            else if (arr[mid] < x)
                low = mid + 1;
            else {
                if (mid == 0 || arr[mid - 1] != arr[mid])
                    return mid;
                else
                    high = mid - 1;
            }
        }

        return -1;

    }

    public static void main(String args[]) {
        int a[] = { 5, 10, 10, 20, 20, 20 };
        int x = 20;

        System.out.println(firstOcc(a, a.length, x));
    }

}