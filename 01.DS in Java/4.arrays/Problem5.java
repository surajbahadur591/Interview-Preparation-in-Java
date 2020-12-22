public class Problem5 {

    // very important problem because it is repeated everytime
    // buy and sell stock
    // find maximum profit by buying first and then selling

    // [1, 5, 3, 8, 12 ]
    // [b, s, b, n, s]
    // profit = 13

    // add profit [difference of top and bottom] everytime when the price goes high

    static int maxProfit(int arr[], int n) {
        int profit = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1])
                profit = profit + (arr[i] - arr[i - 1]);
        }
        return profit;
    }

    public static void main(String args[]) {
        int a[] = { 1, 5, 3, 8, 12 };
        int n = 5;

        System.out.print(maxProfit(a, n));

    }
}
