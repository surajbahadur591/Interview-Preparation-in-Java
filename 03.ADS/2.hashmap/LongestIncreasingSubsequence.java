public class LongestIncreasingSubsequence {

    // longest continous increasing subsequence

    public static int lcis(int arr[]) {

        int max = 0;
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            count++;
            if (arr[i] < arr[i - 1])
                count = 1;
            if (max < count)
                max = count;
        }
        return max;

    }

    public static void main(String[] agrs) {

        int arr[] = { 1, 2, 3, 5, 4, 5, 6 };

        System.out.println(lcis(arr));
    }

}
