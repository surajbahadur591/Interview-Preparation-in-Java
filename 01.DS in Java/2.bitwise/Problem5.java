public class Problem5 {

    // find two oddly occuring number from input array
    // 3, 4, 3, 4, 5, 4, 4, 6, 7, 7
    // output 5, 6

    static void findNumbers(int arr[], int n) {
        int XOR = 0, res1 = 0, res2 = 0;

        for (int i = 0; i < n; i++)
            XOR = XOR ^ arr[i];

        int r0 = (XOR & ~(XOR - 1)); // rightmost set bit , r0 contains one of odd occuring number

        for (int i = 0; i < n; i++) {
            if ((arr[i] & r0) != 0)
                res1 = res1 ^ arr[i];

            else
                res2 = res2 ^ arr[i];

        }
        System.out.println(res1 + " " + res2);

    }

    public static void main(String args[]) {
        int a[] = { 3, 4, 3, 4, 5, 4, 4, 6, 7, 7 };
        findNumbers(a, 10);

    }

}
