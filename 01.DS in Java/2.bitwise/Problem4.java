public class Problem4 {

    // print oddly ocurrence number
    // [4, 3, 4, 4, 4, 5, 5]
    // outut = 3

    // use XOR bitwise operator
    static int findOdd(int arr[], int n) {
        int res = 0;
        for (int i = 0; i < n; i++)
            res = res ^ arr[i];

        return res;

    }

    // find missing number from 1 to n
    // each number occur only once
    // [1,4,3]
    // output - 2

    static int findNumber(int arr[], int n) {
        int res = 0;
        for (int i = 1; i <= n + 1; i++)
            res = res ^ i;
        for (int i = 0; i < n; i++)
            res = res ^ arr[i];

        return res;

    }

    public static void main(String args[]) {
        int a[] = { 4, 3, 4, 4, 4, 5, 5 };
        System.out.println(findOdd(a, 7));

        int b[] = { 8, 7, 7, 8, 8 };
        System.out.println(findOdd(b, 5));

        int c[] = { 1, 5, 2, 3 };
        System.out.println(findNumber(c, 4));
        

    }

}
