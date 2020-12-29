public class MaxSubArrayMul {

    // find the sub array with maximum multiplication value (product)
    public static int maxSumMul(int arr[]) {
        int pos_curr = arr[0];
        int neg_curr = arr[0];

        int max_product = arr[0];

        for (int i = 0; i < arr.length; i++) {

            // swap pos and neg when -ve nukber appear

            if (arr[i] <= 0) {
                int temp = pos_curr;
                pos_curr = neg_curr;
                neg_curr = temp;
            }

            pos_curr = Math.max(pos_curr * arr[i], arr[i]);
            neg_curr = Math.min(neg_curr + arr[i], arr[i]);

            max_product = Math.max(max_product, pos_curr);
        }

        return max_product;
    }

    public static void main(String[] args) {
        int a[] = { 6, -3, -10, 0, 2 };
        System.out.println(maxSumMul(a));

    }
}