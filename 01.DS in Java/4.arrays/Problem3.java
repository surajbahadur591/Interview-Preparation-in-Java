public class Problem3 {

    // find leader in an array
    // leader means all the right side elements is strictly less than current
    // element

    // [7, 10, 4, 3, 6, 5, 2]
    // 10 6 5 2

    // [30, 20, 10]
    // 30 20 10

    // hint - last element is always leader

    static void findLeader(int arr[], int n) {

        int curr_leader = arr[n - 1];
        System.out.print(curr_leader + " ");
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > curr_leader) {
                curr_leader = arr[i];
                System.out.print(curr_leader + " ");
            }
        }

    }

    public static void main(String args[]) {
        int a[] = { 7, 10, 4, 3, 6, 5, 2 };
        int n = 7;

        findLeader(a, n);

    }

}
