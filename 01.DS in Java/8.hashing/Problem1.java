import java.util.HashSet;

public class Problem1 {

    // count of intersection element of two unsorted array
    // int a[] = { 10, 15, 20, 15, 30, 30, 5 };
    // int b[] = { 30, 5, 30, 80 };
    // output- 2 | 30 and 5

    static int intersection(int arr[], int arr2[], int m, int n) {

        HashSet<Integer> s = new HashSet<Integer>();
        for (int i = 0; i < m; i++)
            s.add(arr[i]);
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (s.contains(arr2[i])) {
                res++;
                s.remove(arr2[i]);
            }
        }

        return res;
    }

    public static void main(String args[]) {
        int a[] = { 10, 15, 20, 15, 30, 30, 5 };
        int b[] = { 30, 5, 30, 80 };

        System.out.println(intersection(a, b, a.length, b.length));
    }

}
