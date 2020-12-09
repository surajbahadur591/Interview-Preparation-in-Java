import java.util.HashSet;

public class Problem3 {
    // pair with given sum in unsorted array exist or not
    // for sorted 2 pointer approach
    // [3,2,8,15,-8]
    // k = 17 | (2, 15)
    // output- true

    static boolean isPairExist(int arr[], int n, int k) {

        HashSet<Integer> s = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            if (s.contains(k - arr[i]))
                return true;
            s.add(arr[i]);
        }
        return false;

    }

    public static void main(String args[]) {
        int a[] = { 3, 2, 8, 15, -8 };
        int k = 17;

        System.out.println(isPairExist(a, a.length, k));
    }

}
