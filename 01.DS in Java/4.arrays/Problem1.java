public class Problem1 {

    // rotate array left [left rotation]
    
    // [1, 2, 3, 4, 5], d = 2
    // output = [3, ,4 ,5, 1,2]

    // naive sol'n create a function leftrotateby1 then call it d times ( arr[i-1] =
    // arr[i])
    static void rotateLeft(int arr[], int d, int n) {
        int temp[] = new int[d];
        for (int i = 0; i < d; i++)
            temp[i] = arr[i];

        for (int i = d; i < n; i++)
            arr[i - d] = arr[i];

        for (int i = 0; i < d; i++)
            arr[n - d + i] = temp[i];

        for (int i = 0; i < arr.length; i++) // length is the property of the array
            System.out.print(arr[i] + " ");
    }

    // reversal algorithm

    static void leftRotate(int arr[], int d, int n) {
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
        for (int i = 0; i < arr.length; i++) // length is the property of the array
            System.out.print(arr[i] + " ");

    }

    static void reverse(int arr[], int low, int high) {

        while (low < high) {
            swap(arr[low], arr[high]);
            low++;
            high--;
        }

    }

    static void swap(int p, int q) {
        int temp = p;
        p = q;
        q = temp;
    }

    public static void main(String args[]) {
        int a[] = { 1, 2, 3, 4, 5 };
        int d = 2;
        int n = 5;

        rotateLeft(a, d, n);

    }

}
