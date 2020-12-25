public class Problem9 {
    // majority element - if element appear strictly more than half of total size
    // return index of element
    // [ 8, 3, 4, 8, 8]
    // output - 0 or 3 or 4
    

    static int findMajority(int arr[], int n) {
        int res = 0, count = 1;

        for (int i = 1; i < n; i++) {
            if (arr[res] == arr[i])
                count++;
            else
                count--;
            if (count == 0) {
                res = i;
                count = 1;
            }
        }

        count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[res] == arr[i])
                count++;

        }
        if (count < n / 2)
            res = -1;
        return res;
    }

    public static void main(String args[]) {
        int a[] = { 8, 7, 6, 8, 6, 6, 6, 6 };
        int n = 8;

        System.out.println(findMajority(a, n));

    }

}
