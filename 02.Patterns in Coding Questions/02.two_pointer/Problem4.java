import java.util.Arrays;

public class Problem4 {

    // dutch national flag
    // Input: [1, 0, 2, 1, 0]
    // Output: [0 0 1 1 2]

    public static void DNF(int arr[]) {

        int low = 0, high = arr.length - 1;

        for (int i = 0; i <= high;) {
            if (arr[i] == 0) {
                swap(arr, i, low);
                i++;
                low++;
            } else if (arr[i] == 1) {
                i++;
            } else {
                swap(arr, i, high);
                high--;
            }

        }

    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String args[]) {

        int arr[] = { 1, 0, 2, 1, 0 };
        DNF(arr);
        System.out.print(Arrays.toString(arr));

    }

}
