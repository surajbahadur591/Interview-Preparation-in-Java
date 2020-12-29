import java.util.HashSet;

public class Problem4 {
    // subarray with sum '0'
    // [ 1, 4, 13, -3, -10, 5]
    // output - true;
    // use prefix sum if same number exist then sum 0 exist

    static boolean isSumZero(int arr[], int n) {

        HashSet<Integer> s = new HashSet<Integer>();
        int prefix_sum = 0;

        for (int i = 0; i < n; i++) {
            prefix_sum += arr[i];
            if (s.contains(prefix_sum))
                return true;
            if (prefix_sum == 0)
                return true;
            s.add(prefix_sum);
        }
        return false;

    }

    public static void main(String args[]) {
        int a[] = { 1, 4, 13, -3, -10, 5 };
        // int k = 17;

        System.out.println(isSumZero(a, a.length));
    }

}

