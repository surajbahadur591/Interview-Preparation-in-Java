public class Problem1 {
    //
    // 0/1 knapsack

    public static int knapsack(int wt[], int price[], int bag_size, int n) {
        if (bag_size == 0 || n == 0)
            return 0;

        if (wt[n - 1] <= bag_size)
            return Math.max(price[n - 1] + knapsack(wt, price, bag_size - wt[n - 1], n - 1),
                    knapsack(wt, price, bag_size, n - 1));

        else
            return knapsack(wt, price, bag_size, n - 1);
    }

    public static void main(String[] args) {

        int wt[] = { 1, 3, 4, 5 };
        int price[] = { 1, 4, 5, 7 };
        int bag_size = 7;
        System.out.println(knapsack(wt, price, bag_size, wt.length));

    }

}
