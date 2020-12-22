public class Problem1 {
    // find intersection of two sorted array | find common element in two sorted
    // array
    static int findIntersection(int arr[], int arr2[], int n1, int n2) {
        int i = 0, j = 0;

        while (i < n1 && j < n2) {
            if (i > 0 && arr[i - 1] == arr[i]) {
                i++;
                continue;
            }
            if (arr[i] < arr2[j]) {
                i++;
            } else if (arr[i] > arr2[j]) {
                j++;
            } else {

                return arr[i];
            }

        }
        return -1;
    }

    public static void main(String args[]) {
        int a[] = { 10, 20, 30, 40, 50 };
        int b[] = { 50, 15, 25, 35, 45 };
        // int x = 17;
        System.out.println(findIntersection(a, b, a.length, b.length));
    }

}
