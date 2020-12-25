public class Problem2 {
    // find missing number

    public static int findMissingNumber(int arr[]) {

        int i = 0;
        while (i < arr.length) {

            if (arr[i] < arr.length && arr[i] != arr[arr[i]])
                swap(arr, i, arr[i]);

            else
                i++;
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[i] != index)
                return index;
        }
        return arr.length;

    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static void main(String args[]) {
        int arr[] = { 0, 3, 2 };

        System.out.print(findMissingNumber(arr));
    }

}
