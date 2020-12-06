public class Problem6 {

    // find the median of two sorted array
    // arr1 = [10, 20, 30, 40, 50]
    // arr2 = [5, 15, 25, 35, 45]
    // [5, 10, 15, 20, 25, 30, 35, 40, 45, 50]
    // output = 25+30 / 2 = 27.5

    static float findMedian(int arr[], int arr2[], int n1, int n2) {
        float median;
        int i = 0, j = 0, z = 0;
        int arr3[] = new int[n1 + n2];
        while (i < n1 && j < n2) {
            if (arr[i] < arr2[j]) {
                arr3[z] = arr[i];
                i++;
                z++;
            } else {
                arr3[z] = arr2[j];
                j++;
                z++;
            }

        }
        int length = arr3.length;
        if (length % 2 == 0) {
            length = length / 2;
            median = ((arr3[length] + arr3[length - 1]));
            median = median / 2;
        } else {
            length = length / 2;
            median = arr3[(length)];

        }

        return median;

    }

    public static void main(String args[]) {
        int a[] = { 10, 20, 30, 40, 50 };
        int b[] = { 5, 15, 25, 35, 45 };
        // int x = 17;
        System.out.println(findMedian(a, b, a.length, b.length));
    }
}
