import java.util.Arrays;
import java.util.HashMap;

public class UniqueSizeDuplicates {
    // find unique element in windows size k

    public static int[] findUniqueSize(int arr[], int k) {

        int final_arr[] = new int[arr.length - k + 1];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        final_arr[0] = map.size();
        int z = 1;

        for (int i = k; i < arr.length; i++) {
            if (map.get(arr[i - k]) == 1) {
                map.remove(arr[i - k]);
            } else
                map.put(arr[i - k], map.get(arr[i - k]) - 1);

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            final_arr[z] = map.size();
            z++;
        }

        return final_arr;
    }

    public static void main(String[] agrs) {

        int arr[] = { 3, 1, 3, 2, 5, 7, 1, 5, 1, 4, 3, 1, 2 };
        int k = 5;

        System.out.println(Arrays.toString(findUniqueSize(arr, k)));
    }

}
