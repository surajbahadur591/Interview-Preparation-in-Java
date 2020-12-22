public class Problem2 {

    // write a function to move all zeroes to end without changing the order of
    // remaining elements
    // arr = [10, 5, 0, 0, 8, 0, 9, 0]
    // output - 10 5 8 9 0 0 0 0

    static void moveZeroes(int arr[], int n) {

        int j = 0; // is the location of zero eleemnt
        int temp;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) { // finding non zero
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

    }

    public static void main(String args[]) {
        int a[] = { 10, 5, 0, 0, 8, 0, 9, 0 };
        int n = 8;

        moveZeroes(a, n);
        for (int i = 0; i < a.length; i++) // length is the property of the array
            System.out.print(a[i] + " ");

    }

}
