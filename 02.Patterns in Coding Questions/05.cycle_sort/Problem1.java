import java.util.Arrays;

class Problem1 {

    // Cyclic Sort
    // Input: [3, 1, 5, 4, 2]
    // Output: [1, 2, 3, 4, 5]

    // 1 to n numbers with unique element

    public static void sortInplace(int arr[]) {

        int i = 0;
        while (i < arr.length - 1) {
            // index at which the number should be inserted
            int j = arr[i] - 1;
            if (arr[i] != arr[j])
                swap(arr, i, j);
            else
                i++;
        }

    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static void main(String args[]) {
        int arr[] = { 3, 1, 5, 4, 2 };
        sortInplace(arr);
        System.out.println(Arrays.toString(arr));
    }

}
