import java.util.HashSet;

public class Problem2 {

    // count of union element in 2 unsorted array
    // 15, 20, 5, 15
    // 15 15 15 20 10
    // output - 4 \ 15 20 5 10

    static int union(int arr[], int arr2[], int m, int n) {

        HashSet<Integer> s = new HashSet<Integer>();
        for (int i = 0; i < m; i++)
            s.add(arr[i]);
        for (int i = 0; i < n; i++)
            s.add(arr2[i]);
        return s.size();

    }

    public static void main(String args[]) {
        int a[] = { 15, 20, 5, 15 };
        int b[] = { 15, 15, 15, 20, 10 };

        System.out.println(union(a, b, a.length, b.length));
    }

}

